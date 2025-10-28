.DEFAULT_GOAL := build-run

ifeq ($(OS),Windows_NT)
	GRADLE = gradlew.bat
else
	GRADLE = ./gradlew
endif

setup:
	$(GRADLE) wrapper --gradle-version 9.1.0

clean:
	$(GRADLE) clean

build:
	$(GRADLE) clean build

install:
	$(GRADLE) clean install

run-dist:
	@cmd /c build\install\app\bin\app.bat

run:
	$(GRADLE) run

test:
	$(GRADLE) test

report:
	$(GRADLE) jacocoTestReport

lint:
	$(GRADLE) spotlessApply

update-deps:
	$(GRADLE) refreshVersions

build-run: build run

.PHONY: build


