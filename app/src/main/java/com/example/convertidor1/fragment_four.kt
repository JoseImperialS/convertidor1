package com.example.convertidor1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class fragment_four : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_four, container, false)

        val cantidadlt = view.findViewById<EditText>(R.id.cantidad)
        val galon = view.findViewById<Button>(R.id.galon)
        val res = view.findViewById<EditText>(R.id.resultado)

        galon.setOnClickListener {

            val galonesText = cantidadlt.text.toString()

            if (galonesText.isNotEmpty()) {

                val galones = galonesText.toDouble()


                val litros = galones * 3.78541


                res.setText(String.format("%.2f litros", litros))
            } else {
                
                Toast.makeText(requireContext(), "Ingresa un valor en galones", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

}