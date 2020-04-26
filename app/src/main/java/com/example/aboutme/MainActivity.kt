package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //lateinit
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_done).setOnClickListener {
            addNickname(it)
        }
        //editText =
        result = findViewById(R.id.idResult)
    }

    private fun addNickname(view: View) {
        var editText:EditText = findViewById(R.id.id_nickname)
        result.text = editText.text
        view.visibility = View.GONE
        result.visibility = View.VISIBLE
    }
}
