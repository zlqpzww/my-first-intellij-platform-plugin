package com.github.zlqpzww.myfirstintellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.zlqpzww.myfirstintellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
