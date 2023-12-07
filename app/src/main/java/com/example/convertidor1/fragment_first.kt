package com.example.convertidor1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class fragment_first : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        // Inflate the layout for this fragment
        val second = view.findViewById<Button>(R.id.longitud)
        val third = view.findViewById<Button>(R.id.masa)
        val four = view.findViewById<Button>(R.id.volumen)

        second.setOnClickListener {
            val controller: NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_fragment_first_to_fragment_second)
        }

        third.setOnClickListener {
            val controller: NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_fragment_first_to_fragment_third)
        }
        four.setOnClickListener {
            val controller: NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_fragment_first_to_fragment_four)
        }

        return view
    }
}