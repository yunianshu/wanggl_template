package com.github.yunianshu.wanggltemplate.services

import com.intellij.openapi.project.Project
import com.github.yunianshu.wanggltemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
