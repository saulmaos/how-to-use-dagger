package com.recodigo.howtousedagger.data.local

import android.content.Context

/**
 * Created by SAUL on 29/12/2020.
 */
class MyDatabase(context: Context) {
    private val language: LanguageEntity = RandomLanguage.getLanguage()

    fun getLanguage(): LanguageEntity = language
}