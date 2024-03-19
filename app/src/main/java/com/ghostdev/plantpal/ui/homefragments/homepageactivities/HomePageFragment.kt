package com.ghostdev.plantpal.ui.homefragments.homepageactivities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.facebook.shimmer.ShimmerFrameLayout
import com.ghostdev.plantpal.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding
    private lateinit var shimmerFrameLayout: ShimmerFrameLayout
    private lateinit var shimmerFrameLayout2: ShimmerFrameLayout
    private lateinit var notificationImage: ImageView
    private lateinit var bookmarkImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)

        shimmerFrameLayout = binding!!.shimmerLayout
        shimmerFrameLayout2 = binding!!.shimmerLayout2
        notificationImage = binding!!.notificationImage
        bookmarkImage = binding!!.bookmarkImage

        shimmerFrameLayout.startShimmerAnimation()
        shimmerFrameLayout2.startShimmerAnimation()

        val handler = Handler()

        handler.postDelayed({
            shimmerFrameLayout.stopShimmerAnimation()
            shimmerFrameLayout2.stopShimmerAnimation()
        }, 3000)

        notificationImage.setOnClickListener {
            val intent = Intent(requireContext(), NotificationsActivity::class.java)
            startActivity(intent)
        }

        bookmarkImage.setOnClickListener {
            val intent = Intent(requireContext(), BookmarksActivity::class.java)
            startActivity(intent)
        }


        return binding!!.root
    }
}