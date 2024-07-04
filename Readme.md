# Weather Application - Help Guide

## Introduction

This guide provides step-by-step instructions on how to set up, run, and use the Weather Application. This application allows users to get current weather information for a specified city.

## Prerequisites

Before running the application, ensure you have the following installed on your machine:

1. **Java Development Kit (JDK)** - Version 8 or later.
2. **Maven** - Version 3.6.0 or later.
3. **Git** (optional) - If you want to clone the project from a repository.

## Getting Started

### Clone the Repository (Optional)

If you have Git installed, you can clone the repository using the following command:

```sh
git clone https://github.com/Rabie-Lafkir/weather.git
cd weather
```

### Build the Project
Navigate to the project directory and build the project using Maven:

```sh
mvn clean install
```

### Run the Application
You can run the application using Maven or by directly executing the JAR file.

Using Maven
```sh
mvn spring-boot:run
```

Using the JAR File:
First, package the application into a JAR file:
```sh
mvn clean package
```
Then, run the JAR file:
```sh
java -jar target/weather-app-3.3.1.jar
```

### Access the Application
Once the application is running, you can access it in your web browser at:

```sh
http://localhost:9090/weather
```

For any additional help or queries, please contact lafkirrabie2000@gmail.com


This `Readme.md` file now includes all necessary sections in Markdown language, covering prerequisites, getting started, building, running, accessing, using, troubleshooting, customization, dependencies, contributing, and licensing.

