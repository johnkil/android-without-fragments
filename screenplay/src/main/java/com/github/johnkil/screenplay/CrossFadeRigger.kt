package com.github.johnkil.screenplay

import android.app.Application
import com.davidstemmer.screenplay.stage.rigger.TweenRigger

class CrossFadeRigger(app: Application) : TweenRigger(app, CrossFadeAnimParams())