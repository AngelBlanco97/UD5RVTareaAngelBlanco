package com.angelblanco.ud5_rvtarea_angelblanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import java.lang.reflect.Type
import com.angelblanco.ud5_rvtarea_angelblanco.databinding.ActivityMainBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val collectionType: Type = object : TypeToken<List<RespuestaJSON?>?>() {}.type
    val items: List<RespuestaJSON> = Gson()
        .fromJson(Miobjeto.informacionMezcla, collectionType) as List<RespuestaJSON>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Repositorios.layoutManager = LinearLayoutManager(this)
        binding.Repositorios.adapter = Miadaptador(items) {
            DetailActivity.starter(this, it.id)
        }
    }
}


