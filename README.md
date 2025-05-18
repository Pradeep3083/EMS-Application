# 🧑‍💼 Employee Management System (EMS)

A full-stack web application for managing employees using **Java Spring Boot**, **HTML**, **CSS**, **JavaScript**, **MySQL**, and **Render**.

---

## 🚀 Live Demo

🔗 [https://ems-application.onrender.com](https://ems-application.onrender.com)

---

## 📌 Features

- View all employees
- Add a new employee
- Update existing employee details
- Delete an employee
- Responsive UI using Thymeleaf templates
- Persistent data with MySQL database (hosted on Railway)

---

## 🛠️ Tech Stack

| Layer         | Technology             |
|---------------|------------------------|
| Backend       | Java, Spring Boot      |
| Frontend      | HTML, CSS, Thymeleaf   |
| Database      | MySQL (Railway)        |
| Build Tool    | Maven                  |
| Deployment    | Backend on Render.com  |

---

## 📁 Folder Structure

EMS-Application/
├── src/
│ ├── main/
│ │ ├── java/com/example/EMS/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ └── service/
│ │ └── resources/
│ │ ├── templates/
│ │ │ ├── index.html
│ │ │ ├── addEmployee.html
│ │ │ └── update.html
│ │ └── application.properties
├── pom.xml
└── Dockerfile

---

## ⚙️ How It Works

- The homepage (`/`) shows a list of all employees (`index.html`)
- You can add a new employee via `/add`
- Data is saved to a remote MySQL database using Spring Data JPA
- The application is deployed using Docker on **Render**

---

## 📦 How to Run Locally

### Prerequisites:
- Java 17 or higher
- Maven
- MySQL installed locally or use a cloud provider (e.g., Railway)

### Steps:

```bash
# Clone the repo
git clone https://github.com/Pradeep3083/EMS-Application.git
cd EMS-Application/EMS

# Add your database credentials in application.properties

# Build and run
mvn spring-boot:run


