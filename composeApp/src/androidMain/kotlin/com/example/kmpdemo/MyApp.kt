package com.example.kmpdemo

import android.app.Application
import com.example.kmpdemo.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@MyApp)

        }
    }

}