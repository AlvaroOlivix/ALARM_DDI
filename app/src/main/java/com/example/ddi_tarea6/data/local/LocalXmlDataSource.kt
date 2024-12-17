package com.example.ddi_tarea6.data.local

import android.content.Context
import com.example.ddi_tarea6.domain.Alarm

class LocalXmlDataSource(private val context: Context) {



    private val alarms = listOf(
        Alarm("1", "08:00", "Alarma despertador", "Sonar una vez"),
        Alarm("2", "12:00", "Alarma", "Sonar una vez"),
        Alarm("3", "20:10", "Alarma única", "Cocer Huevos"),
        Alarm("4", "13:00", "Alarma", "Dia de diario"),
        Alarm("5", "19:20", "Alarma despertador", "Alarma pastillas"),
        Alarm("6", "14:45", "Alarma despertador", "Sonar una vez"),
        Alarm("7", "07:00", "Alarma despertador", "Sonar cada hora"),
        Alarm("8", "23:23", "Alarma despertador", "My mercy prevails over my wrath")

    )
    private fun getAlarms(): List<Alarm> {
        return alarms
    }
}
