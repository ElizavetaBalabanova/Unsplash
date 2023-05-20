package com.intermedia.intermedia.ui.onboarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.intermedia.intermedia.R

class ViewPagerAdapter (private val itemList: List<OnboardingItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_ITEM_1 = R.layout.onboarding_layout_1
        private const val TYPE_ITEM_2 = R.layout.onboarding_layout_2
        private const val TYPE_ITEM_3 = R.layout.onboarding_layout_3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_ITEM_1 -> {
                LayoutInflater.from(parent.context)
                    .inflate(viewType, parent, false).let {
                        Item1ViewHolder(it)
                    }
            }
            TYPE_ITEM_2 -> {
                LayoutInflater.from(parent.context)
                    .inflate(viewType, parent, false).let {
                        Item2ViewHolder(it)
                    }
            }
            TYPE_ITEM_3 -> {
                LayoutInflater.from(parent.context)
                    .inflate(viewType, parent, false).let {
                        Item3ViewHolder(it)
                    }
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is Item1ViewHolder -> {
                holder.apply {
                    bind(itemList[position])
                }
            }
            is Item2ViewHolder -> {
                holder.apply {
                    bind(itemList[position])
                }
            }
            is Item3ViewHolder -> {
                holder.apply {
                    bind(itemList[position])
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> TYPE_ITEM_1
            1 -> TYPE_ITEM_2
            2 -> TYPE_ITEM_3
            else -> TYPE_ITEM_1
        }
    }

    inner class Item1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val onboardingTitle = itemView.findViewById<TextView>(R.id.onboarding_title)
        fun bind(item: OnboardingItem) {
           onboardingTitle.text = item.onboardingTitle
        }
    }

    inner class Item2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val onboardingTitle = itemView.findViewById<TextView>(R.id.onboarding_title)
        fun bind(item: OnboardingItem) {
            onboardingTitle.text = item.onboardingTitle
        }
    }

    inner class Item3ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val onboardingTitle = itemView.findViewById<TextView>(R.id.onboarding_title)
        fun bind(item: OnboardingItem) {
            onboardingTitle.text = item.onboardingTitle
        }
    }
}
