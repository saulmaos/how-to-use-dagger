package com.recodigo.howtousedagger.data.repository

import com.recodigo.howtousedagger.data.local.LanguageEntity
import com.recodigo.howtousedagger.data.local.MyDatabase
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by SAUL on 29/12/2020.
 */
// Only one instance of Repository will exist and will belong to ApplicationComponent
@Singleton
class Repository @Inject constructor(private val myDatabase: MyDatabase) {
    fun getLanguage(): LanguageEntity = myDatabase.getLanguage()
}