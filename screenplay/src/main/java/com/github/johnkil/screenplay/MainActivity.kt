package com.github.johnkil.screenplay

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import com.davidstemmer.flow.plugin.screenplay.ScreenplayDispatcher
import flow.Flow
import flow.Flow.Direction.REPLACE
import flow.History

class MainActivity : AppCompatActivity() {
  private lateinit var app: ScreenplayApp
  private lateinit var flow: Flow
  private lateinit var dispatcher: ScreenplayDispatcher

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    app = application as ScreenplayApp
    flow = app.appFlow

    val container = findViewById(R.id.stage_container) as ViewGroup
    dispatcher = ScreenplayDispatcher(this, container)
    dispatcher.setUp(flow)
  }

  override fun onBackPressed() {
    if (!flow.goBack()) {
      flow.removeDispatcher(dispatcher)
      flow.setHistory(History.single(LoginStage(app)), REPLACE)
      super.onBackPressed()
    }
  }

  override fun onDestroy() {
    super.onDestroy()
    dispatcher.tearDown(flow)
  }
}