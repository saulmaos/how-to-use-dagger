package com.recodigo.howtousedagger.ui.detailActivity.di

import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.ui.detailFragment.DetailFragment
import dagger.Subcomponent

/**
 * Created by SAUL on 21/01/2021.
 */
@Subcomponent(modules = [DetailModule::class])
interface DetailComponent {

    // we're telling dagger that DetailFragment needs dependencies
    fun inject(detailFragment: DetailFragment)

    // we're requesting access to this factory
    fun getDetailViewModelFactory(): ViewModelProvider.Factory

    @Subcomponent.Factory
    interface Factory {
        fun create(): DetailComponent
    }
}