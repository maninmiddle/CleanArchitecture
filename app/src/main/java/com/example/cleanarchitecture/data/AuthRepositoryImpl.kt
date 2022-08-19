package com.example.cleanarchitecture.data

import android.app.Activity
import android.util.Log
import android.widget.Toast
import com.example.cleanarchitecture.domain.AuthItem
import com.example.cleanarchitecture.domain.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

object AuthRepositoryImpl : AuthRepository {
    private lateinit var auth: FirebaseAuth


    override fun authUser(authItem: AuthItem, activity: Activity) {
        TODO("Not yet implemented")
    }

    override fun registrationUser(authItem: AuthItem, activity: Activity) {
        auth = Firebase.auth

        auth.createUserWithEmailAndPassword(authItem.username.trim(), authItem.password.trim())
            .addOnCompleteListener(activity) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(activity, "All right", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(activity, "${task.exception}", Toast.LENGTH_SHORT).show()
                    Log.e("Error", "${task.exception}")
                }
            }
    }

}