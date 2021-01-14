package com.recodigo.howtousedagger.data.local

import android.content.Context
import javax.inject.Inject

/**
 * Created by SAUL on 29/12/2020.
 */
class MyDatabase @Inject constructor(context: Context) {
    private val language: LanguageEntity = RandomLanguage.getLanguage()

    fun getLanguage(): LanguageEntity = language
}