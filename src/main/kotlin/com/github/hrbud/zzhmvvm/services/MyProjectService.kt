package com.github.hrbud.zzhmvvm.services

import com.intellij.openapi.project.Project
import com.github.hrbud.zzhmvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
