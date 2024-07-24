package com.example.mp_exam3

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.mp_exam3.fragments.App1Fragment
import com.example.mp_exam3.fragments.App2Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val textMessage : String = "HELLO: APP 3"
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, textMessage)
            type = "text/plain"
        }
        val buttonApp1: Button = findViewById(R.id.buttonApp1)
        val buttonApp2: Button = findViewById(R.id.buttonApp2)
//        loadFragment(App1Fragment())

        buttonApp1.setOnClickListener {
            loadFragment(App1Fragment())
        }

        buttonApp2.setOnClickListener {
            loadFragment(App2Fragment())
        }
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val textMessage : String = "HELLO: APP 3"
//        val sendIntent = Intent().apply {
//            action = Intent.ACTION_SEND
//            putExtra(Intent.EXTRA_TEXT, textMessage)
//            type = "text/plain"
//        }
//        try {
//            startActivity(sendIntent)
//        } catch (e: ActivityNotFoundException) {
//        }
//    }
//}

