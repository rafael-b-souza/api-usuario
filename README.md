# API-USUARIO Project

This project is a university assignment. It demonstrates the creation of a user API using Spring Boot, H2 Database, and other technologies covered in our coursework.

## Description

The API-USUARIO project is designed to manage user data with functionalities that include creating, reading, and retrieving user information. It follows best practices in RESTful API development and includes features such as data validation and exception handling.

## Technologies Used

- **Spring Boot**
- **Spring Web**
- **Lombok**
- **H2 Database**
- **Spring Data JPA**
- **Validation**


## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/api-usuario.git
   ```

2. **Navigate to the project directory:**
    ```bash
    cd api-usuario
    ```

3. **Build the project:**

    ```bahs
    mvn clean install
    ```

4. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

5. **Access the API endpoints:**

    POST /usuarios
    GET /usuarios
    GET /usuarios/{id}
