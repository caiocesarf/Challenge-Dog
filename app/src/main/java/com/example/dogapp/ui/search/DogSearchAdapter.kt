package com.example.dogapp.ui.search

import BreedsDTO
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogapp.databinding.BasicBreedDetailBinding
import com.example.dogapp.utils.loadFromUrl

class DogSearchAdapter : RecyclerView.Adapter<DogSearchAdapter.BreedDetailViewHolder>() {

    private var action: ((BreedsDTO) -> Unit)? = null
    private val listLBreeds = mutableListOf<BreedsDTO>()

    fun onSelectBreed(action: ((BreedsDTO) -> Unit)) {
        this.action = action
    }

    fun clearData() {
        listLBreeds.clear()
        notifyDataSetChanged()
    }

    fun setData(it: List<BreedsDTO>) {
        listLBreeds.clear()
        listLBreeds.addAll(it)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DogSearchAdapter.BreedDetailViewHolder {
        val binding = BasicBreedDetailBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return BreedDetailViewHolder(binding)
    }

    inner class BreedDetailViewHolder(private val binding: BasicBreedDetailBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(breds: BreedsDTO) {
            itemView.run {
                binding.selectBreedLabel.text = breds.name
                binding.dogPic.loadFromUrl(breds.image.url)
                binding.dogImageView.setOnClickListener {
                    action?.invoke(breds)
                }
            }
        }
    }

    override fun onBindViewHolder(holder: BreedDetailViewHolder, position: Int) {
        holder.bind(listLBreeds[position])
    }

    override fun getItemCount(): Int {
        return listLBreeds.size
    }
}