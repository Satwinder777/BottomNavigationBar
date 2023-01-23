package com.fragmentyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.fragment ) as NavHostFragment
//        navController = navHostFragment.navController
//
//    }
//}

        val firstFragment=HomeFragment()
        val secondFragment=FruitFragment()
        val thirdFragment=CartFragment()
        val fourFragment = UserFragment()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.HomeBar->setCurrentFragment(firstFragment)
                R.id.JuiceBar->setCurrentFragment(secondFragment)
                R.id.CartBar->setCurrentFragment(thirdFragment)
                R.id.UserBar->setCurrentFragment(fourFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}