# Spring Boot DuckDB Application

This is a test application for learning AI assited coding. 

## Project Structure

```
spring-boot-duckdb-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── SpringBootDuckdbAppApplication.java
│   │   ├── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── SpringBootDuckdbAppApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   cd spring-boot-duckdb-app
   ```

2. Build the project:
   ```
   ./mvnw clean install
   ```

3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

## Configuration

The application properties can be configured in `src/main/resources/application.properties`. Make sure to set the correct database connection settings for DuckDB.

## Database Schema

The database schema can be defined in `src/main/resources/schema.sql`. You can add SQL statements to create tables and initialize data as needed.

## Running Tests

To run the tests, use the following command:
```
./mvnw test
```

## License

This project is licensed under the MIT License. See the LICENSE file for details.
