package com.angelblanco.ud5_rvtarea_angelblanco

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class App : Application() {
    val items: MutableList<RespuestaJSON> = mutableListOf()
    val collectionType: Type = object : TypeToken<List<RespuestaJSON?>?>() {}.type

    override fun onCreate() {
        super.onCreate()
        items += Gson().fromJson(Miobjeto.informacionMezcla, collectionType) as MutableList<RespuestaJSON>

    }
}

val AppCompatActivity.app: App
    get() = this.application as App