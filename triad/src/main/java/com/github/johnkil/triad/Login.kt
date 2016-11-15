package com.github.johnkil.triad

import android.content.Context
import android.util.AttributeSet
import com.nhaarman.triad.BasePresenter
import com.nhaarman.triad.Container
import com.nhaarman.triad.RelativeLayoutContainer
import com.nhaarman.triad.Screen
import com.nhaarman.triad.Triad
import kotlinx.android.synthetic.main.screen_login.view.emailEdit
import kotlinx.android.synthetic.main.screen_login.view.passwordEdit
import kotlinx.android.synthetic.main.screen_login.view.signInButton

class LoginScreen : Screen<ApplicationComponent>() {

  override val layoutResId = R.layout.screen_login

  override fun createPresenter(viewId: Int) = LoginPresenter(applicationComponent.triad)
}

interface LoginContainer : Container {
  fun setUpEmail(email: String)
  fun setUpPassword(password: String)
}

class LoginPresenter(private val triad: Triad) : BasePresenter<LoginContainer, ActivityComponent>() {

  fun signInButtonClicked() {
    triad.goTo(WelcomeScreen())
  }
}

class LoginView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) :
    RelativeLayoutContainer<LoginPresenter, ActivityComponent>(context, attrs,defStyle), LoginContainer {

  override fun onFinishInflate() {
    super.onFinishInflate()
    signInButton.setOnClickListener { presenter.signInButtonClicked() }
  }

  override fun setUpEmail(email: String) {
    emailEdit.setText(email)
  }

  override fun setUpPassword(password: String) {
    passwordEdit.setText(password)
  }
}