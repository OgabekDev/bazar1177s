package com.example.bazar1177s.adapter

import android.util.Base64
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bazar1177s.databinding.ItemProductOrderBinding
import com.example.bazar1177s.model.ProductOrder

class ProductOrderAdapter : ListAdapter<ProductOrder, ProductOrderAdapter.VH>(ITEM_DIF) {

    var deleteClick: ((Long) -> Unit)? = null

    companion object {
        val ITEM_DIF = object : DiffUtil.ItemCallback<ProductOrder>() {

            override fun areItemsTheSame(oldItem: ProductOrder, newItem: ProductOrder): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: ProductOrder, newItem: ProductOrder): Boolean {
                return oldItem == newItem
            }
        }
    }


    inner class VH(private val binding: ItemProductOrderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val product = currentList[adapterPosition]
            binding.apply {
                val imageByteArray = Base64.decode(product.image, Base64.DEFAULT)
                Glide.with(ivProduct).load(imageByteArray).into(ivProduct)
                tvProductName.text = product.name
                tvProductPrice.text = "1 kg = ${product.price} UZS"
                tvAmount.text = "${product.entity} ${product.type}"
                tvTotal.text = "${product.total} UZS"
                ivCancel.setOnClickListener {
                    deleteClick?.invoke(product.id!!)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            ItemProductOrderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind()
    }
}