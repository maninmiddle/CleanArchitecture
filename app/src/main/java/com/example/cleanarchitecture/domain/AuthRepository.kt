package com.example.cleanarchitecture.domain

import android.app.Activity

interface AuthRepository {

    fun authUser(authItem: AuthItem, activity: Activity)

    fun registrationUser(authItem: AuthItem, activity: Activity)
}