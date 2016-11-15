package com.github.johnkil.conductor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler

class LoginController : Controller() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    val view = inflater.inflate(R.layout.controller_login, container, false)
    val signInButton = view.findViewById(R.id.sign_in_button)
    signInButton.setOnClickListener { signIn() }
    return view
  }

  private fun signIn() {
    router.pushController(RouterTransaction.with(WelcomeController())
        .pushChangeHandler(SimpleSwapChangeHandler())
        .popChangeHandler(SimpleSwapChangeHandler()))
  }
}