package com.example.ddi_tarea6.features.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.ddi_tarea6.R
import com.example.ddi_tarea6.databinding.ActivityMainBinding
import com.example.ddi_tarea6.features.domain.Alarm
import com.example.ddi_tarea6.features.presentation.adapter.AlarmAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private val viewModel: AlarmViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AlarmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    private fun setUpObservers() {
        val observer = Observer<AlarmViewModel.UiState> { uiState ->
            uiState.alarms?.let {
               // bind(alarms)
            }

        }

    }

    private fun SetUpView() {


    }
    private fun bind(alarms: List<Alarm>) {


    }

}