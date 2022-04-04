package com.voleti.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class EndPoints : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.register("networkEndpoints",EndPointsTask::class.java)
    }
}