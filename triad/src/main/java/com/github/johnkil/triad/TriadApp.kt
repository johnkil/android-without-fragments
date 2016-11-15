package com.github.johnkil.triad

import com.nhaarman.triad.TriadApplication

class TriadApp : TriadApplication<ApplicationComponent>() {

  public override fun createApplicationComponent() = ApplicationComponent(triad)
}