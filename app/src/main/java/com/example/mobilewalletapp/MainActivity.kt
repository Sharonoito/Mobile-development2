package com.example.mobilewalletapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var tvaccountName: TextView
    lateinit var tvCurrency: TextView
    lateinit var tvBalance: TextView
    lateinit var tvtransactionAmount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()


    }
    fun castViews(){
        tvaccountName=findViewById(R.id.tvaccountName)
        tvCurrency=findViewById(R.id.tvCurrency)
        tvBalance=findViewById(R.id.tvBalance)
        tvtransactionAmount=findViewById(R.id.tvtransactionAmount)
    }
}


