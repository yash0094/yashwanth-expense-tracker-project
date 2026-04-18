# yashwanth-expense-tracker-project
1. INTRODUCTION

Managing daily expenses manually is time-consuming and error-prone. People often lose track of where their money is spent. To overcome this problem, the Smart Expense Tracker is developed as a menu-driven command line application using Core Java, MySQL, and JDBC.

This system allows users to record expenses, categorize them, and view stored expense details efficiently using a database.


2. OBJECTIVES OF THE PROJECT

* To develop a simple expense tracking application using Java
* To understand JDBC connectivity with MySQL
* To store expense data in a structured database
* To implement CRUD operations
* To build a beginner-friendly menu-driven application


3. SCOPE OF THE PROJECT

* Users can add daily expenses
* Users can view all expenses
* Users can view expenses by category
* Users can view monthly expense summaries
* Designed for learning and academic purposes
* Works in a command line environment



4. TECHNOLOGIES USED
* Technology	Description
* Core Java	Application logic
* MySQL	Database storage
* JDBC	Java–Database connectivity
* Eclipse / IntelliJ	IDE
* MySQL Workbench / XAMPP	Database tool


5. SYSTEM REQUIREMENTS
Hardware Requirements
Processor: Intel i3 or higher
RAM: 4 GB minimum
Hard Disk: 10 GB free space
Software Requirements
JDK 8 or above
MySQL Server 8.x
MySQL Connector/J
Java IDE


6. PROJECT STRUCTURE
ExpenseTracker/
│
├── Main.java
├── DBConnection.java
├── Expense.java
├── ExpenseDAO.java

7. DATABASE DESIGN
Database Name
expense_tracker

Table: expenses
Field Name	Data Type	Description
id	INT (Primary Key, Auto Increment)	Expense ID
title	VARCHAR(100)	Expense title
category	VARCHAR(50)	Expense category
amount	DOUBLE	Expense amount
expense_date	DATE	Date of expense



8. MODULE DESCRIPTION
8.1 DBConnection Module

Establishes connection between Java and MySQL

Uses JDBC DriverManager

Returns Connection object

8.2 Expense (Model Class)

Represents expense entity

Contains variables, getters, and setters

8.3 ExpenseDAO Module

Performs database operations

Uses PreparedStatement for secure queries

Handles insert and select operations

8.4 Main Module

Displays menu options

Accepts user input

Controls program execution flow



9. FUNCTIONAL REQUIREMENTS

* Add new expense
* View all expenses
* View expenses by category
* View monthly expense summary
* Exit application


10. NON-FUNCTIONAL REQUIREMENTS

* Easy to use
* Fast data retrieval
* Secure database access
* Maintainable code structure



11. WORKING OF THE SYSTEM

* User starts the application
* Menu is displayed
* User selects an option
* Expense details are entered
* JDBC connects Java with MySQL
* Data is stored or retrieved from database
* Output is displayed on console


  
12. SAMPLE OUTPUT
===== SMART EXPENSE TRACKER =====
1. Add Expense
2. View All Expenses
3. View Expenses by Category
4. Monthly Expense Summary
5. Exit

Title: Groceries
Category: Food
Amount: 1200
Date: 2026-01-29
Expense added successfully.



13. ADVANTAGES OF THE SYSTEM

* Helps track daily expenses
* Reduces manual calculations
* Simple and efficient
* Suitable for beginners
* Real-world application


14. LIMITATIONS OF THE SYSTEM

* No user authentication
* Command line interface only
* No data visualization
* No export functionality



15. FUTURE ENHANCEMENTS

 * Add user login system
 * Convert CLI to GUI using JavaFX
 * Add charts and reports
 * Export data to Excel or CSV
 * Add budget limit feature



16. CONCLUSION

The Smart Expense Tracker is a simple and effective Java application that demonstrates JDBC connectivity and database handling. The project improves understanding of Core Java concepts and database operations, making it ideal for academic and learning purposes.



17. REFERENCES

* Oracle Java Documentation
* MySQL Official Documentation
* JDBC API Documentation
# Example