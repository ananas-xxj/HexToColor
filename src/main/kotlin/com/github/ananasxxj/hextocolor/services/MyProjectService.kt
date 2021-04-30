package com.github.ananasxxj.hextocolor.services

import com.github.ananasxxj.hextocolor.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
