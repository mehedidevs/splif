package com.arif.spliff.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.arif.spliff.R
import com.arif.spliff.databinding.FragmentRegisterBinding
import com.arif.spliff.model.RegisterUser
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {
    lateinit var binding: FragmentRegisterBinding


    private lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[RegisterViewModel::class.java]

        binding.createBtn.setOnClickListener {
            val registerUser = RegisterUser(
                binding.nameEditText.text.toString().trim(),
                binding.companyEditText.text.toString().trim(),
                binding.phoneEditText.text.toString().trim(),
                binding.emailEditText.text.toString().trim(),
                binding.passwordEditText.text.toString().trim(),
                binding.conformPasswordEditText.text.toString().trim(),
                binding.addressEditText.text.toString().trim(),
            )

            viewModel.registerUserVM(registerUser)

        }

        viewModel.responseData.observe(this) {

            if (it.success == true) {

                Log.i("TAG", "success: ${it.data} ")


            } else {

                Log.i("TAG", "success: ${it.message} ")

            }


        }


    }
}