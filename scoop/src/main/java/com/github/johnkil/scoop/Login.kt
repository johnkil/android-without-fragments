package com.github.johnkil.scoop

import com.lyft.scoop.Controller
import com.lyft.scoop.EnterTransition
import com.lyft.scoop.ExitTransition
import com.lyft.scoop.Router
import com.lyft.scoop.Screen
import com.lyft.scoop.ViewController
import com.lyft.scoop.transitions.FadeTransition

@EnterTransition(FadeTransition::class)
@ExitTransition(FadeTransition::class)
@Controller(LoginController::class)
class LoginScreen : Screen()

class LoginController : ViewController() {
  private val router: Router? = null
  override fun layoutId() = R.layout.screen_login

  override fun onAttach() {
    val signInButton = view.findViewById(R.id.sign_in_button)
    signInButton.setOnClickListener { signIn() }
  }

  private fun signIn() {
    router!!.goTo(WelcomeScreen())
  }
}