package com.felipebrunet.btcpayposicripto

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_BtcpayPOSIcripto)
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)

        val adjustScreenButton = findViewById<Button>(R.id.botonAjustes)
        adjustScreenButton.setOnClickListener {
            val intent = Intent(this,ActividadAjustes::class.java)
            startActivity(intent)
        }

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

        val defaultMoneda = "USD"
        val defaultLocal = "Restaurant A"
        val defaultServer = ""
        val defaultStoreId = ""
//        val defaultTips = "no"

//        Loading preexisting settings. If there are none, then load the default (view the "default... constants) values.
        val sharedPreferences : SharedPreferences = getSharedPreferences("sharedPres", Context.MODE_PRIVATE)
        val nombreLocal = sharedPreferences.getString("LOCALNOMBRE", defaultLocal).toString()
        val moneda = sharedPreferences.getString("LOCALMONEDA", defaultMoneda).toString()
        val server = sharedPreferences.getString("LOCALSERVER", defaultServer).toString()
        val localID = sharedPreferences.getString("LOCALID", defaultStoreId).toString()
//        val tips = sharedPreferences.getString("STATUSTIPS", defaultTips).toString()


        findViewById<TextView>(R.id.moneda).text = moneda
        findViewById<TextView>(R.id.tituloLocal).text = nombreLocal


//        Setting the functions of buttons
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


//        Setting the function of the "Pay" button
        buttonBotondepago.setOnClickListener{
            if (input.text.isNotEmpty()) {
                try {
                    val price: Float = input.text.toString().toFloat()
                    if (price > 0) {
                        val urlIcripto = "${server}/api/v1/invoices?storeId=${localID}&price=${price}&checkoutDesc=${nombreLocal}&currency=${moneda}"
                        startActivity(Intent.parseUri(urlIcripto, 0))
                    }
                } catch (e: Exception) {
                    input.text = "Error"
                    input.setTextColor(ContextCompat.getColor(this, R.color.red))
                }

            }
        }
    }


//    Generic function for adding text to the checkout screen
    private fun addToInputText(buttonValue: String, input: TextView): String {
        return "${input.text}$buttonValue"
    }

}