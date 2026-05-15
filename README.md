# 📚 Book Search & Info App

A Java console application that allows users to search for books using the Open Library API.

This project was built to practice backend development fundamentals including:
- Java OOP
- APIs and HTTP requests
- JSON parsing
- DTOs (Data Transfer Objects)
- Jackson ObjectMapper
- Maven dependency management
- Separation of concerns

---

# 🚀 Features

- Search for books by title, author, or keyword
- Call the Open Library API
- Parse JSON API responses using Jackson
- Convert API data into Java DTO objects
- Display the top 3 search results
- Handle invalid input and empty search results

---

# 🛠️ Technologies Used

- Java
- Maven
- Jackson Databind
- Open Library Search API

---

# 🧠 What I Learned

## Java Fundamentals
- Classes and objects
- Constructors
- Getters and setters
- Lists and loops
- Exception handling
- Method responsibilities

## Backend Concepts
- HTTP GET requests using `HttpClient`
- JSON response handling
- Using `ObjectMapper`
- DTO design
- Separating UI logic from service logic
- Refactoring messy code into cleaner architecture

## Maven
- Creating a Maven project
- Adding external dependencies
- Understanding why dependency management matters

---

# 📂 Project Structure

```text
src/main/java
│
├── Main.java
├── BookService.java
└── BookDTO.java
```

## Main
Handles:
- user interaction
- menu logic
- displaying results

## BookService
Handles:
- API calls
- JSON parsing
- converting JSON into DTOs

## BookDTO
Represents one book result:
- title
- author
- publish year

---

# 🔄 Application Flow

```text
User Input
    ↓
Build API URL
    ↓
HTTP Request
    ↓
JSON Response
    ↓
ObjectMapper / JsonNode
    ↓
BookDTO objects
    ↓
Display results
```

---

# 📌 Future Improvements / Extensions

Possible future features to continue learning backend development concepts:

## Better Error Handling
- Create custom exception classes
- Handle API/network failures more cleanly

## Automatic DTO Mapping
- Use Jackson annotations to map JSON directly to DTOs
- Reduce manual JsonNode parsing

## Detailed Book View
- Let users select a book for more information

## Pagination
- Show more than 3 results
- Navigate through pages of books

## Spring Boot Version
- Convert project into a REST API
- Introduce Controllers and dependency injection

## Docker
- Containerize the application

## Testing
- Add unit tests using JUnit

---

# 🌐 API Used

Open Library Search API:

https://openlibrary.org/dev/docs/api/search

---

# ▶️ Running the Project

1. Clone the repository
2. Open in IntelliJ IDEA
3. Ensure Maven dependencies are installed
4. Run `Main.java`

---

# 📖 Why I Built This

I built this project to move from passive learning into hands-on backend development practice.

The goal was not only to learn Java syntax, but also to understand how real backend applications:
- call APIs
- process JSON
- structure code
- separate responsibilities
- use DTOs and services

I also built this project as part of my progression toward developing full backend applications using Spring Boot, with the long-term goal of understanding microservices architecture and enterprise backend systems.
