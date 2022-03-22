package com.example.pingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pingo.databinding.ActivityPinBinding

lateinit var bindingCLass: ActivityPinBinding
class Pin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        bindingCLass = ActivityPinBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingCLass.root)
        val bottomNavigationView = bindingCLass.bNum
        val navController = findNavController(R.id.fragmentContainerView3)
        bottomNavigationView.setupWithNavController(navController)

    }
}