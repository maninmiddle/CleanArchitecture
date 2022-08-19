package com.example.cleanarchitecture.domain

import android.app.Activity

class AuthUserUseCase(private val authRepository: AuthRepository) {
    fun AuthUser(authItem: AuthItem, activity: Activity) {
        authRepository.authUser(authItem, activity)
    }
}