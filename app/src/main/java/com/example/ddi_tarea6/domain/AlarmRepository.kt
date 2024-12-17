package com.example.ddi_tarea6.domain

interface AlarmRepository {
    fun getAlarms(): List<Alarm>
}