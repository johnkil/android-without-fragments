package com.github.johnkil.triad

import com.nhaarman.triad.BasePresenter
import com.nhaarman.triad.Container
import com.nhaarman.triad.Presenter
import com.nhaarman.triad.Screen

class WelcomeScreen : Screen<ApplicationComponent>() {

  override val layoutResId = R.layout.screen_welcome

  override fun createPresenter(viewId: Int): Presenter<*, *> = WelcomePresenter()
}

interface WelcomeContainer : Container

class WelcomePresenter() : BasePresenter<WelcomeContainer, ActivityComponent>()