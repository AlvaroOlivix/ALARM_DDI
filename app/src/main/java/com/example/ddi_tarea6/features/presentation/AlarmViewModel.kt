package com.example.ddi_tarea6.features.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ddi_tarea6.features.domain.Alarm
import com.example.ddi_tarea6.features.domain.GetAlarmsUseCase
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class AlarmViewModel(private val getAlarmsUseCase: GetAlarmsUseCase) : ViewModel() {
    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    suspend fun createAlarmsView() {
        val alarms = getAlarmsUseCase.invoke()
        _uiState.postValue(
            UiState(alarms = alarms)
        )
    }

    data class UiState(
        val alarms: List<Alarm>? = null
    )
}