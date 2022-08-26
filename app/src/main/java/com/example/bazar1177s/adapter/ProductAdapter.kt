package com.example.bazar1177s.adapter

import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bazar1177s.databinding.ItemShoppingCartBinding
import com.example.bazar1177s.model.OrderedProducts
import com.example.bazar1177s.model.Product
import com.example.bazar1177s.utils.Constants.BASE_URL_IMAGE
import com.google.android.material.snackbar.Snackbar

class ProductAdapter : ListAdapter<Product, ProductAdapter.ProductViewHolder>(ITEM_DIF) {
    private  val TAG = "ProductAdapter"
    var onClick: ((Product) -> Unit)? = null
    var addProduct:((OrderedProducts)->Unit)? = null
    var deleteProduct:((OrderedProducts)->Unit)? = null
    var amount = 0

    companion object {
        val ITEM_DIF = object : DiffUtil.ItemCallback<Product>() {
            override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
                return oldItem == newItem
            }

        }
    }


    inner class ProductViewHolder(private val binding: ItemShoppingCartBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val product = getItem(adapterPosition)
            with(binding) {
                Log.d(TAG, "imageId: ${product.image.id}")

                val imageByteArray = Base64.decode(product.image.data, Base64.DEFAULT)
                Glide.with(root).load(imageByteArray).into(binding.ivShoppingCartItemFruit)
                tvProductName.text = product.name
                tvProductPrice.text =product.price.toString()
                tvProductWeight.text = "10kg"

                llItemCart.setOnClickListener {
                    onClick?.invoke(product)
                }

                ivPlus.setOnClickListener {
                    amount++
                    val newProduct = OrderedProducts(
                        product.id.toInt(),
                        product.name,
                        amount,
                        product.type.id.toInt()
                    )

                    addProduct?.invoke(newProduct)
                }

                ivMinus.setOnClickListener {
                    if(amount>0){
                        amount--
                        val newProduct = OrderedProducts(
                            product.id.toInt(),
                            product.name,
                            amount,
                            product.type.id.toInt()
                        )

                        addProduct?.invoke(newProduct)
                    }else{
                        Snackbar.make(root,"Savatchangizda ${product.name } yo`q" , Snackbar.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ItemShoppingCartBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind()
    }

}