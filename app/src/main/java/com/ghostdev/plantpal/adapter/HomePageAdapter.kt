package com.ghostdev.plantpal.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ghostdev.plantpal.ui.homefragments.diagnoseactivities.DiagnoseFragment
import com.ghostdev.plantpal.ui.homefragments.homepageactivities.HomePageFragment

class HomePageAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    private val fragmentSize = 5
    override fun getItemCount(): Int {
        return fragmentSize
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> HomePageFragment()
            1 -> DiagnoseFragment()
//            2 -> IdentifyPlantFragment()
//            3 -> MyPlantsFragment()
//            4 -> MyAccountFragment()

            else -> HomePageFragment()
        }
    }
}