package com.recodigo.howtousedagger.ui.mainActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.MyApp
import com.recodigo.howtousedagger.R
import com.recodigo.howtousedagger.data.repository.Repository
import com.recodigo.howtousedagger.ui.detailActivity.DetailActivity
import com.recodigo.howtousedagger.utils.ViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_main.tvDescription
import kotlinx.android.synthetic.main.activity_main.tvLanguage
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // In this case @Inject is used to tell Dagger that MainViewModel must be injected
    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // we're are requesting the dependencies
        (application as MyApp).applicationComponent
                .getMainComponent()
                .create(this)
                .inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.language.observe(this, Observer {
            tvLanguage.text = it.language
            tvDescription.text = it.desc
        })


        tvDescription.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        viewModel.onLanguageRequest()
    }
}