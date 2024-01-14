# Spring Boot Media Service

Welcome to the Spring Boot Media Service! This is a simple Spring Boot REST API service designed for storing image data in a MySQL database and retrieving it later.

## Table of Contents
- [Introduction](#introduction)
- [Clone and Run](#clone-and-run)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project aims to provide a straightforward solution for handling image data through a Spring Boot-based RESTful API. It leverages a MySQL database to store and retrieve images efficiently.

## Clone and Run

To clone and run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/Vimal1464/spring-boot-media-service.git
   ```

2. Navigate to the project directory:
   ```bash
   cd spring-boot-media-service
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   java -jar target/spring-boot-media-service.jar
   ```

The application will start, and you can access the API at [http://localhost:8080](http://localhost:8080).

## Features

- **Image Storage:** Upload and store image files in the MySQL database.
- **Image Retrieval:** Retrieve previously stored images based on their unique identifiers.

## Getting Started

Make sure you have the following prerequisites installed on your machine:

- Java Development Kit (JDK)
- Maven
- MySQL database

Update the `application.properties` file with your MySQL database configuration.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Usage

1. **Upload Image:**
   - Send a POST request to `/file/upload` with the image file as a multipart form data.
   - Example:
     ```bash
     curl -X POST -H "Content-Type: multipart/form-data" -F "file=@/path/to/your/image.jpg" http://localhost:8080/file/upload
     ```

2. **Retrieve Image:**
   - Send a GET request to `/file/{imagename}` to retrieve the image with the specified Image Name.
   - Example:
     ```bash
     curl http://localhost:8080/file/test.png --output retrieved_image.jpg
     ```

3. **Additional Operations:**
   - Explore other API endpoints for more operations, such as listing all images or deleting an image.

## Contributing

Feel free to contribute to the development of this project. Fork the repository, make your changes, and submit a pull request.
