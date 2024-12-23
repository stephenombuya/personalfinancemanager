# **Personal Finance Manager**

## **Overview**
The Personal Finance Manager is a Java-based application designed to help users manage their personal finances. It enables tracking financial transactions, validating data, and offering a simple user interface for interaction. The project is open-source and licensed under the GPL-3.0 License.

---

### **Table of Contents**
  1. [Features](features)
  2. [Technologies Used](TechnologiesUsed)
  3. [Installation](Installation)
  4. [Usage](Usage)
  5. [File Structure](FileStructure)
  6. [Contributing](Contributing)
  7. [License](License)

---

### **Features**
  - Track financial transactions such as income and expenses.
  - Validate transaction details with custom validation logic.
  - Simple, user-friendly interface for managing personal finance.
  - Modular design for scalability and maintainability.

---


### **Technologies Used**
  - **Programming Language**: Java
  - **Development Environment**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse)
  - **Version Control**: Git and GitHub

---


### **Installation**

**Prerequisites**
  1. **Java Development Kit (JDK)**: Version 8 or higher.
  2. **Git**: Installed and configured.

**Steps**

1. Clone the repository:

```bash
git clone https://github.com/stephenombuya/personalfinancemanager/tree/main
```

2. Navigate to the project directory:

```bash
cd personalfinancemanager
```

3. Open the project in your favorite Java IDE.

4. Compile the project:

```bash
javac *.java
```

5. Run the application:

```bash
java FinanceApp
```

---


### **Usage**

**Running the Application**

1. Launch the FinanceApp class to start the application.
2. Use the interface to:
    - Add, edit, or delete financial transactions.
    - View transaction summaries.
    - Validate transaction details.

---


### **File Structure**

```bash
personalfinancemanager/
├── .gitignore                 # Specifies files to ignore in Git
├── FinanceApp.java            # Entry point for the application
├── FinanceUI.java             # Handles user interface logic
├── LICENSE                    # Project license file
├── Transaction.java           # Data model for financial transactions
├── TransactionManager.java    # Business logic for managing transactions
├── TransactionValidator.java  # Validation logic for transactions
```

---


### **Contributing**
We welcome contributions! Follow these steps to contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.

```bash
git checkout -b feature-name
```

3. Commit your changes with a clear message.

```bash
git commit -m "Add feature name"
```

4. Push your changes to the branch.

```bash
git push origin feature-name
```

5. Open a Pull Request (PR) with a detailed description of your changes.


### **License**
This project is licensed under the **GNU GPL-3.0** License. See the [LICENSE](License) file for details.

