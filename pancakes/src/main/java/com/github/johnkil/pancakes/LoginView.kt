package com.github.johnkil.pancakes

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class LoginView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

  override fun onFinishInflate() {
    super.onFinishInflate()
    if (isInEditMode) return

    val signInButton = findViewById(R.id.sign_in_button)
    signInButton.setOnClickListener { signIn() }
  }

  private fun signIn() {
    val viewStack = (context as ViewStackActivity).viewStack()
    viewStack.push(R.layout.view_welcome)
  }
}