# Gramora AI – AI-Powered Rural Grocery Delivery

Gramora AI is a rural grocery delivery and intelligent inventory management system designed to make essential groceries accessible to village communities.

## Features

- **Product Management:** Manage grocery products and product details.
- **Cart Management:** Add and manage products in the shopping cart.
- **Order Management:** Place orders and track order details.
- **Inventory Management:** Monitor stock levels.
- **Supplier Management:** Maintain supplier information.
- **User Management:** Manage user records.
- **REST APIs:** Backend endpoints built with Spring Boot.
- **Database Integration:** Connect the application to a database.

## Technology Stack

- Java
- Spring Boot
- Maven
- Spring Data JPA
- MySQL
- REST APIs

## Project Structure

```text
gramora-backend/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/gramora/gramora_backend/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── GramoraBackendApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Running the Backend

### Prerequisites

- Java Development Kit (JDK)
- MySQL, if using MySQL as configured
- Git

### Steps

1. Clone this repository.
2. Configure the database connection locally.
3. Open a terminal in the project directory.
4. Run the application on Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

The backend will start on the port configured in the application settings.

## Security

Do not commit database passwords, API keys, or other sensitive credentials. Configure these securely in your local environment.

## Project Purpose

Gramora AI aims to support rural grocery businesses through online ordering, delivery management, and intelligent inventory tools.
