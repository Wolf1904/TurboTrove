TurboTrove Management System
===========================

Overview
--------

TurboTrove is a management system for a car dealership. It allows users to add, view, and manage showrooms, employees, and cars.

Features
--------

* Add new showrooms, employees, and cars
* View details of existing showrooms, employees, and cars
* Exit the program at any time

Usage
-----

1. Run the `Main` class to start the program.
2. The main menu will be displayed, with options to add showrooms, employees, cars, or view existing data.
3. Choose an option by entering the corresponding number.
4. Follow the prompts to add or view data.
5. To exit the program, enter `0` at any time.

Classes
-------

* `uitlity`: An interface that defines the `get_details()` and `set_details()` methods.
* `Showroom`: A class that implements the `uitlity` interface, representing a showroom.
* `Employees`: A class that implements the `uitlity` interface, representing an employee.
* `Cars`: A class that implements the `uitlity` interface, representing a car.
* `Main`: The main class that contains the program's entry point and logic.

Technical Details
-----------------

* The program uses arrays to store showrooms, employees, and cars, with a maximum capacity of 5 each.
* The `main_menu()` method is used to display the main menu and handle user input.
* The `set_details()` method is used to set the details of a showroom, employee, or car.
* The `get_details()` method is used to display the details of a showroom, employee, or car.
* The program uses a `Scanner` object to read user input.

Code Structure
--------------

The code is organized into the following files:

* `Main.java`: The main class that contains the program's entry point and logic.
* `Showroom.java`: The class that represents a showroom.
* `Employees.java`: The class that represents an employee.
* `Cars.java`: The class that represents a car.

CI/CD Pipeline
--------------

TurboTrove uses continuous integration and continuous deployment (CI/CD) pipelines for automated builds, code quality checks, and deployment to Azure Web App. The pipeline is managed using GitHub Actions, SonarCloud for code analysis, and Azure Web App for deployment.

### Pipeline Setup
1. **GitHub Actions**: Automates the build and deployment process. The pipeline triggers on code push and pull requests to run the following jobs:

    * Build the Java project.
    * Run SonarCloud code analysis.
    * Deploy the application to Azure Web App.

2. **SonarCloud**: Ensures that the code quality remains high by running static code analysis. It generates reports on code smells, bugs, and code coverage.

3. **Azure Web App**: The Java application is deployed to an Azure Web App for easy accessibility and scalability.

Note
----

This is a basic implementation and may not include all the features and error handling that a real-world management system would require.


Quality Status
--------------

[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=Wolf1904_tubotrove)](https://sonarcloud.io/summary/new_code?id=Wolf1904_tubotrove)

This badge represents the current code quality status as analyzed by SonarCloud. Click on the badge to view detailed analysis reports and metrics.
