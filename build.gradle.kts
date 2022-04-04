plugins {
    kotlin("jvm") version "1.5.10"
    groovy
    java
    id("java-gradle-plugin")
    `maven-publish`

}

group = "com.voleti.plugin"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.codehaus.groovy:groovy-all:3.0.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/voletiananth/endpoints")
            credentials {
                username = project.findProperty("gpr.user").toString()
                password = project.findProperty("gpr.key").toString()
            }
        }
    }
   publications{
        register<MavenPublication>("gpr"){
            groupId = "com.voleti.plugin"
            artifactId = "endpoints"
            version = "1.0.0"
            from(components["java"])
        }
   }
}



tasks.getByName<Test>("test") {
    useJUnitPlatform()
}