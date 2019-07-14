package com.example.tttkotlin

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var chance = 0
    var gameEnd = 0
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        reset.setOnClickListener(this)
        back.setOnClickListener(this)

        btn1.setBackgroundResource(android.R.drawable.btn_default)
        btn2.setBackgroundResource(android.R.drawable.btn_default)
        btn3.setBackgroundResource(android.R.drawable.btn_default)
        btn4.setBackgroundResource(android.R.drawable.btn_default)
        btn5.setBackgroundResource(android.R.drawable.btn_default)
        btn6.setBackgroundResource(android.R.drawable.btn_default)
        btn7.setBackgroundResource(android.R.drawable.btn_default)
        btn8.setBackgroundResource(android.R.drawable.btn_default)
        btn9.setBackgroundResource(android.R.drawable.btn_default)

    }


    fun result() {
        when {
            btn1.text.toString() == "X" && btn2.text.toString() == "X" && btn3.text.toString() == "X" -> {
                btn1.setBackgroundColor(Color.rgb(46, 184, 46))
                btn2.setBackgroundColor(Color.rgb(46, 184, 46))
                btn3.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn4.text.toString() == "X" && btn5.text.toString() == "X" && btn6.text.toString() == "X" -> {
                btn4.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn6.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn7.text.toString() == "X" && btn8.text.toString() == "X" && btn9.text.toString() == "X" -> {
                btn7.setBackgroundColor(Color.rgb(46, 184, 46))
                btn8.setBackgroundColor(Color.rgb(46, 184, 46))
                btn9.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn1.text.toString() == "O" && btn2.text.toString() == "O" && btn3.text.toString() == "O" -> {
                btn1.setBackgroundColor(Color.rgb(46, 184, 46))
                btn2.setBackgroundColor(Color.rgb(46, 184, 46))
                btn3.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn4.text.toString() == "O" && btn5.text.toString() == "O" && btn6.text.toString() == "O" -> {
                btn4.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn6.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn7.text.toString() == "O" && btn8.text.toString() == "O" && btn9.text.toString() == "O" -> {
                btn7.setBackgroundColor(Color.rgb(46, 184, 46))
                btn8.setBackgroundColor(Color.rgb(46, 184, 46))
                btn9.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn1.text.toString() == "X" && btn4.text.toString() == "X" && btn7.text.toString() == "X" -> {
                btn1.setBackgroundColor(Color.rgb(46, 184, 46))
                btn4.setBackgroundColor(Color.rgb(46, 184, 46))
                btn7.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn2.text.toString() == "X" && btn5.text.toString() == "X" && btn8.text.toString() == "X" -> {
                btn2.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn8.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn3.text.toString() == "X" && btn6.text.toString() == "X" && btn9.text.toString() == "X" -> {
                btn3.setBackgroundColor(Color.rgb(46, 184, 46))
                btn6.setBackgroundColor(Color.rgb(46, 184, 46))
                btn9.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn1.text.toString() == "O" && btn4.text.toString() == "O" && btn7.text.toString() == "O" -> {
                btn1.setBackgroundColor(Color.rgb(46, 184, 46))
                btn4.setBackgroundColor(Color.rgb(46, 184, 46))
                btn7.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn2.text.toString() == "O" && btn5.text.toString() == "O" && btn8.text.toString() == "O" -> {
                btn2.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn8.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn3.text.toString() == "O" && btn6.text.toString() == "O" && btn9.text.toString() == "O" -> {
                btn3.setBackgroundColor(Color.rgb(46, 184, 46))
                btn6.setBackgroundColor(Color.rgb(46, 184, 46))
                btn9.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn1.text.toString() == "X" && btn5.text.toString() == "X" && btn9.text.toString() == "X" -> {
                btn1.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn9.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn3.text.toString() == "X" && btn5.text.toString() == "X" && btn7.text.toString() == "X" -> {
                btn3.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn7.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show()
            }
            btn1.text.toString() == "O" && btn5.text.toString() == "O" && btn9.text.toString() == "O" -> {
                btn1.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn9.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn3.text.toString() == "O" && btn5.text.toString() == "O" && btn7.text.toString() == "O" -> {
                btn3.setBackgroundColor(Color.rgb(46, 184, 46))
                btn5.setBackgroundColor(Color.rgb(46, 184, 46))
                btn7.setBackgroundColor(Color.rgb(46, 184, 46))
                gameEnd = 1
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show()
            }
            btn1.text.toString() != "" && btn2.text.toString() != "" &&btn3.text.toString() != "" && btn4.text.toString() != "" && btn5.text.toString() != "" &&btn6.text.toString() != "" &&btn7.text.toString() != "" &&btn8.text.toString() != "" &&btn9.text.toString() != "" -> {
                Toast.makeText(this,"Match Tied",Toast.LENGTH_SHORT).show()
            }
        }
    }

        override fun onClick(v: View) {
        when (v.id) {
            R.id.btn1 -> if (btn1.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn1.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn1.text = "X"
                    result()
                }
            }
            R.id.btn2 -> if (btn2.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn2.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn2.text = "X"
                    result()
                }
            }
            R.id.btn3 -> if (btn3.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn3.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn3.text = "X"
                    result()
                }
            }
            R.id.btn4 -> if (btn4.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn4.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn4.text = "X"
                    result()
                }
            }
            R.id.btn5 -> if (btn5.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn5.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn5.text = "X"
                    result()
                }
            }
            R.id.btn6 -> if (btn6.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn6.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn6.text = "X"
                    result()
                }
            }
            R.id.btn7 -> if (btn7.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn7.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn7.text = "X"
                    result()
                }
            }
            R.id.btn8 -> if (btn8.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn8.text = "O"
                    result()
                } else if(gameEnd==0) {
                    chance = 0
                    btn8.text = "X"
                    result()
                }
            }
            R.id.btn9 -> if (btn9.text.toString() == "" && gameEnd==0) {
                if (chance == 0) {
                    chance = 1
                    btn9.text = "O"
                    result()
                } else if(gameEnd==0){
                    chance = 0
                    btn9.text = "X"
                    result()
                }
            }
            R.id.reset -> {

                gameEnd = 0
                btn1.setBackgroundResource(android.R.drawable.btn_default)
                btn1.text = ""
                btn2.setBackgroundResource(android.R.drawable.btn_default)
                btn2.text = ""
                btn3.setBackgroundResource(android.R.drawable.btn_default)
                btn3.text = ""
                btn4.setBackgroundResource(android.R.drawable.btn_default)
                btn4.text = ""
                btn5.setBackgroundResource(android.R.drawable.btn_default)
                btn5.text = ""
                btn6.setBackgroundResource(android.R.drawable.btn_default)
                btn6.text = ""
                btn7.setBackgroundResource(android.R.drawable.btn_default)
                btn7.text = ""
                btn8.setBackgroundResource(android.R.drawable.btn_default)
                btn8.text = ""
                btn9.setBackgroundResource(android.R.drawable.btn_default)
                btn9.text = ""
            }
            R.id.back -> {
                startActivity(Intent(this,Main2Activity::class.java))
            }
        }
    }
}

