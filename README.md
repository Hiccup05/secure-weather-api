# Technical Project

## Overview
This is a Java Spring Boot project demonstrating backend capabilities such as authentication, external API integration, email broadcasting, and database-backed data tracking.  
The repository is intended as a coding demonstration of modern backend practices rather than a production-ready application.

## Features
- Authentication
  - JWT (JSON Web Token) authentication
  - Basic authentication support (for quick testing / fallback)
- User Management
  - User entity persisted in a relational database
  - A hardcoded demonstration user included for quick testing
- Weather Data Integration
  - Fetches weather data from an external API
  - Converts and formats weather data to a string before broadcasting
- Email Broadcasting
  - Sends weather updates to the hardcoded user
  - Uses Spring's JavaMailSender (configurable SMTP)
  - Tracks broadcasts in the database
- Database Integration
  - Uses Spring Data JPA
  - Works with PostgreSQL in production and H2 for quick testing

## Technologies
- Java 21
- Spring Boot
- Spring Security (JWT & Basic Auth)
- Spring Data JPA
- PostgreSQL (recommended) / H2 (tests / quick run)
- JavaMailSender (Spring Boot Starter Mail)
- External Weather API (configurable endpoint)
