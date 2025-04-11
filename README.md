# QA Intern Assignment - Selenium Test Script

## Introduction
This repository contains the Selenium test script for the QA Intern assignment at Intervue.io. The script automates the login and logout process, takes a screenshot if login fails, and performs a search action after logging in.

## Prerequisites

- Java 8 or higher
- Eclipse IDE or any other Java IDE
- Chrome browser
- ChromeDriver (for Selenium)
- Selenium WebDriver dependencies
- Git

## Setup

1. **Clone the repository**:
   - Open a terminal or Git Bash and run the following command:

   ```bash
   git clone https://github.com/yourusername/QA-Intern-Assignment.git
2. Import the project into Eclipse:

   - Open Eclipse.

   - Go to File > Import > General > Existing Projects into Workspace.

   - Select the cloned repository folder and click Finish.

3. Download ChromeDriver:

   - Download ChromeDriver compatible with your version of Chrome from:       
    https://sites.google.com/a/chromium.org/chromedriver/downloads.

   - Add it to your system PATH or place it in the project folder and specify the path 
    in the script if necessary.

4. Install the necessary dependencies:

   - You can use Maven or Gradle to manage dependencies, or manually download the     
    Selenium WebDriver jar files.

   - Example of required dependencies:

   - selenium-java (e.g., version 3.141.59 or 4.0)

   - chrome-driver

6. Run the test:

    - Right-click the class containing the test script and select Run As > Java   
    Application.

How It Works

   - The script opens the Intervue.io website and clicks on the login button.

   - It enters the credentials and clicks the login button.

   - If login fails (based on the page title), a screenshot is taken and saved locally.

   - After successful login, it performs a search and logs out of the platform.

