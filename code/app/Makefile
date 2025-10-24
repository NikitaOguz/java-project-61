.DEFAULT_GOAL := build-run

setup:
	gradlew.bat wrapper --gradle-version 9.1.0

clean:
	gradlew.bat clean

build:
	gradlew.bat clean build

install:
	gradlew.bat clean install

run-dist:
	build\install\app\bin\app

run:
	gradlew.bat run

test:
	gradlew.bat test

report:
	gradlew.bat jacocoTestReport

lint:
	gradlew.bat spotlessApply

update-deps:
	gradlew.bat refreshVersions
	# gradlew.bat dependencyUpdates -Drevision=release

build-run: build run

.PHONY: build
