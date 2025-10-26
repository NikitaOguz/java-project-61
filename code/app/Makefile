.DEFAULT_GOAL := build-run

ifeq ($(OS),Windows_NT)
	GRADLE = gradlew.bat
else
	GRADLE = ./gradlew
endif

APP_DIR = app

setup:
	cd $(APP_DIR) && $(GRADLE) wrapper --gradle-version 9.1.0

clean:
	cd $(APP_DIR) && $(GRADLE) clean

build:
	cd $(APP_DIR) && $(GRADLE) clean build

install:
	cd $(APP_DIR) && $(GRADLE) clean install

run-dist:
	$(APP_DIR)/build/install/app/bin/app

run:
	cd $(APP_DIR) && $(GRADLE) run

test:
	cd $(APP_DIR) && $(GRADLE) test

report:
	cd $(APP_DIR) && $(GRADLE) jacocoTestReport

lint:
	cd $(APP_DIR) && $(GRADLE) spotlessApply

update-deps:
	cd $(APP_DIR) && $(GRADLE) refreshVersions
	# cd $(APP_DIR) && $(GRADLE) dependencyUpdates -Drevision=release

build-run: build run

.PHONY: build
