package com.github.duolabmeng6.testefundev.services

import com.github.duolabmeng6.testefundev.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
