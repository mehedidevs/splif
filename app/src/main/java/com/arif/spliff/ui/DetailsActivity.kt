package com.arif.spliff.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arif.spliff.R
import com.arif.spliff.databinding.ActivityDetailsBinding
import com.bumptech.glide.Glide

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val id = intent.getIntExtra("id",0)
        val title = intent.getStringExtra("title")
        val img = intent.getStringExtra("img")
        val des = intent.getStringExtra("des")
        val price = intent.getStringExtra("price")

        if (id != null){

            binding.name.text = title
            binding.discription.text = des
            binding.priceTxt.text = price
            Glide.with(this).load(img).into(binding.img)
        }

        binding.back.setOnClickListener {
            finish()
        }


    }
}