package com.example.pmdmej11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej11.databinding.MercadereventBinding

class MercaderEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MercadereventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var heroe = intent?.getSerializableExtra("heroe") as Personaje

        binding.comerciar.setOnClickListener(){
            startActivity(Intent(this@MercaderEvent,Blank::class.java))
        }
        binding.mercontinuar.setOnClickListener(){
            val intent = Intent(this@MercaderEvent,Events::class.java)
            intent.putExtra("heroe",heroe)
            startActivity(intent)
        }

    }
}