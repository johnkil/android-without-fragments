package com.github.johnkil.screenplay

import com.davidstemmer.screenplay.stage.rigger.AnimResources

class CrossFadeAnimParams : AnimResources() {
  init {
    forwardIn = R.anim.fade_in
    backIn = R.anim.fade_in
    backOut = R.anim.fade_out
    forwardOut = R.anim.fade_out
    replaceIn = R.anim.fade_in
    replaceOut = R.anim.fade_out
  }
}