package com.example.dogapp.ui.List

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dogapp.data.api.ApiHelper
import com.example.dogapp.data.api.RetrofitBuilder
import com.example.dogapp.databinding.FragmentListBinding
import com.example.dogapp.ui.base.MainViewModel
import com.example.dogapp.ui.base.ViewModelFactory
import com.example.dogapp.ui.search.DogSearchAdapter

class DogListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!
    private val adapter by lazy { DogSearchAdapter() }
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        setListeners()
        configSearch()
        binding.breedGrid.adapter = adapter

    }

    private fun configSearch() {
        binding.searchBreedTextview.doAfterTextChanged {
//            viewModel.getUsers()
        }
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(
            this,
            ViewModelFactory(ApiHelper(RetrofitBuilder.apiService))
        )[MainViewModel::class.java]
    }

    private fun setListeners() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}