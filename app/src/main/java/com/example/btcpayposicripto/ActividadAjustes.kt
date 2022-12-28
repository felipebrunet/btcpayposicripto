package com.example.btcpayposicripto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class ActividadAjustes : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_ajustes)

        val volverButton = findViewById<Button>(R.id.botonVolver)
        volverButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val option : Spinner = findViewById(R.id.spinner_currencies2)
        val options = arrayOf("CLP", "USD", "ARS", "EUR", "BRL", "BTC")
        var monedaPredefinedAux = "CLP"

        option.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                monedaPredefinedAux = options[p2]
            }
        }
        val guardarButton = findViewById<Button>(R.id.botonGuardar)
        guardarButton.setOnClickListener {
            openMainActivitySaved()
        }

    }

    private fun openMainActivitySaved() {
        val editTextLocal = findViewById<EditText>(R.id.NLocal)
        val local = editTextLocal.text.toString()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("data", local)
        startActivity(intent)
    }
}