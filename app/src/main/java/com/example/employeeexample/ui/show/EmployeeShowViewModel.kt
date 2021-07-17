package com.example.employeeexample.ui.show

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.employeeexample.data.Employee
import com.example.employeeexample.data.show.EmployeeShowRepository

class EmployeeShowViewModel(application: Application): AndroidViewModel(application){
    private val repo: EmployeeShowRepository =
        EmployeeShowRepository(
            application
        )

    private val _employeeId = MutableLiveData<Long>(0)
    val employeeId: LiveData<Long>
        get() = _employeeId

    val employee: LiveData<Employee> = Transformations
        .switchMap(_employeeId) { id ->
            repo.getEmployee(id)
        }

    fun setEmployeeId(id: Long){
        if(_employeeId.value != id ) {
            _employeeId.value = id
        }
    }
}