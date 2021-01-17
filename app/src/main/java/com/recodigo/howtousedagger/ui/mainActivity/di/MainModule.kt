package com.recodigo.howtousedagger.ui.mainActivity.di

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.data.repository.Repository
import com.recodigo.howtousedagger.ui.mainActivity.MainActivity
import com.recodigo.howtousedagger.ui.mainActivity.MainViewModel
import com.recodigo.howtousedagger.utils.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

/**
 * Created by SAUL on 16/01/2021.
 */
@Module
class MainModule {

    // We're telling Dagger how to create instances of MainViewModel
    // MainActivity will be retrieved from MainComponent
    @Provides
    fun provideMainViewModel(
            activity: MainActivity,
            repository: Repository
    ): MainViewModel {
        val factory = ViewModelProviderFactory(repository)
        return ViewModelProvider(activity, factory).get(MainViewModel::class.java)
    }
}