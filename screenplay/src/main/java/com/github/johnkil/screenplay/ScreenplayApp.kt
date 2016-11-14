package com.github.johnkil.screenplay

import android.app.Application
import flow.Flow
import flow.History

class ScreenplayApp : Application() {
  val appFlow: Flow by lazy { Flow(History.single(LoginStage(this))) }

  override fun onCreate() {
    super.onCreate()
  }
}