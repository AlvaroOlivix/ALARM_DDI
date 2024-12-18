package com.example.ddi_tarea6.core

import android.app.Application
import com.example.ddi_tarea6.core.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import org.koin.ksp.generated.module

class DdiTarea6 : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@DdiTarea6)
          modules(AppModule().module)
        }
    }
}