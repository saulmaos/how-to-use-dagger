package com.recodigo.howtousedagger

import android.app.Application
import com.recodigo.howtousedagger.data.local.MyDatabase
import com.recodigo.howtousedagger.data.repository.Repository

/**
 * Created by SAUL on 29/12/2020.
 */
class MyApp: Application() {

    val repository by lazy {
        Repository(MyDatabase(applicationContext))
    }
}