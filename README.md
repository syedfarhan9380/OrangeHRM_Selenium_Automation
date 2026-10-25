OrangeHRM Selenium Automation

📌 Project Overview

This project automates the testing of the OrangeHRM web application using Selenium WebDriver with Java. It focuses on validating key application functionalities through automated test scripts to improve testing efficiency, accuracy, and reliability.

The project uses TestNG for test execution and assertions, Maven for dependency management, and the Page Object Model (POM) design pattern for better code organization and maintainability, if implemented.

🎯 Project Objectives

- Automate web application testing using Selenium WebDriver.
- Validate login functionality and application navigation.
- Reduce repetitive manual testing efforts.
- Improve test script reusability and maintainability.
- Generate structured test execution results.

🛠️ Technologies Used

- Programming Language: Java
- Automation Tool: Selenium WebDriver
- Testing Framework: TestNG
- Build and Dependency Management: Maven
- Browser: Google Chrome
- Version Control: Git and GitHub
- IDE: Eclipse

✨ Key Features

- Automated browser launch and navigation.
- Login functionality testing.
- Validation of application elements using Selenium locators.
- Handling of web elements and user interactions.
- Synchronization using Selenium waits.
- Test execution and assertions using TestNG.
- Maven-based dependency management.
- Organized automation code structure.

Note: Keep only the features that are actually implemented in your project.

📂 Project Structure

OrangeHRM_Selenium_Automation/
├── drivers/
│   └── Browser driver files (if required)
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
├── pom.xml
├── .gitignore
├── .gitattributes
└── README.md

The exact folder structure may differ depending on your implementation.

⚙️ Prerequisites

Install the following before running the project:

- Java JDK
- Eclipse IDE or another Java IDE
- Maven
- Google Chrome browser
- Internet connection

🚀 How to Run the Project

1. Clone the repository:
   
   git clone https://github.com/syedfarhan9380/OrangeHRM_Selenium_Automation.git

2. Open Eclipse IDE.

3. Select File → Import → Maven → Existing Maven Projects.

4. Browse to the cloned project folder.

5. Select the "pom.xml" file and finish the import.

6. Right-click the project and select Maven → Update Project.

7. Open the test class containing your automation scripts.

8. Right-click the test class and select Run As → TestNG Test.

Alternatively, if your Maven project is configured for TestNG execution, run:

mvn clean test

🧪 Testing Scope

The automation suite can cover the following scenarios, depending on the implemented test cases:

- Valid login credentials.
- Invalid login credentials.
- Empty username and password fields.
- Login error message validation.
- Web element visibility and interaction.
- Navigation after successful login.
- Browser synchronization and wait handling.

📈 Skills Demonstrated

- Selenium WebDriver automation
- Java programming and object-oriented programming
- TestNG annotations and assertions
- Web element locators and XPath
- Explicit and implicit waits
- Maven project configuration
- Automated test execution
- Git and GitHub version control

🔮 Future Enhancements

- Implement the Page Object Model (POM).
- Add data-driven testing using Excel.
- Integrate automated test reporting.
- Add cross-browser testing.
- Integrate the test suite with Jenkins for continuous integration.

👨‍💻 Author

Syed Farhan

GitHub: "syedfarhan9380" (https://github.com/syedfarhan9380)

Project Repository: "OrangeHRM Selenium Automation" (https://github.com/syedfarhan9380/OrangeHRM_Selenium_Automation)

📄 License

This project is intended for educational purposes and automation testing practice.
