package com.example.ddi_tarea6.features.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.ddi_tarea6.R
import com.example.ddi_tarea6.features.domain.Alarm

class AlarmAdapter(private val context: Context) :
    ListAdapter<Alarm, AlarmViewHolder>(AlarmDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.hora_cardview, parent, false)
        return AlarmViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: AlarmViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = currentList.size
}