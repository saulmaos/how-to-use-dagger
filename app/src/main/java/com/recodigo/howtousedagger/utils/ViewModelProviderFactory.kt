package com.recodigo.howtousedagger.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.data.repository.Repository
import com.recodigo.howtousedagger.ui.detailFragment.DetailViewModel
import com.recodigo.howtousedagger.ui.mainActivity.MainViewModel

/**
 * Created by SAUL on 30/12/2020.
 */
class ViewModelProviderFactory(
        private val repository: Repository
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}