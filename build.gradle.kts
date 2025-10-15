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
    // Указываем главный класс приложения
    mainClass = ("hexlet.code.App")
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
tasks.withType<Checkstyle>().configureEach {
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(17))
    })
}
tasks.test {
    useJUnitPlatform()
}

