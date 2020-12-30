package com.recodigo.howtousedagger.ui.detailActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recodigo.howtousedagger.R
import com.recodigo.howtousedagger.ui.detailFragment.DetailFragment

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, DetailFragment.newInstance())
            .commit()
    }
}