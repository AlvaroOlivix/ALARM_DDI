package com.example.ddi_tarea6.features.presentation.adapter

import android.content.Context
import android.view.View
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.ddi_tarea6.databinding.HoraCardviewBinding
import com.example.ddi_tarea6.features.domain.Alarm

class AlarmViewHolder(itemView: View, private val context: Context) :
    RecyclerView.ViewHolder(itemView) {
    private val binding = HoraCardviewBinding.bind(itemView)
    fun bind(alarm: Alarm) {
        binding.apply {
            hour.text = alarm.hour
            title.text = alarm.title
            description.text = alarm.description
            switch1.isChecked = alarm.id.toBoolean()

        }
    }
}