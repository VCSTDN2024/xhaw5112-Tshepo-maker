package com.varsitycollege.upskill2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.varsitycollege.upskill2.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up SearchView
        val searchView: SearchView = view.findViewById(R.id.searchView)

        // Handle search queries
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    searchCourses(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    filterCourses(newText)
                }
                return false
            }
        })

        // Set up buttons and their click listeners
        val gardeningButton: Button = view.findViewById(R.id.gardeningBtn)
        gardeningButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val cookingButton: Button = view.findViewById(R.id.cookingBtn)
        cookingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val sewingButton: Button = view.findViewById(R.id.sewingBtn)
        sewingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val landscappingButton: Button = view.findViewById(R.id.landscappingBtn)
        landscappingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val lifeskillButton: Button = view.findViewById(R.id.lifeskillsBtn)
        lifeskillButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val childmindingButton: Button = view.findViewById(R.id.childmindingBtn)
        childmindingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val firstaidButton: Button = view.findViewById(R.id.firstaidBtn)
        firstaidButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }
    }

    // Function to handle search logic
    private fun searchCourses(query: String) {
        // Replace this with your actual search logic
        Toast.makeText(requireContext(), "Searching for: $query", Toast.LENGTH_SHORT).show()
    }

    // Function to handle filtering as text changes
    private fun filterCourses(newText: String) {
        // Replace this with actual filtering logic
        Toast.makeText(requireContext(), "Filtering: $newText", Toast.LENGTH_SHORT).show()
    }
}
