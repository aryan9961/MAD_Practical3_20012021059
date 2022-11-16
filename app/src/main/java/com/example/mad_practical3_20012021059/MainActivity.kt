package com.example.mad_practical3_20012021059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.mad_practical3_20012021059.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.BottomNavigationView.id = R.id.btnreg
        binding.BottomNavigationView.setOnItemSelectedListener { it ->
            when(it.itemId) {
                R.id.btnreg -> {

                    Intent(this, RegisterActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }

        binding.BottomNavigationView.id = R.id.btnlogin
        binding.BottomNavigationView.setOnItemSelectedListener { it1 ->
            when (it1.itemId) {
                R.id.btnlogin -> {
                    Intent(this, LoginActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}

