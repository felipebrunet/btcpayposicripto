package com.example.btcpayposicripto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_BtcpayPOSIcripto)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreLocalInicial : String = findViewById<TextView>(R.id.tituloLocal).text.toString()



        val adjustScreenButton = findViewById<Button>(R.id.botonAjustes)
        adjustScreenButton.setOnClickListener {
            val intent = Intent(this,ActividadAjustes::class.java)
            intent.putExtra("data", nombreLocalInicial)
            startActivity(intent)
        }
        val storeURL = "https://btcpay.icripto.cl/api/v1/invoices?storeId=D8EcMfioGdoiXN9v1ejMth6ZBaVADfsxjocLxbw5h5yH"
        val input: TextView = findViewById(R.id.input)
        val buttonBotondepago: Button = findViewById(R.id.link_twitter)
        val button1: Button = findViewById(R.id.button_1)
        val button2: Button = findViewById(R.id.button_2)
        val button3: Button = findViewById(R.id.button_3)
        val button4: Button = findViewById(R.id.button_4)
        val button5: Button = findViewById(R.id.button_5)
        val button6: Button = findViewById(R.id.button_6)
        val button7: Button = findViewById(R.id.button_7)
        val button8: Button = findViewById(R.id.button_8)
        val button9: Button = findViewById(R.id.button_9)
        val button0: Button = findViewById(R.id.button_0)
        val buttonDot: Button = findViewById(R.id.button_dot)
        val buttonBorrar: Button = findViewById(R.id.button_borrar)
        val option : Spinner = findViewById(R.id.spinner_currencies)
        val options = arrayOf("CLP", "USD", "ARS", "EUR", "BRL", "BTC")

        val nombreLocal : String = intent.getStringExtra("data") ?: ""

        val nombreLocalText : TextView = findViewById(R.id.tituloLocal)
        if (nombreLocal != "") {
            nombreLocalText.text = nombreLocal
        }



        var monedaPredefined = "CLP"

        option.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                monedaPredefined = options[p2]
            }
        }


        buttonBorrar.setOnClickListener {
            input.text = ""
            input.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
        button1.setOnClickListener {
            input.text = addToInputText("1", input)
        }
        button2.setOnClickListener {
            input.text = addToInputText("2", input)
        }
        button3.setOnClickListener {
            input.text = addToInputText("3", input)
        }
        button4.setOnClickListener {
            input.text = addToInputText("4", input)
        }
        button5.setOnClickListener {
            input.text = addToInputText("5", input)
        }
        button6.setOnClickListener {
            input.text = addToInputText("6", input)
        }
        button7.setOnClickListener {
            input.text = addToInputText("7", input)
        }
        button8.setOnClickListener {
            input.text = addToInputText("8", input)
        }
        button9.setOnClickListener {
            input.text = addToInputText("9", input)
        }

        button0.setOnClickListener {
            if (input.text.isEmpty()) {
                // Show Error Message
                input.text = addToInputText("", input)
            }
            else {
                input.text = addToInputText("0", input)
            }
        }

        buttonDot.setOnClickListener {
            if (input.text.isEmpty()) {
                input.text = addToInputText("0.", input)
            } else {
                input.text = addToInputText(".", input)
            }
        }

        buttonBotondepago.setOnClickListener{
            if (input.text.isNotEmpty()) {
                try {
                    val price: Float = input.text.toString().toFloat()
                    if (price > 0) {
//                        val urlIcripto = "http://guibnloxo4hwe3ashh2rlg2abqqykzhldmsbcqne2togzdrdja22ohyd.onion/api/v1/invoices?storeId=D8EcMfioGdoiXN9v1ejMth6ZBaVADfsxjocLxbw5h5yH&price=${price}&currency=${monedaPredefined}"
                        val urlIcripto = "${storeURL}&price=${price}&currency=${monedaPredefined}"
                        startActivity(Intent.parseUri(urlIcripto, 0))
                    }
                } catch (e: Exception) {
                    input.text = "Error"
                    input.setTextColor(ContextCompat.getColor(this, R.color.red))
                }

            }
        }
    }

    private fun addToInputText(buttonValue: String, input: TextView): String {
        return "${input.text}$buttonValue"
    }

}