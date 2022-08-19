package com.example.cleanarchitecture.presentation.main

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.data.AuthRepositoryImpl
import com.example.cleanarchitecture.domain.AuthItem
import com.example.cleanarchitecture.domain.AuthRepository
import com.example.cleanarchitecture.domain.AuthUserUseCase
import com.example.cleanarchitecture.domain.RegistrationUserUseCase

class MainViewModel : ViewModel() {
    private val repository = AuthRepositoryImpl

    private val authUser = AuthUserUseCase(repository)
    private val registrationUser = RegistrationUserUseCase(repository)

    val userData = MutableLiveData<AuthItem>()

    fun registrationUser(authItem: AuthItem, activity: Activity) {
        val user = registrationUser.registrationUser(authItem, activity)
        userData.value = AuthItem(user.username, user.password)
    }
}