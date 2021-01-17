package com.recodigo.howtousedagger.di

import com.recodigo.howtousedagger.ui.mainActivity.di.MainComponent
import dagger.Module

/**
 * Created by SAUL on 16/01/2021.
 */
// Here we will add all the SubComponents
@Module(subcomponents = [MainComponent::class])
class SubComponents {
}