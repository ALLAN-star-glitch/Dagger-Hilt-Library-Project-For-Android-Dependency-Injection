package com.example.daggerhiltproj.data.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daggerhiltproj.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {
}