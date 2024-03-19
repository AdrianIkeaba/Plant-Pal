package com.ghostdev.plantpal.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.ghostdev.plantpal.R
import com.ghostdev.plantpal.adapter.HomePageAdapter
import com.ghostdev.plantpal.databinding.ActivityHomePageBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    private lateinit var bottomNav: BottomNavigationView
    private lateinit var viewPager: ViewPager2
    private lateinit var homePageAdapter: HomePageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNav = binding.bottomNavigation
        viewPager = binding.viewPager
        homePageAdapter = HomePageAdapter(this)

        //ViewPager Init
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = homePageAdapter
        viewPager.isUserInputEnabled = false

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    viewPager.currentItem = 0

                    true
                }

                R.id.page_2 -> {
                    viewPager.currentItem = 1

                    true
                }

                R.id.page_3 -> {


                    true
                }

                R.id.page_4 -> {


                    true
                }

                R.id.page_5 -> {


                    true
                }

                else -> false
            }
        }
    }
}