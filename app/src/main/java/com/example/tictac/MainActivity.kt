package com.example.tictac

import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tictac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var flag = 0
     private var count = 0
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun check(view: View) {
        val btncurrent = view as Button
        if (btncurrent.text == "") {
            count++

            if (flag == 0) {
                btncurrent.text = "X"
                flag = 1
            } else {
                btncurrent.text = "O"
                flag = 0
            }
            val b1 =binding.btn1.text.toString()
            val b2 = binding.btn2.text.toString()
            val b3 = binding.btn3.text.toString()
            val b4 = binding.btn4.text.toString()
            val b5 = binding.btn5.text.toString()
            val b6 = binding.btn6.text.toString()
            val b7 = binding.btn7.text.toString()
            val b8 = binding.btn8.text.toString()
            val b9 = binding.btn9.text.toString()
            if (b1 == b2 && b2 == b3 && b3 != " ") {
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b4", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b7", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b2", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b3", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newgame()
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b3", Toast.LENGTH_LONG).show()
                newgame()
            } else if (count == 9) {
                Toast.makeText(this@MainActivity, "Match is Drawn", Toast.LENGTH_LONG).show()
                newgame()
            }
        }
    }

     fun newgame() {
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""
        flag = 0
        count = 0
    }
}