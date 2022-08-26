package com.example.bazar1177s.adapter

import android.graphics.Paint
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bazar1177s.databinding.ItemDiscountBinding
import com.example.bazar1177s.databinding.ItemMainAdsBinding
import com.example.bazar1177s.databinding.ItemShoppingCartBinding
import com.example.bazar1177s.model.DiscountProduct
import com.example.bazar1177s.utils.Constants.BASE_URL_IMAGE

class DiscountAdapter : ListAdapter<DiscountProduct, DiscountAdapter.DiscountProductViewHolder>(ITEM_DIF) {
    private  val TAG = "CarouselProductAdapter"
    var onClick: ((Int) -> Unit)? = null
    var count:Int=0

    companion object {
        val ITEM_DIF = object : DiffUtil.ItemCallback<DiscountProduct>() {
            override fun areItemsTheSame(oldItem: DiscountProduct, newItem: DiscountProduct): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: DiscountProduct, newItem: DiscountProduct): Boolean {
                return oldItem == newItem
            }

        }
    }


    inner class DiscountProductViewHolder(private val binding: ItemDiscountBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = getItem(adapterPosition)
            with(binding) {

                val imageByteArray = Base64.decode(item.product.image.data, Base64.DEFAULT)
                Glide.with(root).load(imageByteArray).into(binding.ivDiscountImage)
                tvDiscountPercentage.text = item.percent.toString()+"%"
                tvDiscountName.text = item.product.name
                tvDiscountNewPrice.text = item.product.price.toString()
                val oldPrice =  (100 * item.product.price / (100-item.percent)).toString()
                tvDiscountOldPrice.text = oldPrice
                tvDiscountOldPrice.paintFlags = tvDiscountOldPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG


                binding.ivDiscountAddToCart.setOnClickListener {
                    count++
                    Log.d("$$$$", "$count ")
                }

                llItemDiscount.setOnClickListener {
                    onClick?.invoke(item.product.id.toInt())
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountProductViewHolder {
        return DiscountProductViewHolder(
            ItemDiscountBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DiscountProductViewHolder, position: Int) {
        holder.bind()
    }

}