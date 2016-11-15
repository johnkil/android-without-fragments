package com.github.johnkil.triad

import android.os.Bundle
import com.nhaarman.triad.TriadAppCompatActivity

class MainActivity : TriadAppCompatActivity<ApplicationComponent, ActivityComponent>() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    triad.startWith(LoginScreen())
  }

  override fun createActivityComponent() = ActivityComponent()
}