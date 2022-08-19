package com.example.cleanarchitecture.domain

import android.app.Activity

class RegistrationUserUseCase(private val authRepository: AuthRepository) {

    fun registrationUser(authItem: AuthItem, activity: Activity): AuthItem {
        authRepository.registrationUser(authItem, activity)
        return authItem
    }
}
