package com.example.bazar1177s.adapter

import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bazar1177s.databinding.ItemMainAdsBinding
import com.example.bazar1177s.databinding.ItemShoppingCartBinding
import com.example.bazar1177s.model.CarouselProduct
import com.example.bazar1177s.utils.Constants.BASE_URL_IMAGE

class CarouselAdapter : ListAdapter<CarouselProduct, CarouselAdapter.CarouselProductViewHolder>(ITEM_DIF) {
    private  val TAG = "CarouselProductAdapter"
    var onClick: ((CarouselProduct) -> Unit)? = null

    companion object {
        val ITEM_DIF = object : DiffUtil.ItemCallback<CarouselProduct>() {
            override fun areItemsTheSame(oldItem: CarouselProduct, newItem: CarouselProduct): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: CarouselProduct, newItem: CarouselProduct): Boolean {
                return oldItem == newItem
            }

        }
    }


    inner class CarouselProductViewHolder(private val binding: ItemMainAdsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = getItem(adapterPosition)
            with(binding) {

                val imageByteArray = Base64.decode(item.product.image.data, Base64.DEFAULT)
                Glide.with(root).load(imageByteArray).into(binding.ivAds)
                tvAdsCost.text = item.product.price.toString()
               // ca.text = item.product.type.name
                /**
                 * ey sho`tta nima bor
                 */
                tvAdsName.text = item.product.name


                clCarouselProduct.setOnClickListener {
                    onClick?.invoke(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselProductViewHolder {
        return CarouselProductViewHolder(
            ItemMainAdsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CarouselProductViewHolder, position: Int) {
        holder.bind()
    }

}