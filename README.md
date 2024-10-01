# Spring Boot Department Management System

This is a simple Spring Boot application that demonstrates CRUD operations for managing department entities, using MySQL as the database.

## Features

- Add a new department.
- Retrieve a list of all departments.
- Get details of a specific department by ID.
- Update department details.
- Delete a department by ID.

## Technologies Used

- **Spring Boot**: Backend framework.
- **Spring Data JPA**: For interacting with the MySQL database.
- **MySQL**: Database to store department data.
- **REST API**: For handling HTTP requests.
- **Maven**: Build and dependency management.

## Requirements

- **Java 17+**
- **Maven**
- **MySQL**

## Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/SpringBoot-Department-Management.git
   cd SpringBoot-Department-Management
   ```

2. Configure the database in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/department_springboot_db
   spring.datasource.username=root
   spring.datasource.password=YourPassword
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   logging.level.org.springframework.web=DEBUG
   ```

3. Create the database in MySQL:

   ```sql
   CREATE DATABASE department_springboot_db;
   ```

4. Build and run the application using Maven:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

5. Use the following endpoints for interacting with the application:

   - **POST** `/departments`: Add a new department.
   - **GET** `/departments`: Retrieve all departments.
   - **GET** `/departments/{id}`: Retrieve a specific department by ID.
   - **PUT** `/departments/{id}`: Update a department.
   - **DELETE** `/departments/{id}`: Delete a department.
