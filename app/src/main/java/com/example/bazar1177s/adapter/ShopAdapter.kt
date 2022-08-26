package com.example.bazar1177s.adapter

import android.graphics.Bitmap
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.bazar1177s.databinding.ItemShopBinding
import com.example.bazar1177s.model.Shop
import com.example.bazar1177s.utils.Constants.BASE_URL_IMAGE

class ShopAdapter : ListAdapter<Shop, ShopAdapter.ShopViewHolder>(ITEM_DIF) {
    private  val TAG = "ShopAdapter"
    var onClick: ((Shop) -> Unit)? = null
    var getImage:((Bitmap)->Unit)? = null

    companion object {
        val ITEM_DIF = object : DiffUtil.ItemCallback<Shop>() {
            override fun areItemsTheSame(oldItem: Shop, newItem: Shop): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Shop, newItem: Shop): Boolean {
                return oldItem == newItem
            }

        }
    }


    inner class ShopViewHolder(private val binding: ItemShopBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val shop = getItem(adapterPosition)
            with(binding) {
                Log.d(TAG, "imageId: ${shop.image.id}")
                Log.d(TAG, BASE_URL_IMAGE+"${shop.image.id}")
                val imageByteArray = Base64.decode(shop.image.data, Base64.DEFAULT)
                Glide.with(root).load(imageByteArray).into(binding.ivShop)

                binding.tvShopName.text = shop.name

                binding.llItemBrand.setOnClickListener {
                    onClick?.invoke(shop)
                }


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        return ShopViewHolder(
            ItemShopBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.bind()
    }




}