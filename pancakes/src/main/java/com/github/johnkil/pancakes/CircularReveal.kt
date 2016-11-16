package com.github.johnkil.pancakes

import android.animation.Animator
import android.view.View
import android.view.ViewAnimationUtils
import me.mattlogan.library.AnimatorFactory

class CircularReveal : AnimatorFactory {

  override fun createAnimator(view: View): Animator {
    // get the center for the clipping circle
    val cx = view.width / 2
    val cy = view.height / 2

    // get the final radius for the clipping circle
    val finalRadius = Math.max(view.width, view.height).toFloat()

    // create the animator for this view (the start radius is zero)
    return ViewAnimationUtils.createCircularReveal(view, cx, cy, 0f, finalRadius).setDuration(400)
  }
}