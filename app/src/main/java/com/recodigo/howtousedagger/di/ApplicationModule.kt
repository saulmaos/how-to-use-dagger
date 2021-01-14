package com.recodigo.howtousedagger.di

import android.content.Context
import com.recodigo.howtousedagger.data.local.MyDatabase
import dagger.Module
import dagger.Provides

/**
 * Created by SAUL on 13/01/2021.
 */
// This is where we tell dagger how to create objects
@Module
class ApplicationModule {

    // we´re telling dagger how to create an instance of MyDatabase
    // But we need to provide a Context
    @Provides
    fun provideDatabase(context: Context): MyDatabase {
        return MyDatabase(context)
    }
}