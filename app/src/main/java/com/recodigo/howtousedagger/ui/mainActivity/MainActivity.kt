package com.recodigo.howtousedagger.ui.mainActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.MyApp
import com.recodigo.howtousedagger.R
import com.recodigo.howtousedagger.ui.detailActivity.DetailActivity
import com.recodigo.howtousedagger.utils.ViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_main.tvDescription
import kotlinx.android.synthetic.main.activity_main.tvLanguage

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createViewModel()

        viewModel.language.observe(this, Observer {
            tvLanguage.text = it.language
            tvDescription.text = it.desc
        })


        tvDescription.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        viewModel.onLanguageRequest()
    }

    private fun createViewModel() {
        val repository = (application as MyApp).repository
        val factory = ViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
    }
}