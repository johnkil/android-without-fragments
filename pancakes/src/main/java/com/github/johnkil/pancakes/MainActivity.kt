package com.github.johnkil.pancakes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import me.mattlogan.library.ViewStack
import me.mattlogan.library.ViewStackDelegate

class MainActivity : AppCompatActivity(), ViewStackActivity, ViewStackDelegate {
  private val STACK_TAG = "stack"
  private lateinit var viewStack: ViewStack

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    viewStack = ViewStack.create(findViewById(R.id.view_container) as ViewGroup, this)
    if (savedInstanceState != null) {
      viewStack.rebuildFromBundle(savedInstanceState, STACK_TAG);
    } else {
      viewStack.push(R.layout.view_login)
    }
  }

  override fun onSaveInstanceState(outState: Bundle) {
    viewStack.saveToBundle(outState, STACK_TAG)
    super.onSaveInstanceState(outState)
  }

  override fun onBackPressed() {
    viewStack.pop()
  }

  override fun viewStack() = viewStack

  override fun finishStack() {
    finish()
  }
}