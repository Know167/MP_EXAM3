package com.example.mp_exam3.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.mp_exam3.R

class App1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_app1, container, false)

        val button: Button = view.findViewById(R.id.buttonLaunchApp1)
        button.setOnClickListener {
            val intent = Intent()
            intent.setClassName("com.example.mp_exam", "com.example.mp_exam.MainActivity")
            intent.putExtra("input","Hello, App 1: App3")
            startActivity(intent)
        }

        return view
    }
}
