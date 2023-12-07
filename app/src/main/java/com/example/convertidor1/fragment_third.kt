package com.example.convertidor1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class fragment_third : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val cantidadgr = view.findViewById<EditText>(R.id.cantidad)
        val onzas = view.findViewById<Button>(R.id.onzas)
        val libras = view.findViewById<Button>(R.id.libras)
        val res = view.findViewById<EditText>(R.id.resultado)


        onzas.setOnClickListener {

            val gramosText = cantidadgr.text.toString()

            if (gramosText.isNotEmpty()) {

                val gramos = gramosText.toDouble()


                val onzas = gramos / 28.3495


                res.setText(String.format("%.2f onzas", onzas))
            } else {

                Toast.makeText(requireContext(), "Ingresa un valor en gramos", Toast.LENGTH_SHORT).show()
            }
        }

        libras.setOnClickListener {

            val gramosText = cantidadgr.text.toString()

            if (gramosText.isNotEmpty()) {

                val gramos = gramosText.toDouble()

                val libras = gramos / 453.592

                res.setText(String.format("%.2f libras", libras))
            } else {
                Toast.makeText(requireContext(), "Ingresa un valor en gramos", Toast.LENGTH_SHORT).show()
            }
        }


        return view
    }



}