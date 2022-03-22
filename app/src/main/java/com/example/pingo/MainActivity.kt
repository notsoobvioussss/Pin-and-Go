package com.example.pingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pingo.databinding.ActivityMainBinding


lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    fun OnClick(view: View){
        val randomIntent = Intent(this, Pin::class.java)
        startActivity(randomIntent)
    }
}