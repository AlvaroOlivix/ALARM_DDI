package com.example.ddi_tarea6.domain

class GetAlarmsUseCase(private val alarmRepository: AlarmRepository) {

    private operator fun invoke(): List<Alarm> {
        return alarmRepository.getAlarms()
    }
}