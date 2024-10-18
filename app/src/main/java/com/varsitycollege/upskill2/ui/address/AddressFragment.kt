package com.varsitycollege.upskill2.ui.address

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.varsitycollege.upskill2.R

class AddressFragment : Fragment() {

    private lateinit var imageViewRosebank: ImageView
    private lateinit var imageViewRivonia: ImageView
    private lateinit var imageViewBryanston: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize ImageViews
        imageViewRosebank = view.findViewById(R.id.imageViewRosebank)
        imageViewRivonia = view.findViewById(R.id.imageViewRivonia)
        imageViewBryanston = view.findViewById(R.id.imageViewBryanston)

        // Set the images for each campus
        imageViewRosebank.setImageResource(R.drawable.rosebank_image)
        imageViewRivonia.setImageResource(R.drawable.rivonia_image)
        imageViewBryanston.setImageResource(R.drawable.bryanston_image)
    }
}
