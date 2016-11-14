package com.github.johnkil.screenplay

import com.davidstemmer.screenplay.stage.Stage
import com.davidstemmer.screenplay.stage.Stage.Component
import com.davidstemmer.screenplay.stage.XmlStage

class LoginStage(val app: ScreenplayApp) : XmlStage() {
  val rigger by lazy { CrossFadeRigger(app) }

  init {
    addComponents(SignInComponent(app))
  }

  override fun getLayoutId(): Int {
    return R.layout.stage_login
  }

  override fun getRigger(): Stage.Rigger {
    return rigger
  }

  private class SignInComponent(val app: ScreenplayApp) : Component {
    override fun afterSetUp(stage: Stage, isInitializing: Boolean) {
      val signInButton = stage.view.findViewById(R.id.sign_in_button)
      signInButton.setOnClickListener { signIn() }
    }

    private fun signIn() {
      app.appFlow.set(WelcomeStage(app))
    }

    override fun beforeTearDown(stage: Stage, isFinishing: Boolean) {
    }
  }
}