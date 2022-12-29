package com.example.btcpayposicripto

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ActividadAjustes : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_ajustes)

        val defaultMoneda = "CLP"
        val defaultRestaurant = ""
        val defaultServer = "https://btcpay.icripto.cl"
        val defaultStoreId = "D8EcMfioGdoiXN9v1ejMth6ZBaVADfsxjocLxbw5h5yH"


        val sharedPreferences : SharedPreferences = getSharedPreferences("sharedPres", Context.MODE_PRIVATE)
        val savedLocal: String? = sharedPreferences.getString("LOCALNOMBRE", defaultRestaurant)
        val savedMoneda: String? = sharedPreferences.getString("LOCALMONEDA", defaultMoneda)
        val savedServer: String? = sharedPreferences.getString("LOCALSERVER", defaultServer)
        val savedID: String? = sharedPreferences.getString("LOCALID", defaultStoreId)


        findViewById<EditText>(R.id.NLocal).setText(savedLocal)
        findViewById<EditText>(R.id.URLServicio).setText(savedServer)
        findViewById<EditText>(R.id.IDTienda).setText(savedID)


        val option : Spinner = findViewById(R.id.spinner_currencies2)
        val options = arrayOf("CLP", "USD", "ARS", "EUR", "BRL", "BTC")
        var moneda1 : String = savedMoneda.toString()



        val volverButton = findViewById<Button>(R.id.botonVolver)
        volverButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        option.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                moneda1 = options[p2]
            }
        }

        val guardarButton = findViewById<Button>(R.id.botonGuardar)
        guardarButton.setOnClickListener {
            openMainActivitySaved(moneda1)
        }

    }


    private fun openMainActivitySaved(moneda : String) {
        val intent = Intent(this, MainActivity::class.java)
        val local = findViewById<EditText>(R.id.NLocal).text.toString()
        val server = findViewById<EditText>(R.id.URLServicio).text.toString()
        val idTienda = findViewById<EditText>(R.id.IDTienda).text.toString()
        intent.putExtra("data1", local)
        intent.putExtra("data2", moneda)
        intent.putExtra("data3", server)
        intent.putExtra("data4", idTienda)
        saveData(moneda)
        startActivity(intent)
    }

    private fun saveData(moneda: String) {
        val nombreLocal : String = findViewById<EditText>(R.id.NLocal).text.toString()
        val nombreServidor : String = findViewById<EditText>(R.id.URLServicio).text.toString()
        val nombreIdTienda : String = findViewById<EditText>(R.id.IDTienda).text.toString()
        val sharedPreferences : SharedPreferences = getSharedPreferences("sharedPres", Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        editor.apply{
            putString("LOCALNOMBRE", nombreLocal)
        }.apply()
        editor.apply{
            putString("LOCALMONEDA", moneda)
        }.apply()
        editor.apply{
            putString("LOCALSERVER", nombreServidor)
        }.apply()
        editor.apply{
            putString("LOCALID", nombreIdTienda)
        }.apply()


        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
    }


}