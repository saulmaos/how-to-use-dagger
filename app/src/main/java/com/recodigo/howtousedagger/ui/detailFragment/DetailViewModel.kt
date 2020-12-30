package com.recodigo.howtousedagger.ui.detailFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.recodigo.howtousedagger.data.local.LanguageEntity
import com.recodigo.howtousedagger.data.repository.Repository

/**
 * Created by SAUL on 30/12/2020.
 */
class DetailViewModel(
        private val repository: Repository
): ViewModel() {

    private val _language = MutableLiveData<LanguageEntity>()
    val language: LiveData<LanguageEntity> = _language

    fun onLanguageRequest() {
        _language.value = repository.getLanguage()
    }
}