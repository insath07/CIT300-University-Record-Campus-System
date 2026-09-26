# CIT300 University Record & Campus Route Management System

## CIT300 - Data Structures and Algorithms

### Graded Practical Assignment 1 - Week 10

---

## 1. Project Title

**University Student Record and Campus Route Management System**

---

## 2. Project Description

This project is a Java console-based University Student Record and Campus Route Management System developed for the CIT300 Data Structures and Algorithms Graded Practical Assignment 1.

The system manages university student records and represents connections between campus locations.

The project demonstrates the practical implementation and use of:

- Linked Lists
- Stacks
- Queues
- Binary Search Trees (BST)
- Hashing
- Graphs
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

The application provides a menu-driven console interface for managing student records, student service requests, recent actions, student searching, and campus locations and connections.

---

## 3. Module Information

**Module:** CIT300 - Data Structures and Algorithms

**Assessment:** Graded Practical Assignment 1

**Coverage:** Weeks 1-9

**Topics Covered:**

- Linear Data Structures
- Trees
- Hashing
- Graphs

**Contribution:** 10% of the final module grade

---

## 4. Project Objectives

The main objectives of this project are:

1. To develop a Java console application for managing university student records.
2. To store and manage student records using a Linked List.
3. To use a Stack for maintaining recent actions, deleted records, or history.
4. To use a Queue for managing student service requests in the order they arrive.
5. To use a Binary Search Tree (BST) to organize and search student records by Student ID.
6. To use Hashing for efficient Student ID searching.
7. To represent university campus locations and their connections using a Graph.
8. To implement graph operations using an adjacency list or adjacency matrix.
9. To provide BFS or DFS graph traversal.
10. To provide a menu-driven console interface.
11. To validate user inputs and handle invalid operations appropriately.
12. To demonstrate collaborative software development using GitHub.

---

# 5. Group Members

| Member | Student ID | Responsibility |
|---|---|---|
| **S.M. Insath** | **23DA2-1139** | Linked List, Team Leader, Integration, GitHub, Testing |
| **N.D.F. Hainiya** | **23DA2-0600** | Stack + Queue |
| **H.M. Harshath** | **23DA2-____** | BST + Hashing |
| **A.L.M. Arshad** | **23DA2-____** | Graph |

> **Note:** The incomplete Student IDs above will be replaced with the correct IDs before final submission.

---

# 6. Individual Contributions

## Member 1 - S.M. Insath

**Student ID:** 23DA2-1139

**Role:** Team Leader

### Responsibilities

- Linked List implementation
- Student record management
- Project coordination
- GitHub repository management
- Code integration
- Testing and debugging
- Final project coordination
- README documentation
- Final submission preparation

### Contribution

Implemented the Linked List and student record management functionality.

Responsible for integrating all group members' components into the final system.

Responsible for testing the complete application and ensuring that all required components work together correctly.

---

## Member 2 - N.D.F. Hainiya

**Student ID:** 23DA2-0600

### Responsibility

- Stack implementation
- Queue implementation

### Contribution

Implemented the Stack functionality for maintaining recent actions, deleted records, or history.

Implemented the Queue functionality for managing student service requests in the order of arrival.

---

## Member 3 - H.M. Harshath

**Student ID:** 23DA2-____

### Responsibility

- Binary Search Tree (BST)
- Hashing

### Contribution

Implemented the Binary Search Tree for organizing and searching student records.

Implemented Hashing functionality for efficient Student ID searching.

---

## Member 4 - A.L.M. Arshad

**Student ID:** 23DA2-____

### Responsibility

- Graph implementation
- Campus locations
- Campus connections
- BFS / DFS traversal

### Contribution

Implemented the Graph component for representing campus locations and their connections.

Implemented graph operations and traversal using BFS or DFS.

---

# 7. Technologies Used

The project is developed using:

- Java
- Visual Studio Code
- Git
- GitHub

---

# 8. Data Structures Used

## 8.1 Linked List

The Linked List is used to store and manage university student records.

Each student record contains:

- Student ID
- Name
- Programme
- Marks

### Linked List Operations

- Add Student
- Update Student
- Delete Student
- Search Student
- Display All Students

---

## 8.2 Stack

The Stack is used to maintain recent actions, deleted records, or history.

### Stack Operations

- Push action
- Pop recent action
- Display recent actions
- Handle empty stack

---

## 8.3 Queue

The Queue is used to manage student service requests in the order of arrival.

### Queue Operations

- Add service request
- Process next service request
- Display pending requests
- Handle empty queue

---

## 8.4 Binary Search Tree (BST)

The Binary Search Tree is used to organize and search student records using Student ID or another suitable key.

### BST Operations

- Insert student
- Search student
- Display students
- Traverse the tree

---

## 8.5 Hashing

Hashing is used to support efficient searching of students using Student ID.

### Hashing Operations

- Add Student ID
- Search Student ID
- Handle duplicate Student IDs
- Handle Student ID not found

---

## 8.6 Graph

The Graph represents university campus locations as vertices and connections or roads as edges.

### Example Campus Locations

- Library
- Laboratory
- Cafeteria
- Administration Block
- Hostel

### Graph Operations

- Add Campus Location
- Remove Campus Location
- Add Campus Connection
- Remove Campus Connection
- Display Campus Connections
- BFS Traversal
- DFS Traversal

The graph may be represented using an adjacency list or adjacency matrix.

---

# 9. Student Record Structure

Each student record contains:

| Field | Description |
|---|---|
| Student ID | Unique student identifier |
| Name | Student name |
| Programme | Student's academic programme |
| Marks | Student marks |

Example:

```text
Student ID : 1001
Name       : Ahmed
Programme  : Information Technology
Marks      : 85




S.M. Insath
→ Student.java
→ StudentLinkedList.java
→ Integration
→ GitHub
→ Testing

N.D.F. Hainiya
→ ActionStack.java
→ ServiceRequestQueue.java

H.M. Harshath
→ StudentBST.java
→ StudentHashTable.java

A.L.M. Arshad
→ CampusGraph.java

Main.java
→ Final integration — S.M. Insath