package com.example.myapplication.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentABinding
import com.example.myapplication.viewmodel.AViewModel

class AFragment : Fragment() {
    private val TAG = "winter"
    private lateinit var binding: FragmentABinding

    private val navController: NavController by lazy { Navigation.findNavController(binding.root) }
    private lateinit var viewModel: AViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[AViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        onButtonClickEvent()
    }

    private fun initialize() {
        /**
         * 1. lifecycleOwner, 일반 livedata 사용 시          -> testA
         * 2. viewLifecycleOwner, 일반 livedata 사용 시      -> testB
         * 3. viewLifecycleOwner, SingleLivedata 사용 시    -> testC
         * 4. viewLifecycleOwner, SingleLivedata 사용 시 initialize에 기능 추가   -> testD
         */

    }

    private fun testA() {
        viewModel.addValueToA()

        viewModel.listA.observe(this) {
            it.forEach{str ->
                Log.d(TAG, "size: ${it.size} / data: $str")
            }
        }
    }

    private fun testB() {
        viewModel.addValueToB()

        viewModel.listB.observe(viewLifecycleOwner) {
            it.forEach{str ->
                Log.d(TAG, "size: ${it.size} / data: $str")
            }
        }
    }

    private fun testC() {
        viewModel.addValueToC()

        viewModel.listC.observe(viewLifecycleOwner) {
            it.forEach{str ->
                Log.d(TAG, "size: ${it.size} / data: $str")
            }
        }
    }

    private fun testD() {
        viewModel.addValueToD()

        viewModel.listD.observe(viewLifecycleOwner) {
            it.forEach{str ->
                Log.d(TAG, "size: ${it.size} / data: $str")
            }
        }
    }
    private fun onButtonClickEvent() {
        with(binding) {
            btnGo.setOnClickListener {
                navController.navigate(R.id.BFragment)
            }
            btnA.setOnClickListener {
                viewModel.addValueToA()
            }
            btnB.setOnClickListener {
                viewModel.addValueToB()
            }
            btnD.setOnClickListener {
                viewModel.addValueToC()
            }
            btnD.setOnClickListener {
                viewModel.addValueToD()
            }
        }
    }
}


