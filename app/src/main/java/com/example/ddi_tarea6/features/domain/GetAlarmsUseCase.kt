package com.example.ddi_tarea6.features.domain

import org.koin.core.annotation.Single

@Single
class GetAlarmsUseCase(private val alarmRepository: AlarmRepository) {
    suspend operator fun invoke(): List<Alarm> {
        return alarmRepository.getAlarms()
    }
}