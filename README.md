# Architecture of Information Systems (AIS) – Debt Payback Calculator

## Project Overview

This repository contains a Java-based **Debt Payback Calculator** developed as part of the **Architecture of Information Systems (AIS)** coursework.

The application allows users to enter a debt amount, interest rate, and repayment duration in months. Based on these inputs, it calculates the monthly payback amount and the overall debt amount.

The project demonstrates core software architecture concepts such as modular design, separation of calculation logic, automated testing, build automation, and CI/CD pipeline integration.

## Features

- Calculates monthly debt repayment amount
- Calculates total debt payable over the selected duration
- Handles invalid input values such as zero or negative debt, interest rate, or duration
- Includes automated unit tests using JUnit
- Supports build automation using Apache Ant
- Includes Jenkins pipeline stages for build, test, mutation testing, and static bug analysis
- Uses PIT for mutation testing
- Uses SpotBugs for static code analysis

## Technologies Used

- **Programming Language:** Java
- **Java Version:** JDK 17
- **Testing Framework:** JUnit
- **Build Tool:** Apache Ant
- **CI/CD Tool:** Jenkins
- **Code Quality Tools:** PIT Mutation Testing, SpotBugs
- **IDE Support:** Eclipse
- **Version Control:** Git and GitHub

## Prerequisites

Before running this project, make sure the following tools are installed:

- Java JDK 17
- Apache Ant
- Eclipse IDE, optional
- Jenkins, optional for CI/CD pipeline execution

## Project Structure

```text
AIS-Debt-Payback-Calculator/
├── src/
│   └── DebtCollect/
│       ├── DebtPaybackCal.java
│       └── DebtPaybackCalTest.java
├── library/
├── build.xml
├── Jenkinsfile
├── .gitignore
├── .gitattributes
├── .classpath
├── .project
└── README.md
```

## Main Class

```text
src/DebtCollect/DebtPaybackCal.java
```

This class contains the main program logic. It accepts user input for:

- Debt value
- Interest rate
- Duration in months

It then calculates and displays:

- Monthly payback rate
- Number of repayment months
- Overall debt amount

## Installation Guide

### 1. Clone the Repository

```bash
git clone https://github.com/nikitabakhtar/AIS-Debt-Payback-Calculator.git
```

### 2. Navigate to the Project Directory

```bash
cd AIS-Debt-Payback-Calculator
```

### 3. Open the Project

You can open the project in **Eclipse IDE** or any Java-supported IDE.

For Eclipse:

1. Open Eclipse
2. Click `File > Import`
3. Select `Existing Projects into Workspace`
4. Choose the cloned `AIS-Debt-Payback-Calculator` folder
5. Finish the import

## Build and Run

### Clean the Project

```bash
ant clean
```

### Build the Project

```bash
ant build
```

### Run the Application

```bash
ant DebtPaybackCal
```

### Run Unit Tests

```bash
ant DebtPaybackCalTest
```

### Run Mutation Testing

```bash
ant pit
```

### Run SpotBugs Analysis

```bash
ant spotbugs
```

## Jenkins Pipeline

The repository includes a `Jenkinsfile` for CI/CD automation.

The Jenkins pipeline includes the following stages:

1. **Clean** – removes previous build files
2. **Build** – compiles the Java project
3. **Test** – runs unit tests
4. **Mutation** – runs PIT mutation testing
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

- Monthly repayment calculation
- Overall debt calculation
- Handling of invalid zero values
- Handling of invalid negative values

## Known Limitations

- The application currently runs through the command line only.
- Data is not stored in a database.
- The project does not include a graphical user interface.
- The interest calculation is simplified for academic demonstration purposes.
- The project is designed primarily for coursework and learning purposes.

## Learning Objectives

This project demonstrates the following AIS-related concepts:

- Modular software design
- Separation of business logic and input/output handling
- Automated testing
- Build automation with Apache Ant
- Continuous integration using Jenkins
- Mutation testing using PIT
- Static code analysis using SpotBugs
- Basic software quality assurance practices

## Future Improvements

- Improve input validation and user-friendly error messages
- Add support for compound interest calculation
- Add a graphical user interface
- Add database storage for repayment records
- Improve test coverage
- Add Maven or Gradle support
- Add detailed documentation for each calculation method
- Add GitHub Actions as an alternative CI/CD workflow

## Author

**Nikita Bakhtar**

GitHub: [nikitabakhtar](https://github.com/nikitabakhtar)

## Repository

[Architecture of Information Systems – Debt Payback Calculator](https://github.com/nikitabakhtar/AIS-Debt-Payback-Calculator)

## License

This project was developed for academic purposes as part of Architecture of Information Systems coursework.