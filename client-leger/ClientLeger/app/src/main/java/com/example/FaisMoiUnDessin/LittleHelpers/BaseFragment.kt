package com.example.FaisMoiUnDessin.LittleHelpers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.FaisMoiUnDessin.Repository.BaseRepository
import com.example.FaisMoiUnDessin.ViewModel.ViewModelFactory

abstract class BaseFragment<VM: ViewModel, B: ViewBinding, R: BaseRepository> : Fragment() {

    protected lateinit var binding: B
    protected lateinit var viewModel: VM
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        binding = getFragmentBinding(inflater, container)
        val factory = ViewModelFactory(this.getFragmentRepository())
        viewModel = ViewModelProvider(this, factory).get(this.getViewModel())
        return binding.root
    }

    abstract fun getViewModel(): Class<VM>

    abstract fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): B

    abstract fun getFragmentRepository(): R

}