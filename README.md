# Audit Logging System

## Overview

This project is a simple Audit Logging System developed in Java.

The application records important system events and stores them in a text file together with timestamps. The purpose of the project is to demonstrate basic event monitoring and logging concepts commonly used in information systems and cybersecurity.

## Features

* Records login attempts
* Records logout events
* Records errors
* Stores events in a text file
* Includes timestamps for each event
* Well-commented source code

## Technologies Used

* Java
* FileWriter
* LocalDateTime

## Project Structure

```text
Java Audit Logging System
│
├── AuditLoggingSystem.java
├── audit_logs.txt
├── AUDIT LOGGING SYSTEM.docx
├── code.png
├── execution.png
├── logs.png
└── README.md
```

## How to Run

Compile the program:

```bash
javac AuditLoggingSystem.java
```

Run the program:

```bash
java AuditLoggingSystem
```

## Example Output

```text
2026-06-17T15:43:34.552092100 - LOGIN ATTEMPT
2026-06-17T15:43:34.558157300 - LOGOUT
2026-06-17T15:43:34.558157300 - ERROR
```

## Security Concepts Demonstrated

This project demonstrates:

* Audit Logging
* User Activity Monitoring
* Error Tracking
* Event Timestamping
* Basic Cybersecurity Practices

## Author

Angjela Zefi
