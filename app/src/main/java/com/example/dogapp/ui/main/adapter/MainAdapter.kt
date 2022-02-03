//package com.example.dogapp.ui.main.adapter
//
//import BreedsDTO
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//
//class MainAdapter(private val users: ArrayList<BreedsDTO>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {
//
//    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        fun bind(breeds: BreedsDTO) {
//            itemView.apply {
//                textViewUserName.text = breeds.name
//                textViewUserEmail.text = breeds.
//                Glide.with(imageViewAvatar.context)
//                    .load(user.avatar)
//                    .into(imageViewAvatar)
//            }
//        }
//    }
//
////    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
////        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))
//
//    override fun getItemCount(): Int = users.size
//
//    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
//        holder.bind(users[position])
//    }
//
////    fun addUsers(users: List<User>) {
////        this.users.apply {
////            clear()
////            addAll(users)
////        }
//
//    }
//}