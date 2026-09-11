# The God of Words

The God of Words is a Java Swing GUI application developed as my first GUI-based Java project.

The project was originally created using NetBeans and has been converted to a **Maven-based Java project** while preserving the original source code and NetBeans GUI Builder files.

## Features

- Java Swing graphical user interface
- Word-based quiz/game system
- Player management
- Score and leaderboard system
- Admin system
- User-created questions
- Word and question management
- NetBeans GUI Builder `.form` files
- Maven project structure
- Executable JAR with dependencies included

## Technologies

- Java 22
- Java Swing
- Maven
- NetBeans GUI Builder
- AbsoluteLayout

## Project Structure

```text
TheGodOfWords/
├── src/
│   └── main/
│       └── java/
│           ├── AdminProcess/
│           ├── Game/
│           ├── GUI/
│           ├── LengthOfWords/
│           ├── MakingScoreBoard/
│           ├── PlayerBehavior/
│           ├── PlayerInformation/
│           └── TheGodOfWords.java
│
├── LeaderBoard.txt
├── Submit.txt
├── UsernameAndPasswords.txt
├── UsersWordsAndQuestions.txt
├── WordsAndQuestions.txt
├── pom.xml
└── README.md
```

## Requirements

To build and run the project, you need:

- Java 22 or later
- Maven 3.9 or later

Check your Java version:

```bash
java -version
```

Check your Maven version:

```bash
mvn -version
```

## Build the Project

Clone the repository and enter the project directory:

```bash
git clone https://github.com/aliemmre/My-School-Project-with-Gui.git
cd My-School-Project-with-Gui
```

Build the project with Maven:

```bash
mvn clean package
```

The executable JAR will be created in:

```text
target/TheGodOfWords-1.0-SNAPSHOT.jar
```

## Run the Application

Run the executable JAR with:

```bash
java -jar target/TheGodOfWords-1.0-SNAPSHOT.jar
```

The JAR includes the required AbsoluteLayout dependency, so no additional dependency installation is required to run the application.

## Download the JAR

A pre-built executable JAR is available in the **Releases** section of this repository.

Download:

```text
TheGodOfWords-1.0-SNAPSHOT.jar
```

Then run:

```bash
java -jar TheGodOfWords-1.0-SNAPSHOT.jar
```

## Data Files

The application uses several text files for storing game and user data:

- `UsernameAndPasswords.txt`
- `UsersWordsAndQuestions.txt`
- `WordsAndQuestions.txt`
- `LeaderBoard.txt`
- `Submit.txt`

These files should remain in the same directory from which the application is being run.

## Original Project

The original NetBeans project is preserved in the repository as a backup.

The Maven conversion keeps the original Java source code and GUI Builder `.form` files while providing a modern Maven build system.

## Version

**v1.0.0**

This is the first released version of the Maven-converted project.

## Author

**Ali Emre**

---

Made with Java Swing and Maven.
