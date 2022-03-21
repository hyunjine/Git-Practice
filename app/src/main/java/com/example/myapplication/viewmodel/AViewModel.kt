package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.SingleLiveEvent

class AViewModel: ViewModel() {
    private var countA = 0
    private val _listA = MutableLiveData<ArrayList<Int>>()
    val listA: LiveData<ArrayList<Int>>
        get() = _listA

    private var countB = 0
    private val _listB = MutableLiveData<ArrayList<Int>>()
    val listB: LiveData<ArrayList<Int>>
        get() = _listB

    private var countC = 0
    private val _listC = SingleLiveEvent<ArrayList<Int>>()
    val listC: LiveData<ArrayList<Int>>
        get() = _listC

    private var countD = 0
    private val _listD = SingleLiveEvent<ArrayList<Int>>()
    val listD: LiveData<ArrayList<Int>>
        get() = _listD

    fun addValueToA() {
        var list = _listA.value
        if (list == null) {
            _listA.postValue(ArrayList())
            list = ArrayList()
        }
        countA++
        list.add(countA)
        _listA.postValue(list!!)
    }

    fun addValueToB() {
        var list = _listB.value
        if (list == null) {
            _listB.postValue(ArrayList())
            list = ArrayList()
        }
        countB++
        list.add(countB)
        _listB.postValue(list!!)
    }

    fun addValueToC() {
        var list = _listC.value
        if (list == null) {
            _listC.postValue(ArrayList())
            list = ArrayList()
        }
        countC++
        list.add(countC)
        _listC.postValue(list!!)
    }

    fun addValueToD() {
        var list = _listD.value
        if (list == null) {
            _listD.postValue(ArrayList())
            list = ArrayList()
        }
        countD++
        list.add(countD)
        _listD.postValue(list!!)
    }
}