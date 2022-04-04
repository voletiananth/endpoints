package com.voleti.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class EndPointsTask : DefaultTask() {

    @TaskAction
    fun action(){
        println("Hello ")
    }

}