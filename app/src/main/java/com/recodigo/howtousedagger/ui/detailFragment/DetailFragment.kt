package com.recodigo.howtousedagger.ui.detailFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.MyApp
import com.recodigo.howtousedagger.R
import com.recodigo.howtousedagger.utils.ViewModelProviderFactory
import kotlinx.android.synthetic.main.fragment_details.*

class DetailFragment private constructor(): Fragment() {

    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        createViewModel()
        viewModel.language.observe(viewLifecycleOwner, Observer {
            tvLanguage.text = it.language
            tvDescription.text = it.desc
            tvYear.text = getString(R.string.year, it.year)
            tvCompany.text = getString(R.string.company, it.company)
        })

        viewModel.onLanguageRequest()
    }

    private fun createViewModel() {
        val repository = (requireActivity().application as MyApp).repository
        val factory = ViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(DetailViewModel::class.java)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DetailFragment()
    }
}