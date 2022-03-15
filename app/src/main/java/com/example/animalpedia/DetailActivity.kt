package com.example.animalpedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.animalpedia.data.Animalpedia
import com.example.animalpedia.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // menampilkan actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val dataAnimalpedia = intent.getParcelableExtra<Animalpedia>(ANIMALPEDIA_DATA) as Animalpedia

        binding.apply {
            tvName.text = dataAnimalpedia.name
            tvPlace.text = dataAnimalpedia.live
            tvFood.text = dataAnimalpedia.food
            tvDescription.text = dataAnimalpedia.description
            constraintDetail.setBackgroundResource(dataAnimalpedia.imageDetail!!)
        }
    }


    companion object{
        const val ANIMALPEDIA_DATA = "animalpedia"
        const val EXTRA_IMG = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_PLACE = "place"
        const val EXTRA_FOOD = "food"
        const val EXTRA_DESCRIPTION = "description"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}