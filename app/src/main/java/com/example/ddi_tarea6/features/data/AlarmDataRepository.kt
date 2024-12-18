package com.example.ddi_tarea6.features.data

import com.example.ddi_tarea6.features.data.local.LocalXmlDataSource
import com.example.ddi_tarea6.features.data.remote.MockRemoteDataSource
import com.example.ddi_tarea6.features.domain.Alarm
import com.example.ddi_tarea6.features.domain.AlarmRepository
import org.koin.core.annotation.Single

@Single
class AlarmDataRepository(private val localData: LocalXmlDataSource, private val remoteData: MockRemoteDataSource) : AlarmRepository {

    override fun getAlarms(): List<Alarm> {
        val alarms = localData.getAlarms()
        if (alarms.isEmpty()){
            val remoteAlarms = remoteData.getAlarms()
            localData.saveAlarms(remoteAlarms)
            return remoteAlarms
        }
        return alarms
    }
}