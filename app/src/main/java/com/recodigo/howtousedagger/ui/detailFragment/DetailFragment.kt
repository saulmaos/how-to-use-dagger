package com.recodigo.howtousedagger.ui.detailFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.recodigo.howtousedagger.MyApp
import com.recodigo.howtousedagger.R
import com.recodigo.howtousedagger.data.repository.Repository
import com.recodigo.howtousedagger.ui.detailActivity.DetailActivity
import com.recodigo.howtousedagger.utils.ViewModelProviderFactory
import kotlinx.android.synthetic.main.fragment_details.*
import javax.inject.Inject

class DetailFragment private constructor(): Fragment() {

    private val viewModel: DetailViewModel by lazy {
        val factory = (requireActivity() as DetailActivity)
                .detailComponent
                .getDetailViewModelFactory()
        ViewModelProvider(this, factory).get(DetailViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val activity = (activity as DetailActivity)
        (activity.application as MyApp).applicationComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.language.observe(viewLifecycleOwner, Observer {
            tvLanguage.text = it.language
            tvDescription.text = it.desc
            tvYear.text = getString(R.string.year, it.year)
            tvCompany.text = getString(R.string.company, it.company)
        })

        viewModel.onLanguageRequest()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DetailFragment()
    }
}