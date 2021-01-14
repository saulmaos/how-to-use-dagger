package com.recodigo.howtousedagger.data.repository

import com.recodigo.howtousedagger.data.local.LanguageEntity
import com.recodigo.howtousedagger.data.local.MyDatabase
import javax.inject.Inject

/**
 * Created by SAUL on 29/12/2020.
 */
class Repository @Inject constructor(private val myDatabase: MyDatabase) {
    fun getLanguage(): LanguageEntity = myDatabase.getLanguage()
}