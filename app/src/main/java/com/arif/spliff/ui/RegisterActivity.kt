package com.arif.spliff.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.arif.spliff.R
import com.arif.spliff.databinding.FragmentRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: FragmentRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding  = FragmentRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}