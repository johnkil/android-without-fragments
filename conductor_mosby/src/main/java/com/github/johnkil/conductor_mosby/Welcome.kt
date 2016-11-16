package com.github.johnkil.conductor_mosby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter
import com.hannesdorfmann.mosby.mvp.MvpView
import com.hannesdorfmann.mosby.mvp.conductor.MvpController

class WelcomeController : MvpController<WelcomeView, WelcomePresenter>(), WelcomeView {

  override fun createPresenter() = WelcomePresenter()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    return inflater.inflate(R.layout.controller_welcome, container, false)
  }
}

interface WelcomeView : MvpView

class WelcomePresenter : MvpBasePresenter<WelcomeView>()