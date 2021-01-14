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

    private lateinit var viewModel: MainViewModel

    // In this case @Inject is used to tell Dagger that repository must be injected
    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        // we're are requesting the dependencies
        (application as MyApp).applicationComponent.inject(this)
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
        val factory = ViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
    }
}