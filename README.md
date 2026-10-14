# First 5 Practical Programs - Maven & Jenkins Pipeline Project

This repository contains 5 foundational Java practical programs organized as a single standard Maven project with JUnit 5 unit tests and automated CI/CD using a Jenkins Declarative Pipeline.

---

## Included Programs & Test Cases

| # | Program Description | Source File | Test File |
|---|---------------------|-------------|-----------|
| 1 | Add Two Numbers | [`src/main/java/com/example/AddTwoNumbers.java`](src/main/java/com/example/AddTwoNumbers.java) | [`src/test/java/com/example/AddTwoNumbersTest.java`](src/test/java/com/example/AddTwoNumbersTest.java) |
| 2 | Check Even or Odd | [`src/main/java/com/example/EvenOdd.java`](src/main/java/com/example/EvenOdd.java) | [`src/test/java/com/example/EvenOddTest.java`](src/test/java/com/example/EvenOddTest.java) |
| 3 | Largest of Three Numbers | [`src/main/java/com/example/LargestOfThree.java`](src/main/java/com/example/LargestOfThree.java) | [`src/test/java/com/example/LargestOfThreeTest.java`](src/test/java/com/example/LargestOfThreeTest.java) |
| 4 | Factorial of a Number | [`src/main/java/com/example/Factorial.java`](src/main/java/com/example/Factorial.java) | [`src/test/java/com/example/FactorialTest.java`](src/test/java/com/example/FactorialTest.java) |
| 5 | Check Whether a Number is Prime | [`src/main/java/com/example/PrimeCheck.java`](src/main/java/com/example/PrimeCheck.java) | [`src/test/java/com/example/PrimeCheckTest.java`](src/test/java/com/example/PrimeCheckTest.java) |
| - | Main Suite Runner (Runs all 5) | [`src/main/java/com/example/Main.java`](src/main/java/com/example/Main.java) | - |

---

## Directory Structure

```
first5/
├── .gitignore
├── Jenkinsfile
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── AddTwoNumbers.java
    │               ├── EvenOdd.java
    │               ├── LargestOfThree.java
    │               ├── Factorial.java
    │               ├── PrimeCheck.java
    │               └── Main.java
    └── test
        └── java
            └── com
                └── example
                    ├── AddTwoNumbersTest.java
                    ├── EvenOddTest.java
                    ├── LargestOfThreeTest.java
                    ├── FactorialTest.java
                    └── PrimeCheckTest.java
```

---

## Local Maven Commands

### 1. Compile All Programs
```bash
mvn clean compile
```

### 2. Run All JUnit 5 Tests
```bash
mvn test
```

### 3. Package the Executable JAR
```bash
mvn package
```

### 4. Execute the Application
Run all 5 programs using the packaged JAR:
```bash
java -jar target/first5-1.0-SNAPSHOT.jar
```
Or run any individual program with `java -cp target/classes`:
```bash
# Program 1: Add Two Numbers (e.g. 10 and 20)
java -cp target/classes com.example.AddTwoNumbers 10 20

# Program 2: Even or Odd (e.g. 14)
java -cp target/classes com.example.EvenOdd 14

# Program 3: Largest of Three (e.g. 12, 45, 27)
java -cp target/classes com.example.LargestOfThree 12 45 27

# Program 4: Factorial (e.g. 5)
java -cp target/classes com.example.Factorial 5

# Program 5: Prime Check (e.g. 29)
java -cp target/classes com.example.PrimeCheck 29
```

---

## Jenkins Pipeline Setup

### Steps to Configure in Jenkins:
1. Open Jenkins $\rightarrow$ Click **New Item**.
2. Enter item name (e.g., `first5-pipeline`) $\rightarrow$ Select **Pipeline** $\rightarrow$ Click **OK**.
3. Under **Build Triggers** (optional): Select *Poll SCM* or *GitHub hook trigger for GITScm polling*.
4. Scroll to **Pipeline**:
   - **Definition**: Select `Pipeline script from SCM`
   - **SCM**: Select `Git`
   - **Repository URL**: `https://github.com/kaarun0908/first5.git`
   - **Branch Specifier**: `*/main`
   - **Script Path**: `Jenkinsfile`
5. Click **Save**.
6. Click **Build Now** to trigger the pipeline.