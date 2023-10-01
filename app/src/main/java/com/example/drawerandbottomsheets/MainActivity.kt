package com.example.drawerandbottomsheets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.drawerandbottomsheets.databinding.ActivityMainBinding
import java.security.AccessController

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNavigation()

    }

    private fun setNavigation() {

        binding.apply {

            ivMenu.setOnClickListener {

                dlDrawerLayout.openDrawer(GravityCompat.START)

            }

            NavigationView.itemIconTintList = null

            val navController =
                (supportFragmentManager.findFragmentById(R.id.nvNavHostFragment) as NavHostFragment).navController
            NavigationUI.setupWithNavController(NavigationView, navController)

        }

    }

}