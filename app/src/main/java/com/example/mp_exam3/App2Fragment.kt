package com.example.mp_exam3.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.mp_exam3.R

class App2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_app2, container, false)

        val button: Button = view.findViewById(R.id.buttonLaunchApp2)
        button.setOnClickListener {
            val intent = Intent()
            intent.setClassName("com.example.mp_exam2", "com.example.mp_exam2.MainActivity")
            intent.putExtra("input","Hello, App 2: App3")

            Log.d("App3", "Sending intent to App2 with message")
            startActivity(intent)
        }

        return view
    }
}
