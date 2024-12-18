package com.example.ddi_tarea6.features.data.local

import android.content.Context
import com.example.ddi_tarea6.R
import com.example.ddi_tarea6.features.domain.Alarm
import com.google.gson.Gson
import org.koin.core.annotation.Single

@Single
class LocalXmlDataSource(private val context: Context) {

    private val sharePref =
        context.getSharedPreferences(context.getString(R.string.data_local), Context.MODE_PRIVATE)
    private val gson = Gson()

    fun getAlarms(): List<Alarm> {
        val alarmsJson = sharePref.getString(context.getString(R.string.data_local), null)
        return if (alarmsJson != null) {
            gson.fromJson(alarmsJson, Array<Alarm>::class.java).toList()
        } else {
            emptyList()
        }
    }

    fun saveAlarms(alarms: List<Alarm>) {
        val alarmsJson = gson.toJson(alarms)
        sharePref.edit().putString(context.getString(R.string.data_local), alarmsJson).apply()

    }
}