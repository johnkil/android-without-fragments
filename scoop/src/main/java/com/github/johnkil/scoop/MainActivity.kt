package com.github.johnkil.scoop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lyft.scoop.Router
import com.lyft.scoop.Scoop

class MainActivity : AppCompatActivity() {
  private val appRouter: Router by lazy { Router() }
  private val activityScoop: Scoop by lazy { Scoop.Builder("activity_scoop").build() }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onResume() {
    super.onResume()
    if (!appRouter.hasActiveScreen()) {
      appRouter.goTo(LoginScreen())
    }
  }
}