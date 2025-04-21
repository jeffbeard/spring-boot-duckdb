# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands
- Build project: `./mvnw clean install`
- Run application: `./mvnw spring-boot:run`
- Run all tests: `./mvnw test`
- Run single test: `./mvnw test -Dtest=TestClassName#testMethodName`
- Check code style: `./mvnw checkstyle:check`

## Code Style Guidelines
- Java version: 17
- Spring Boot version: 2.7.12
- Use PascalCase for class names, camelCase for methods and variables
- Follow standard Spring Boot application structure
- Group imports: java.*, javax.*, org.*, com.*
- Use constructor injection for Spring dependencies
- Use Java Records for DTOs/POJOs where appropriate
- Use Optional<T> for nullable return values
- Handle exceptions with @ExceptionHandler
- Always validate input parameters with @Valid for REST endpoints
- Use JUnit 5 for testing with descriptive test names