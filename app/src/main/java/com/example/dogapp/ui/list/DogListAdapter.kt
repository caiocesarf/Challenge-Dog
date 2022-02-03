package com.example.dogapp.ui.list


import BreedsDTO
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogapp.databinding.BasicBreedItemBinding
import com.example.dogapp.utils.loadFromUrl

class DogListAdapter : RecyclerView.Adapter<DogListAdapter.BreedDetailViewHolder>() {

    private var action: ((BreedsDTO) -> Unit)? = null
    private val listBreeds = mutableListOf<BreedsDTO>()

    fun onSelectBreed(action: ((BreedsDTO) -> Unit)) {
        this.action = action
    }

    fun clearData() {
        listBreeds.clear()
        notifyDataSetChanged()
    }

    fun setData(it: List<BreedsDTO>) {
        listBreeds.clear()
        listBreeds.addAll(it)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BreedDetailViewHolder {
        val binding = BasicBreedItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return BreedDetailViewHolder(binding)
    }

    inner class BreedDetailViewHolder(private val binding: BasicBreedItemBinding) :
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
        holder.bind(listBreeds[position])
    }

    override fun getItemCount(): Int {
        return listBreeds.size
    }
}