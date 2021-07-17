package com.example.employeeexample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.employeeexample.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_layout.*

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val navController = NavHostFragment.findNavController(nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        toolbar
            .setupWithNavController(navController, appBarConfiguration)
    }
}
