package com.example.mad_practical3_20012021059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.mad_practical3_20012021059.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.BottomNavigationView.id = R.id.btnreg
        binding.BottomNavigationView.setOnItemSelectedListener { it2 ->
            when (it2.itemId) {
                R.id.btnreg -> {
                    Intent(this, RegisterActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}