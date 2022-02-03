package com.example.dogapp.utils

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

fun ImageView.loadFromUrl(url: String) {
    Glide
        .with(this)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .into(this)
}

fun View.visible(visible: Boolean = false, invisible : Boolean = false){
    visibility = when {
        visible -> View.VISIBLE
        invisible -> View.INVISIBLE
        else -> View.GONE
    }
}