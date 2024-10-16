package com.plcoding.daggerhiltcourse

import androidx.lifecycle.ViewModel
import com.example.daggerhiltproj.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository> //lazy injection... the repository implimentation instance is created when it is first used... but it is not supposedly created once we inject it
): ViewModel() {

    init {
        repository.get()
    }
}