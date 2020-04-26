package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var result: TextView
    lateinit var editText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.id_nickname)
        result = findViewById(R.id.idResult)
        findViewById<Button>(R.id.btn_done).setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        result.text = editText.text
        view.visibility = View.GONE
        result.visibility = View.VISIBLE
    }
}
