# 🌾 Gramora AI — Backend

**AI-Powered Rural Grocery Delivery & Intelligent Inventory Management System**

Gramora AI is a Spring Boot backend for rural grocery delivery, product management, customer orders, delivery tracking, and inventory management.

## 🚀 Features

- Product management
- Shopping cart and order totals
- Order creation and tracking
- Free delivery for orders of ₹99 or more
- ₹10 delivery charge for orders below ₹99
- Inventory management
- MySQL database integration
- REST APIs for the React frontend

## 🛠️ Technology Stack

- Java 21
- Spring Boot
- Maven
- MySQL 8
- REST APIs
- React and Vite frontend integration

## 📁 Project Structure

```text
gramora-backend/
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/gramora/gramora_backend/
    │   │       ├── controller/
    │   │       ├── model/
    │   │       ├── repository/
    │   │       ├── service/
    │   │       └── GramoraBackendApplication.java
    │   └── resources/
    │       └── application.properties
    └── test/
```

## ⚙️ Prerequisites

- Java Development Kit (JDK) 21
- MySQL, if using a MySQL database
- Git
- Visual Studio Code or another Java IDE

## 🗄️ Database Configuration

The application uses environment variables for database configuration.

Example local settings:

```properties
DB_URL=jdbc:mysql://localhost:3306/gramora_ai
DB_USERNAME=root
DB_PASSWORD=your_local_password
```

Use your own database credentials. Never commit real passwords or secrets to GitHub.

## ▶️ How to Run

Open a terminal in the `gramora-backend` directory.

On Windows, run:

```powershell
.\mvnw.cmd spring-boot:run
```

The backend is configured to use port `8080`, unless changed in the application settings.

## 🔗 Frontend Integration

Run the Gramora AI React frontend separately and configure its API URL to point to the backend.

## 🎯 Project Objective

Gramora AI aims to make grocery ordering more convenient for rural communities while supporting inventory management and reducing avoidable stock waste.

## 📄 License

This project is intended for educational and demonstration purposes.
