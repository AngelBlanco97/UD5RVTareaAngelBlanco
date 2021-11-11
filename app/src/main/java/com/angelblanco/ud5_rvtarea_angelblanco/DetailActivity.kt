package com.angelblanco.ud5_rvtarea_angelblanco

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.angelblanco.ud5_rvtarea_angelblanco.databinding.ActivityDetailBinding
import com.google.gson.Gson
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val id = intent.extras?.getInt(ITEM_ID)
        if (id == null) {
            idIsRequiredError()
        } else {
            val item = app.items.firstOrNull { id == it.id }
            if (item == null) {
                idIsRequiredError()
            } else {

                Picasso.get().load(item.owner.avatar_url).into(binding.image)

                if (item.name.isNullOrEmpty()) {
                    binding.itemName.text = "no info"
                } else {
                    binding.itemName.text = item.name
                    binding.descriptionRepo.text = item.description
                    binding.lenguajeRepo.text = item.language
                    binding.licenceRepo.text = item.license.name
                    binding.tagsRepo.text = item.topics.toString()

                }


            }
        }

    }
    private fun idIsRequiredError() {

    }

    companion object {
        private const val ITEM_ID= "item_id"

        @JvmStatic
        fun starter(context: Context, id: Int) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(ITEM_ID, id)
            context.startActivity(intent)

        }
    }
}