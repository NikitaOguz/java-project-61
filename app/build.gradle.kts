plugins {
    id("application")
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

checkstyle {
    toolVersion = "10.12.4"
}

dependencies {
    add("checkstyle", "com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}")
}

tasks.withType<JavaCompile> {
    options.release.set(17)
}

tasks.test {
    useJUnitPlatform()
}


