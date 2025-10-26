plugins {
    id("java")
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
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    add("checkstyle", "com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}")
}

tasks.withType<JavaCompile> {
    options.release.set(17)
}

tasks.test {
    useJUnitPlatform()
}


