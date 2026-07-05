# Architecture of Information Systems (AIS) – Debt Payback Calculator

## Project Overview

This repository contains a Java-based **Debt Payback Calculator** developed as part of the **Architecture of Information Systems (AIS)** coursework.

The application allows users to enter a debt amount, interest rate, and repayment duration in months. Based on these inputs, it calculates the monthly payback amount and the overall debt amount. The project demonstrates basic software architecture principles such as modular design, separation of calculation logic, automated testing, and CI/CD pipeline integration.

## Features

* Calculates monthly debt repayment amount
* Calculates total debt payable over the selected duration
* Handles invalid input values such as zero or negative debt, interest, or duration
* Includes automated unit tests using JUnit
* Supports build automation using Apache Ant
* Includes Jenkins pipeline stages for build, test, mutation testing, and static bug analysis

## Technologies Used

* **Programming Language:** Java
* **Testing Framework:** JUnit
* **Build Tool:** Apache Ant
* **CI/CD:** Jenkins
* **Code Quality Tools:** PIT Mutation Testing, SpotBugs
* **IDE Support:** Eclipse project files
* **Version Control:** Git and GitHub

## Project Structure

```text
AIS/
├── src/
│   └── DebtCollect/
│       ├── DebtPaybackCal.java
│       └── DebtPaybackCalTest.java
├── bin/
│   └── DebtCollect/
├── library/
├── build.xml
├── Jenkinsfile
├── .classpath
├── .project
└── readme.md
```

## Main Class

```text
src/DebtCollect/DebtPaybackCal.java
```

This class contains the main program logic. It accepts user input for:

* Debt value
* Interest rate
* Duration in months

It then calculates and displays:

* Monthly payback rate
* Number of repayment months
* Overall debt amount

## Installation Guide

### 1. Clone the Repository

```bash
git clone https://github.com/nikitabakhtar/AIS.git
```

### 2. Navigate to the Project Directory

```bash
cd AIS
```

### 3. Open the Project

You can open the project in **Eclipse IDE** or any Java-supported IDE.

For Eclipse:

1. Open Eclipse
2. Click `File > Import`
3. Select `Existing Projects into Workspace`
4. Choose the cloned `AIS` folder
5. Finish the import

## Build and Run

### Using Apache Ant

To clean the project:

```bash
ant clean
```

To build the project:

```bash
ant build
```

To run the test target:

```bash
ant DebtPaybackCalTest
```

## Jenkins Pipeline

The repository includes a `Jenkinsfile` with the following pipeline stages:

1. **Clean** – cleans previous build files
2. **Build** – builds the Java project
3. **Test** – runs unit tests
4. **Mutation** – runs mutation testing
5. **Bugs** – runs static bug analysis using SpotBugs

## Sample Usage

When the program runs, the user is asked to enter:

```text
Enter Debt Value
Enter Interest Rate
Enter Duration in months
```

Example input:

```text
Debt Value: 10000
Interest Rate: 5
Duration: 12
```

Example output:

```text
Loan Details:
Monthly Payback Rate: 875.0 euros
Number of Rates: 12
Overall Debt: 10500.0 euros
```

## Testing

Unit tests are included in:

```text
src/DebtCollect/DebtPaybackCalTest.java
```

The tests verify:

* Monthly repayment calculation
* Overall debt calculation
* Handling of invalid input values

## Learning Objectives

This project demonstrates the following AIS-related concepts:

* Modular software design
* Separation of business logic and input/output handling
* Automated testing
* Build automation
* Continuous integration using Jenkins
* Code quality checking using static analysis tools

## Future Improvements

* Improve input validation and error messages
* Add support for compound interest calculation
* Add a graphical user interface
* Add database storage for repayment records
* Improve test coverage
* Add Maven or Gradle support
* Add detailed documentation for each calculation method

## Author

**Nikita Bakhtar**

GitHub: [nikitabakhtar](https://github.com/nikitabakhtar)

## Repository

[Architecture of Information Systems – AIS](https://github.com/nikitabakhtar/AIS)
