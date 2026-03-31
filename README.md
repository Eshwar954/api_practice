# User Management System

## Overview
This is a Spring Boot-based web application for managing users using a clean layered architecture. It uses Thymeleaf for server-side rendering and follows best practices such as DTO separation, validation, and global exception handling.

The project is designed to be maintainable, scalable, and easy for team collaboration.

---

## Tech Stack

- **Backend:** Spring Boot  
- **Frontend:** Thymeleaf  
- **Database:** MySQL / H2  
- **ORM:** Spring Data JPA  
- **Validation:** Jakarta Validation  
- **Boilerplate Reduction:** Lombok  
- **Build Tool:** Maven  

---

## Project Structure

```
com.example.api_practice
│
├── controller        # Handles HTTP requests
├── service           # Business logic
├── repository        # Data access layer
├── entity            # JPA entities
├── dto               # Request and Response DTOs
├── exception         # Custom and global exception handling
└── templates         # Thymeleaf views
```

---

## Features

### User Management
- Create user  
- View all users  
- Fetch user by ID  

### Validation
- Name must not be empty and has minimum length  
- Email must be in valid format  
- Password must meet minimum length requirement  

### Exception Handling
- Centralized global exception handler  
- Handles validation errors, missing resources, and duplicate data  

### Architecture
- Clear separation of concerns  
- DTO-based data transfer  
- Layered design (Controller → Service → Repository)  

---

## Endpoints

| Method | Endpoint        | Description        |
|--------|----------------|--------------------|
| GET    | `/`            | Load UI page       |
| POST   | `/users`       | Create user        |
| GET    | `/users`       | Get all users      |
| GET    | `/users/{id}`  | Get user by ID     |

---

## UI

- Form for creating users  
- Inline validation error messages  
- Table view of users  
- Bootstrap-based layout  

---

## Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.cache=false
```

---

## Running the Application

1. Clone the repository  
2. Configure the database in `application.properties`  
3. Run:

```bash
mvn clean install
mvn spring-boot:run
```

4. Open in browser:

```
http://localhost:8080/
```

---

## Notes

- Passwords are stored as plain text and should be encrypted in future improvements  
- This project is intended for learning and extension  

---

## Future Improvements

- Password encryption  
- Authentication and authorization  
- Pagination and filtering  
- UI enhancements  
- API expansion  

---

## Summary

This project demonstrates a structured approach to building a Spring Boot application using server-side rendering, validation, and clean architecture principles. It provides a solid foundation for further development and scaling.
