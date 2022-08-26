package com.example.bazar1177s.adapter

import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bazar1177s.databinding.ItemCartHorizontalBinding
import com.example.bazar1177s.databinding.ItemShopBinding
import com.example.bazar1177s.model.ShopCategory
import com.example.bazar1177s.utils.Constants.BASE_URL_IMAGE

class ShopCategoryAdapter : ListAdapter<ShopCategory, ShopCategoryAdapter.ShopCategoryViewHolder>(ITEM_DIF) {
    private  val TAG = "ShopCategoryAdapter"
    var onClick: ((ShopCategory) -> Unit)? = null

    companion object {
        val ITEM_DIF = object : DiffUtil.ItemCallback<ShopCategory>() {
            override fun areItemsTheSame(oldItem: ShopCategory, newItem: ShopCategory): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: ShopCategory, newItem: ShopCategory): Boolean {
                return oldItem == newItem
            }

        }
    }


    inner class ShopCategoryViewHolder(private val binding: ItemCartHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val shopCategory = getItem(adapterPosition)
            with(binding) {
                Log.d(TAG, "imageId: ${shopCategory.image.id}")
                val imageByteArray = Base64.decode(shopCategory.image.data, Base64.DEFAULT)
                Glide.with(root).load(imageByteArray).into(binding.ivBrand)
                binding.tvBrandName.text = shopCategory.name

                binding.flBackground.setOnClickListener {
                    onClick?.invoke(shopCategory)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopCategoryViewHolder {
        return ShopCategoryViewHolder(
            ItemCartHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ShopCategoryViewHolder, position: Int) {
        holder.bind()
    }

}