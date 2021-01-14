package com.recodigo.howtousedagger.di

import android.content.Context
import com.recodigo.howtousedagger.ui.detailFragment.DetailFragment
import com.recodigo.howtousedagger.ui.mainActivity.MainActivity
import dagger.BindsInstance
import dagger.Component

/**
 * Created by SAUL on 13/01/2021.
 */
// Dagger will use ApplicationModule.class to know how to create objects
// And those objects will be accessible though ApplicationComponent
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    // We're telling dagger that MainActivity and DetailFragment need dependencies
    fun inject(mainActivity: MainActivity)

    fun inject(detailFragment: DetailFragment)

    // method create() is the one we'll use to create an instance of ApplicationComponent
    // Context is needed to create instances of MyDatabase
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

}