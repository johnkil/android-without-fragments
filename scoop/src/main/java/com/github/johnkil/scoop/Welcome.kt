package com.github.johnkil.scoop

import com.lyft.scoop.Controller
import com.lyft.scoop.EnterTransition
import com.lyft.scoop.ExitTransition
import com.lyft.scoop.Screen
import com.lyft.scoop.ViewController
import com.lyft.scoop.transitions.FadeTransition

@EnterTransition(FadeTransition::class)
@ExitTransition(FadeTransition::class)
@Controller(WelcomeController::class)
class WelcomeScreen : Screen()

class WelcomeController : ViewController() {
  override fun layoutId() = R.layout.screen_welcome
}