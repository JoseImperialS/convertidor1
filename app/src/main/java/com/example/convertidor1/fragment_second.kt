package com.example.convertidor1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class fragment_second : Fragment() {// TODO: Rename parameter arguments, choose names that match


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val cantidadcm = view.findViewById<EditText>(R.id.cantidad)
        val btnpulgadas = view.findViewById<Button>(R.id.btnpulgadas)
        val btnpies = view.findViewById<Button>(R.id.btnpies)
        val res = view.findViewById<EditText>(R.id.resultado)
        val valorkm = view.findViewById<EditText>(R.id.editTextNumberDecimal_km)
        val btnmillas = view.findViewById<Button>(R.id.btnmillas)
        val reskm = view.findViewById<EditText>(R.id.resultado_kmmlls)
        val valorm = view.findViewById<EditText>(R.id.editTextNumberDecimal_yarda)
        val btnyardas = view.findViewById<Button>(R.id.btnyardas)
        val resm = view.findViewById<EditText>(R.id.editTextres_yarda)

        btnpulgadas.setOnClickListener {
            val cmText = cantidadcm.text.toString()

            if (cmText.isNotEmpty()) {
                val centimetros = cmText.toDouble()
                val pulgadas = centimetros / 2.54
                res.setText(String.format("%.2f pulgadas", pulgadas))
            } else {
                Toast.makeText(
                    requireContext(),
                    "Ingresa un valor en centímetros",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        btnpies.setOnClickListener {
            val cmText = cantidadcm.text.toString()
            if (cmText.isNotEmpty()) {
                val centimetros = cmText.toDouble()
                val pies = centimetros / 30.48
                res.setText(String.format("%.2f pies", pies))
            } else {
                Toast.makeText(
                    requireContext(),
                    "Ingresa un valor en centímetros",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        btnmillas.setOnClickListener {
            val kmText = valorkm.text.toString()
            if (kmText.isNotEmpty()) {
                val km = kmText.toDouble()
                val millas = km * 0.621371 // 1 kilómetro = 0.621371 millas
                reskm.setText(millas.toString())
            }
        }
        btnyardas.setOnClickListener {
            val mText = valorm.text.toString()
            if (mText.isNotEmpty()){
                val m = mText.toDouble()
                val yardas = m * 1.094
                resm.setText(yardas.toString())
            }
        }
            return view

    }
}



