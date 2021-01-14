package com.recodigo.howtousedagger

import android.app.Application
import com.recodigo.howtousedagger.data.local.MyDatabase
import com.recodigo.howtousedagger.data.repository.Repository
import com.recodigo.howtousedagger.di.ApplicationComponent
import com.recodigo.howtousedagger.di.DaggerApplicationComponent

/**
 * Created by SAUL on 29/12/2020.
 */
class MyApp: Application() {
    // we are creating an applicationComponent which we'll use to access our dependencies
    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }
}