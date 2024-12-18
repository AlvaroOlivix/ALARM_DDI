package com.example.ddi_tarea6.core.di

import com.google.gson.Gson
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
@ComponentScan("example.ddi_tarea6.DdiTarea6")
class AppModule {
    @Single
    fun provideGson(): Gson {
        return Gson()
    }

}