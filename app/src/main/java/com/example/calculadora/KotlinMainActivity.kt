package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Math.sqrt
import java.lang.StringBuilder
import kotlin.math.roundToInt

class KotlinMainActivity : AppCompatActivity() {

    var resultado = 0
    var firstNumber = 0
    var nextNumber = 0

    var operacion = 0
    lateinit var textScreen : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_main)


        textScreen = findViewById<TextView>(R.id.textScreen)

        val ce = findViewById<Button>(R.id.buttonCE)
        val c = findViewById<Button>(R.id.buttonC)

        val plus = findViewById<Button>(R.id.buttonPlus)
        val divide = findViewById<Button>(R.id.buttonDivide)
        val minus = findViewById<Button>(R.id.buttonMinus)
        val multiply = findViewById<Button>(R.id.buttonMultiply)
        val equal = findViewById<Button>(R.id.buttonEqual)
        val squareroot = findViewById<Button>(R.id.buttonSquareRoot)
        val square = findViewById<Button>(R.id.buttonSquare)


//        val cambio = findViewById<Button>(R.id.button)
        val one = findViewById<Button>(R.id.button1)
        val two = findViewById<Button>(R.id.button2)
        val three = findViewById<Button>(R.id.button3)
        val four = findViewById<Button>(R.id.button4)
        val five = findViewById<Button>(R.id.button5)
        val six = findViewById<Button>(R.id.button6)
        val seven = findViewById<Button>(R.id.button7)
        val eight = findViewById<Button>(R.id.button8)
        val nine = findViewById<Button>(R.id.button9)
        val zero = findViewById<Button>(R.id.button0)


        c.setOnClickListener {
            textScreen.setText("0")
        }

        ce.setOnClickListener {
            textScreen.setText("0")
            firstNumber = 0
            nextNumber = 0
        }

        square.setOnClickListener {
            firstNumber = textScreen.text.toString().toInt()
            textScreen.text = (firstNumber*firstNumber).toString()
        }

        squareroot.setOnClickListener {
            firstNumber = textScreen.text.toString().toInt()
            textScreen.setText(sqrt(firstNumber.toDouble()).toString())
        }


        plus.setOnClickListener {
            firstNumber = textScreen.text.toString().toInt()
            operacion = 1
            textScreen.setText("")
        }

        minus.setOnClickListener {
            firstNumber = textScreen.text.toString().toInt()
            operacion = 2
            textScreen.setText("")
        }

        multiply.setOnClickListener {
            firstNumber = textScreen.text.toString().toInt()
            operacion = 3
            textScreen.setText("")
        }

        divide.setOnClickListener {
            firstNumber = textScreen.text.toString().toInt()
            operacion = 4
            textScreen.setText("")
        }

        equal.setOnClickListener {
            nextNumber = textScreen.text.toString().toInt()

            when(operacion){
                1 -> resultado = firstNumber.toString().toInt()+nextNumber.toString().toInt()
                2 -> resultado = firstNumber.toString().toInt()-nextNumber.toString().toInt()
                3 -> resultado = firstNumber.toString().toInt()*nextNumber.toString().toInt()
                3 -> if(nextNumber != 0){
                    resultado = firstNumber/nextNumber
                } else {
                    textScreen.setText("ERR")
                    firstNumber = 0
                    nextNumber = 0
                }
            //textScreen.setText(resultado)

            }
        }


/*        cambio.setOnClickListener {
            val intent = Intent(
                this@KotlinMainActivity,  // https://kotlinlang.org/docs/this-expressions.html#qualified
                MainActivity::class.java)
        }*/






        one.setOnClickListener {
            numberClick(it as Button)
        }

        two.setOnClickListener {
            numberClick(it as Button)
        }

        three.setOnClickListener {
            numberClick(it as Button)
        }

        four.setOnClickListener {
            numberClick(it as Button)
        }

        five.setOnClickListener {
            numberClick(it as Button)
        }

        six.setOnClickListener {
            numberClick(it as Button)
        }

        seven.setOnClickListener {
            numberClick(it as Button)
        }

        eight.setOnClickListener {
            numberClick(it as Button)
        }

        nine.setOnClickListener {
            numberClick(it as Button)
        }

        zero.setOnClickListener {
            numberClick(it as Button)
        }





    }





    fun numberClick(number: Button) {
            if(!(textScreen.text.equals(null) || textScreen.text.equals("0") || textScreen.text.equals("ERR"))){
                textScreen.setText(textScreen.text.toString() + number.text.toString())
            } else {

                textScreen.setText(number.text.toString())
            }
    }
}