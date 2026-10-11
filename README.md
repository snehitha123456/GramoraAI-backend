# 🌾 Gramora AI — Backend

**AI-Powered Rural Grocery Delivery & Intelligent Inventory Management System**

Gramora AI is a backend application designed to support rural grocery delivery and inventory management. It provides APIs for managing grocery products, shopping carts, customer orders, delivery tracking, and inventory-related features.

## 🚀 Features

- **Product Management** — Retrieve and manage grocery products.
- **Shopping Cart** — Support grocery cart operations and order totals.
- **Order Management** — Place orders and store order details.
- **Delivery Charges** — Free delivery on orders of ₹99 or more; ₹10 delivery charge below ₹99.
- **Order Tracking** — Track order details using an order ID.
- **Inventory Management** — Support stock-related operations and inventory insights.
- **Database Integration** — Store application data using MySQL.
- **REST APIs** — Connect the backend with the React frontend.

## 🛠️ Technology Stack

- Java 21
- Spring Boot
- Maven
- MySQL 8
- REST APIs
- React and Vite (frontend integration)

## 📁 Project Structure

```text
gramora-backend/
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
└── README.md
```

## ⚙️ Prerequisites

Install the following before running the application:

- Java Development Kit (JDK) 21
- MySQL 8
- Git
- Visual Studio Code or another Java IDE

## 🗄️ Database Configuration

1. Start your MySQL server.
2. Create a database named `gramora_ai` if it does not already exist.
3. Configure the database URL, username, and password in your local Spring Boot configuration.

Example database URL:

```text
jdbc:mysql://localhost:3306/gramora_ai
```

**Security note:** Never upload real database passwords, API keys, or other credentials to a public repository. Use environment variables or a local configuration file for secrets.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/ayeshaayshu2101-boop/GramoraAI-backend.git
cd GramoraAI-backend
```

### 2. Configure MySQL

Ensure MySQL is running and your database credentials are configured correctly.

### 3. Start the backend

On Windows, run:

```powershell
.\mvnw.cmd spring-boot:run
```

The application is configured to run on port `8080` unless changed in the application configuration.

### 4. Connect the frontend

Start the Gramora AI React frontend separately and configure it to communicate with the backend API.

## 🧪 Testing

Use a browser, Postman, or another API client to test the backend endpoints. The available endpoints depend on the controllers implemented in the project.

## 🎯 Project Objective

The objective of Gramora AI is to make grocery ordering more convenient for rural communities while supporting better inventory management and reducing avoidable stock waste.

## 👩‍💻 Developer

**Ayesha — GitHub:** [@ayeshaayshu2101-boop](https://github.com/ayeshaayshu2101-boop)

## 📄 License

This project is currently intended for educational and demonstration purposes. Add a license if you plan to distribute or reuse the project publicly.
