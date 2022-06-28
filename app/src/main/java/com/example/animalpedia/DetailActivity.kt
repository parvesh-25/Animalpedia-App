package com.example.animalpedia


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}