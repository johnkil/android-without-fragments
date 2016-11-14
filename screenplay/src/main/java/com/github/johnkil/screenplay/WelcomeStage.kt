package com.github.johnkil.screenplay

import com.davidstemmer.screenplay.stage.Stage
import com.davidstemmer.screenplay.stage.XmlStage

class WelcomeStage(val app: ScreenplayApp) : XmlStage() {
  val rigger by lazy { CrossFadeRigger(app) }

  override fun getLayoutId(): Int {
    return R.layout.stage_welcome
  }

  override fun getRigger(): Stage.Rigger {
    return rigger
  }
}