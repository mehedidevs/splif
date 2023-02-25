package com.arif.spliff.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arif.spliff.R
import com.arif.spliff.databinding.ActivityDetailsBinding
import com.arif.spliff.entity.Product

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (intent.hasExtra("prd")) {
            var product: Product = intent.getParcelableExtra("prd")!!

            binding.name.text = product.title

        }


    }
}