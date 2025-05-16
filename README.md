# User_Login_Registration_System

# 🛡️ Spring Boot User Login and Registration System

A simple and secure user authentication system built with **Spring Boot**, **Spring Security**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**. It allows users to register, login, and access a protected dashboard.

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- Hibernate
- MySQL
- Bootstrap (CDN)

---

## 📌 Features

- ✅ User Registration with validation
- ✅ Password encryption using BCrypt
- ✅ Role-based user management (`ROLE_USER`)
- ✅ Custom Login and Logout
- ✅ Spring Security integration
- ✅ Protected Dashboard after login
- ✅ MVC architecture with DTO layer
- ✅ Session-based authentication

---

## 📁 Project Structure

com.example.User_Login_System
│
├── Controller
│ └── userController.java
├── Config
│ └── webConfig.java
├── Dto
│ └── UserDto.java
├── Model
│ └── User.java, Role.java
├── Repository
│ └── UserRepository.java, RoleRepository.java
├── Service
│ └── userservice.java, userimpl.java, CustomUserDetailsService.java
├── templates
│ └── register.html, login.html, dashboard.html
└── UserLoginSystemApplication.java

## Outputs

**#Starting the project**
![image](https://github.com/user-attachments/assets/caaf86ba-fa80-4801-abe3-9d63fff342dd)

**#Registration page**
![image](https://github.com/user-attachments/assets/26bfd3be-48bb-44ee-bec4-56a37c25385c)

**#Login page**
![image](https://github.com/user-attachments/assets/f481ec90-64b4-4bd6-82b0-f7a4f38ff5ef)

**#Dashboard page**
![image](https://github.com/user-attachments/assets/0c2c14a0-8da5-4e6f-b35f-16db8baf3e83)

**#Mysql Database table**
![image](https://github.com/user-attachments/assets/16b489cf-1732-4e0a-af90-252b81ab9342)



