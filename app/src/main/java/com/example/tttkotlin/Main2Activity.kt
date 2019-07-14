package com.example.tttkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : Activity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v!!.id == R.id.button1) {
            startActivity(Intent(this, MainActivity::class.java))
        }
        if(v.id == R.id.button2){
            finishAffinity()
        }
    }
}
