# Attendence Tracker

## Project Information

- **Project Title:** Attendence Tracker
- **Short description:** The program helps busy teachers record attendence correctly, focusing on late and absent students.
- **Programming language:** Java

## 1. Project Description

The goal of this project is to help teachers manage classroom attendence more accurately by tracking absent students and identifying those who arrive late. Users can enter student names and presence status row by row, review which students were absent, and then mark late arrivals after they appear. This project is interesting because it combines classroom workflow with attendance correction and provides a simple email template for notifying the office about late arrivals.

## 2. Features

- Record student names and present/absent status for each seating row
- Display a seating chart with row labels
- identify absent students automatically
- Ask which absent students have arrived late
- Store late arrivals in a separate list
- Generate a ready-to-use office email template for late students

## 3. Code Structure and Design

The main classes are `App`, `Seating_chart`, and `Student`. `App` handles user input, program flow, and output. `Seating_chart` stores the classroom rows in a 2D list and provides methods for checking attendance. `Student` represents each student with a name and a presence status.

Objects interact by having `App` build row lists of `Student` objects, pass them into `Seating_chart`, and then use `Seating_chart` methods to identify absent students. Data is stored in `ArrayList<Student>` for each row and `ArrayList<ArrayList<Student>>` inside `Seating_chart` for the full seating layout. In this project, abstraction is used by keeping attendance logic inside `Seating_chart` and keeping `App` focused on user interaction.

A UML diagram will be embedded or linked in this section when the final documentation is complete.

## 4. How to Run the Program

1. Open a terminal in the project folder.
2. Compile the Java files with:
   ```bash
   javac src/*.java
   ```
3. Run the program with:
   ```bash
   java -cp src App
   ```
4. Enter student names and presence status when prompted.
5. After the seating chart prints, answer whether each absent student is now present.
6. Review the list of late students and the generated email templates.

## 5. Development Process

A challenge during development was organizing the seating chart so it could be treated like a 2D structure while keeping the user interface simple. I solved this by storing rows in an `ArrayList<ArrayList<Student>>` and adding helper methods in `Seating_chart` for row access. With more time, I would improve the program by adding validation for user input and a more polished menu-driven interface.

## 6. Use of AI Tools

I used AI tools for brainstorming and debugging while writing this project. AI suggestions helped clarify method calls and improve the program flow, but every code change was reviewed and tested by me. I understand the final code and confirm that all AI-assisted changes were evaluated and validated by the student.

## 7. Author Information

- **Student name:** Kim Nguyen
- **Course:** AP Computer Science A
- **What I learned:** I learned how to use Java collections to manage classroom data and how to separate user interaction from attendance logic.
