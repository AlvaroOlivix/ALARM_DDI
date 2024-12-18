package com.example.ddi_tarea6.features.domain

interface AlarmRepository {
    fun getAlarms(): List<Alarm>
}