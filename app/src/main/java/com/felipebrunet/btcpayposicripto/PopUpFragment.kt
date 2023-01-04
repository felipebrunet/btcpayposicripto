package com.felipebrunet.btcpayposicripto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment


class PopUpFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_pop_up, container, false)
        var tip : Double
        val tipMessage : String = getString(R.string.tip_message)
        var tipData = "0%"

        rootView.findViewById<Button>(R.id.noTipButton).setOnClickListener {
            tip = 0.0
            Toast.makeText(context, tipMessage + " $tipData", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        rootView.findViewById<Button>(R.id._5pcButton).setOnClickListener {
            tip = 0.05
            tipData = "5%"
            Toast.makeText(context, tipMessage + " $tipData", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        rootView.findViewById<Button>(R.id._10pcButton).setOnClickListener {
            tip = 0.1
            tipData = "10%"
            Toast.makeText(context, tipMessage + " $tipData", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        rootView.findViewById<Button>(R.id._15pcButton).setOnClickListener {
            tip = 0.15
            tipData = "15%"
            Toast.makeText(context, tipMessage + " $tipData", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        rootView.findViewById<Button>(R.id._20pcButton).setOnClickListener {
            tip = 0.2
            tipData = "20%"
            Toast.makeText(context, tipMessage + " $tipData", Toast.LENGTH_SHORT).show()
            dismiss()
        }



        return rootView
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val btn1 = view.findViewById<Button>(R.id.noTipButton)
//        val btn2 = view.findViewById<Button>(R.id._5pcButton)
//        val btn3 = view.findViewById<Button>(R.id._10pcButton)
//        val btn4 = view.findViewById<Button>(R.id._15pcButton)
//        val btn5 = view.findViewById<Button>(R.id._20pcButton)
//
//        btn1.setOnClickListener {
////            Toast.makeText(this, "This is button1", Toast.LENGTH_LONG).show()
//
//            dismiss()
//        }
//        btn2.setOnClickListener {
//            dismiss()
//        }
//        btn3.setOnClickListener {
//            dismiss()
//        }
//        btn4.setOnClickListener {
//            dismiss()
//        }
//        btn5.setOnClickListener {
//            dismiss()
//        }
//
//
//    }

}