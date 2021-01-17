package com.recodigo.howtousedagger.ui.mainActivity.di

import androidx.appcompat.app.AppCompatActivity
import com.recodigo.howtousedagger.ui.mainActivity.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Created by SAUL on 16/01/2021.
 */
// MainComponent will inherit all the dependencies from ApplicationComponent
@Subcomponent(modules = [MainModule::class])
interface MainComponent {

    // We're telling dagger that MainActivity needs dependencies
    fun inject(mainActivity: MainActivity)

    // Used to create instances of MainComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: MainActivity): MainComponent
    }
}