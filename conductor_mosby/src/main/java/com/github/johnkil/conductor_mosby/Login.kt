package com.github.johnkil.conductor_mosby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter
import com.hannesdorfmann.mosby.mvp.MvpView
import com.hannesdorfmann.mosby.mvp.conductor.MvpController

class LoginController : MvpController<LoginView, LoginPresenter>(), LoginView {

  override fun createPresenter() = LoginPresenter()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    val view = inflater.inflate(R.layout.controller_login, container, false)
    val signInButton = view.findViewById(R.id.sign_in_button)
    signInButton.setOnClickListener { presenter.signInButtonClicked() }
    return view
  }

  override fun showWelcomeScreen() {
    router.pushController(RouterTransaction.with(WelcomeController())
        .pushChangeHandler(SimpleSwapChangeHandler())
        .popChangeHandler(SimpleSwapChangeHandler()))
  }
}

interface LoginView : MvpView {
  fun showWelcomeScreen()
}

class LoginPresenter : MvpBasePresenter<LoginView>() {

  fun signInButtonClicked() {
    view?.showWelcomeScreen()
  }
}