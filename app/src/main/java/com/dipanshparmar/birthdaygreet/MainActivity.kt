package com.dipanshparmar.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleClick(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        if(name != "") {
            val intent = Intent(this,  BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME, name)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Enter the name", Toast.LENGTH_LONG).show()
        }
    }
}