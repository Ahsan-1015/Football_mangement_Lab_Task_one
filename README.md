# ⚽ Football Player Management System (Java OOP)

A simple Java project demonstrating core Object-Oriented Programming (OOP) concepts using football players from different leagues.

---

## 📌 Project Description

This project models football players from:

- La Liga
- Premier League

It uses an **abstract class** and two subclasses to demonstrate inheritance and method overriding.  
Each player has goals, matches played, and a confidential salary field.

The system calculates the **Goal Rate** of each player.

---

## 🚀 OOP Concepts Used

- Abstraction
- Inheritance
- Encapsulation
- Method Overriding
- Constructor Chaining (`super`)

---



### 🔹 LaLigaPlayer

- Extends `FootballPlayer`
- Overrides `calculateGoalRate()`
- Returns league name `"La Liga"`

---

### 🔹 PremierLeaguePlayer

- Extends `FootballPlayer`
- Overrides `calculateGoalRate()`
- Returns league name `"Premier League"`

---

## 🧮 Goal Rate Formula

Goal Rate = Goals / Matches Played

---

## ▶️ How to Run the Program

### 1️⃣ Compile

```bash
javac *.java
```

### 2️⃣ Run

```bash
java Main
```

---

## 🖥️ Sample Output

```
Player: Lionel Messi
League: La Liga
Goals Scored: 30
Goal Rate: 1.2

Player: Cristiano Ronaldo
League: Premier League
Goals Scored: 32
Goal Rate: 1.3333333333333333
```

---

## 📸 Output Screenshot

If you have `output.png` inside your repository folder, add this line to display it:

![Program Output](https://i.ibb.co/zVt6D8Ls/output.png)

---



## 👨‍💻 Author

Ahsan Habib  
ID :0272230005101015 

Java OOP Practice Project
