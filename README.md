# 🌦️ WeatherHub – Email Notification & Weather Broadcast Backend

WeatherHub is a **Spring Boot backend application** that provides:

* User authentication (JWT + OAuth2)
* Role-based access control
* Email notifications & broadcasting
* Redis-based caching
* Weather-based email broadcasts

This project focuses on **real backend concerns** such as security, scalability, caching, and external integrations rather than simple CRUD operations.

---

## 🚀 Key Features

### 🔐 Authentication & Authorization

* Email & password authentication
* OAuth2 login support
* JWT-based stateless authentication
* Role-based access (USER / ADMIN)
* Secure protected APIs using Spring Security

---

### 📧 Email Notification System

* Send emails to individual users
* Broadcast emails to all registered users
* Weather-based email notifications
* JavaMailSender integration
* Centralized email service layer

---

### ⚡ Redis Caching

* Cache user email lists in Redis
* Reduce database calls during broadcasts
* Configurable TTL for cached data
* JSON serialization using Jackson

---

### 🌤️ Weather Integration

* Fetch real-time weather data
* Append weather information to broadcast emails
* Encapsulated weather logic in service layer

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Security**
* **JWT**
* **OAuth2**
* **Redis**
* **Java Mail Sender**
* **Maven**
* **Lombok**
* **Swagger / OpenAPI**

---

## 📂 Project Structure

```
com.weatherhub.backend.Project
 ├── controller
 │    ├── AuthController
 │    ├── FeatureController
 │    ├── AdminController
 │    └── UserController
 ├── service
 │    ├── auth
 │    ├── email
 │    ├── redis
 │    ├── user
 │    └── weather
 ├── security
 │    ├── jwt
 │    └── OAuth2 configuration
 ├── model
 ├── repository
 └── exception
```

---

## 🔑 Configuration

Add the following to `application.properties` or `application.yml`:

```properties
api.prefix=/api/v1

# JWT
jwt.secret=your_secret
jwt.expiration=your_expiry

# Email
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email
spring.mail.password=your_app_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Redis
spring.data.redis.host=localhost
spring.data.redis.port=6379
```
> Use environment variables for production.

---

## 📌 API Overview

### 🔐 Authentication

* `POST /api/v1/auth/login`
* `POST /api/v1/auth/signup`
* OAuth2 login endpoints

---

### 📧 Email & Notifications

* `POST /api/v1/feature/send_email`
* `POST /api/v1/feature/broadcast`
* `POST /api/v1/feature/weather_information`

---

### 👤 User APIs

* `GET /api/v1/users/user`
* `PUT /api/v1/users/user/update`
* `DELETE /api/v1/users/user/delete`

---

### 🛡️ Admin APIs

* `GET /api/v1/admin/users`
* `DELETE /api/v1/admin/deleteUser/{id}`

(Admin access only)

---

## 🧠 How Email Broadcasting Works

1. Fetch weather information from redis
2. If cache exists → send emails directly
3. If cache missing:

   * Fetch weather information from external api
   * Cache the result in Redis
   * Broadcast emails


This design improves **performance and scalability** during bulk notifications.

---

## 🔒 Security Design

* Stateless authentication using JWT
* Custom JWT filter in security chain
* OAuth2 login handling with provider abstraction
* Role-based endpoint protection
* Custom access-denied responses

---

## 🧪 API Documentation

Swagger/OpenAPI is enabled for easy testing and exploration of APIs.

---

## 🔮 Future Improvements

* Dockerize application with Redis and Mail support
* Add async email sending (Spring @Async or messaging)
* Improve exception handling with global advice
* Add integration and unit tests
* Rate-limiting for broadcast endpoints
* Replace blocking email calls with queue-based processing

---

## 🤝 Feedback & Contributions

This project is part of my backend learning journey.
I welcome:

* Code reviews
* Architecture suggestions
* Best-practice feedback

Feel free to open issues or suggest improvements.

---

Thanks for taking the time to explore this project 🙌
