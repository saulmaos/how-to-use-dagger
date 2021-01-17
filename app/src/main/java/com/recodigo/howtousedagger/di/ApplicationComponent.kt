package com.recodigo.howtousedagger.di

import android.content.Context
import com.recodigo.howtousedagger.ui.detailFragment.DetailFragment
import com.recodigo.howtousedagger.ui.mainActivity.MainActivity
import com.recodigo.howtousedagger.ui.mainActivity.di.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by SAUL on 13/01/2021.
 */
// Dagger will use ApplicationModule.class to know how to create objects
// And those objects will be accessible though ApplicationComponent
// All dependencies with @Singleton will belong to ApplicationComponent and
// will live as long as ApplicationComponent
@Singleton
@Component(modules = [ApplicationModule::class, SubComponents::class])
interface ApplicationComponent {

    // We're telling dagger that DetailFragment needs dependencies

    fun inject(detailFragment: DetailFragment)

    // we're requesting access to MainComponent
    fun getMainComponent(): MainComponent.Factory

    // method create() is the one we'll use to create an instance of ApplicationComponent
    // Context is needed to create instances of MyDatabase
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

}