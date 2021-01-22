package com.recodigo.howtousedagger.ui.detailActivity.di

import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.data.repository.Repository
import com.recodigo.howtousedagger.utils.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

/**
 * Created by SAUL on 21/01/2021.
 */
@Module
class DetailModule {

    @Provides
    fun provideDetailViewModelFactory(
            repository: Repository
    ): ViewModelProvider.Factory {
        return ViewModelProviderFactory(repository)
    }
}