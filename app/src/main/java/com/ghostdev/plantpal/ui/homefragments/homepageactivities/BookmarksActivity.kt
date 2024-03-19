package com.ghostdev.plantpal.ui.homefragments.homepageactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.ghostdev.plantpal.R
import com.ghostdev.plantpal.databinding.ActivityBookmarksBinding

class BookmarksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookmarksBinding
    private lateinit var articlesLayout: LinearLayout
    private lateinit var plantsLayout: LinearLayout
    private var isSelected: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookmarksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        articlesLayout = binding.articlesLayout
        plantsLayout = binding.plantLayout

        plantsLayout.setOnClickListener {
            plantsLayout.setBackgroundColor(resources.getColor(R.color.primary))
            articlesLayout.setBackgroundColor(resources.getColor(R.color.white))

            binding.plantSelectText.setTextColor(resources.getColor(R.color.white))
            binding.articleSelectText.setTextColor(resources.getColor(R.color.black))

            isSelected = false
        }

        articlesLayout.setOnClickListener {
            plantsLayout.setBackgroundColor(resources.getColor(R.color.white))
            articlesLayout.setBackgroundColor(resources.getColor(R.color.primary))

            binding.plantSelectText.setTextColor(resources.getColor(R.color.black))
            binding.articleSelectText.setTextColor(resources.getColor(R.color.white))

            isSelected = true
        } 

    }
}