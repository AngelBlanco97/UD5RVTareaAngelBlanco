package com.angelblanco.ud5_rvtarea_angelblanco

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.angelblanco.ud5_rvtarea_angelblanco.databinding.ItemRepositorioBinding
import com.squareup.picasso.Picasso
import androidx.appcompat.app.AppCompatActivity

class Miadaptador (val repositories: List<RespuestaJSON>, val onItemClicked: (RespuestaJSON) -> Unit) : RecyclerView.Adapter<Miadaptador.MiViewHolder>() {
    class MiViewHolder (val binding: ItemRepositorioBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiViewHolder {
        return MiViewHolder(ItemRepositorioBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MiViewHolder, position: Int) {
        val objectPosition = repositories[position]
        holder.binding.tvRepoName.text=objectPosition.name
        holder.binding.tvRepoDescripcion.text=objectPosition.description
        Picasso.get().load(objectPosition.owner.avatar_url).into(holder.binding.ivRepo)

        holder.binding.root.setOnClickListener {
            onItemClicked(objectPosition)
        }
    }

    override fun getItemCount(): Int {
        return repositories.size
    }
}