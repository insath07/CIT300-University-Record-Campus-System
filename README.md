# CIT300 – University Student Record and Campus Route Management System

> **Data Structures and Algorithms – Graded Practical Assignment 1**

---

## 📌 Project Overview

The **University Student Record and Campus Route Management System** is a Java-based application developed for the **CIT300 – Data Structures and Algorithms** module.

The project demonstrates the practical implementation of the major data structures and algorithms covered during **Weeks 1–9**.

The system combines multiple data structures to manage:

- University student records
- Student searching and updating
- Student processing operations
- Ordered student data
- Fast student record lookup
- Campus locations
- Campus routes
- Campus traversal
- Shortest routes between campus locations

The project is developed as a collaborative group project using **Java, Git, and GitHub**.

---

# 🎯 Project Objectives

The main objectives of this project are:

1. Implement the major data structures covered in CIT300.
2. Apply appropriate data structures to real-world university system requirements.
3. Demonstrate insertion, deletion, searching and traversal operations.
4. Implement efficient student record management.
5. Represent campus locations and routes using a graph.
6. Implement BFS and DFS graph traversal.
7. Implement shortest-path calculation for campus routes.
8. Demonstrate hashing and collision handling.
9. Demonstrate tree traversal techniques.
10. Develop the project collaboratively using Git and GitHub.
11. Integrate and test all group members' modules into one final project.

---

# 👥 Project Team

## 👑 Team Leader

### S.M. Insath

- **Student ID:** 23DA2-1139
- **Email:** mohammedimmmu678@gmail.com
- **GitHub:** `insath07`
- **Role:** Team Leader

### Responsibilities

- Overall project leadership
- Linked List implementation
- Final project integration
- GitHub repository management
- Branch management
- Pull Request management
- Final integration
- Final testing
- Documentation management
- README preparation
- Final project verification
- Final submission preparation

---

## 👨‍💻 Group Members

| Member | Student ID | Assigned Module |
|---|---|---|
| **S.M. Insath** | **23DA2-1139** | Linked List + Integration + GitHub + Testing |
| **N.D.F. Hainiya** | **23DA2-0600** | Stack + Queue |
| **H.M. Harshath** | **23DA2-0712** | BST + Hashing |
| **A.L.M. Arshad** | **23DA2-0711** | Graph |

---

# 🏗️ System Architecture

The project is divided into independent modules.

```text
                    UNIVERSITY SYSTEM
                           │
             ┌─────────────┴─────────────┐
             │                           │
      STUDENT RECORDS              CAMPUS ROUTES
             │                           │
     ┌───────┼────────┐                  │
     │       │        │                  │
 Linked    Stack    Queue                Graph
 List
     │                │                  │
     └───────┬────────┘          ┌───────┼────────┐
             │                   │       │        │
            BST               BFS      DFS    Shortest
             │                                  Path
           Hashing
```

---

# 📂 Project Structure

```text
CIT300-University-Record-Campus-System/
│
├── README.md
├── .gitignore
│
└── src/
    │
    ├── Main.java
    ├── StackMain.java
    ├── QueueMain.java
    ├── BSTMain.java
    ├── HashingMain.java
    ├── GraphMain.java
    │
    ├── model/
    │   └── Student.java
    │
    ├── linkedlist/
    │   └── StudentLinkedList.java
    │
    ├── stack/
    │   └── StudentStack.java
    │
    ├── queue/
    │   └── StudentQueue.java
    │
    ├── tree/
    │   └── StudentBST.java
    │
    ├── hashing/
    │   └── StudentHashTable.java
    │
    └── graph/
        └── CampusGraph.java
```

---

# 🔹 Module 1 – Linked List

### Responsible Member

**S.M. Insath**

The Linked List module manages university student records using a linked-list data structure.

### Features

- Add student
- Update student
- Delete student
- Search student
- Display students
- Count students
- Check whether the list is empty
- Duplicate Student ID validation
- Marks validation

### Implementation

```text
src/linkedlist/StudentLinkedList.java
```

### Testing

```text
src/Main.java
```

### Data Structure

**Singly Linked List**

---

# 🔹 Module 2 – Stack

### Responsible Member

**N.D.F. Hainiya**

The Stack module implements a **LIFO (Last In, First Out)** data structure.

### Features

- Push
- Pop
- Peek
- Display stack
- Check empty status
- Get stack size

### Implementation

```text
src/stack/StudentStack.java
```

### Testing

```text
src/StackMain.java
```

### Data Structure

**Linked Stack**

### Principle

```text
Last In → First Out
```

---

# 🔹 Module 3 – Queue

### Responsible Member

**N.D.F. Hainiya**

The Queue module implements a **FIFO (First In, First Out)** data structure.

### Features

- Enqueue
- Dequeue
- Peek
- Display queue
- Check empty status
- Get queue size

### Implementation

```text
src/queue/StudentQueue.java
```

### Testing

```text
src/QueueMain.java
```

### Data Structure

**Linked Queue**

### Principle

```text
First In → First Out
```

---

# 🔹 Module 4 – Binary Search Tree

### Responsible Member

**H.M. Harshath**

The Binary Search Tree module stores student records according to their Student ID.

The BST allows student records to be organized hierarchically and searched efficiently.

### Features

- Insert student
- Search student
- Inorder traversal
- Preorder traversal
- Postorder traversal
- Duplicate Student ID validation
- Empty tree checking

### Implementation

```text
src/tree/StudentBST.java
```

### Testing

```text
src/BSTMain.java
```

### Ordering

```text
Left Subtree < Root < Right Subtree
```

---

# 🔹 Module 5 – Hash Table

### Responsible Member

**H.M. Harshath**

The Hash Table module provides efficient student record lookup using hashing.

The implementation uses **separate chaining** to handle collisions.

### Features

- Insert student
- Search student
- Delete student
- Display hash table
- Duplicate Student ID validation
- Collision handling
- Empty table checking

### Implementation

```text
src/hashing/StudentHashTable.java
```

### Testing

```text
src/HashingMain.java
```

### Collision Handling

**Separate Chaining**

---

# 🔹 Module 6 – Campus Graph

### Responsible Member

**A.L.M. Arshad**

The Graph module represents university campus locations and the routes connecting them.

The graph uses an **Adjacency List** representation.

### Example Campus Locations

```text
Main Gate
Library
Science Block
Computer Lab
Cafeteria
```

### Example Routes

```text
Main Gate ↔ Library
Main Gate ↔ Science Block
Library ↔ Computer Lab
Library ↔ Cafeteria
Science Block ↔ Computer Lab
Computer Lab ↔ Cafeteria
```

### Features

- Add campus location
- Add campus route
- Display graph
- BFS traversal
- DFS traversal
- Search location
- Shortest path
- Check whether graph is empty

### Implementation

```text
src/graph/CampusGraph.java
```

### Testing

```text
src/GraphMain.java
```

---

# 🔍 Graph Algorithms

## BFS – Breadth-First Search

BFS visits connected campus locations level by level.

It uses a queue-based traversal approach.

```text
Start Location
      ↓
Visit Neighbours
      ↓
Visit Next Level
      ↓
Continue Until Complete
```

---

## DFS – Depth-First Search

DFS explores one route as deeply as possible before backtracking.

The implementation uses recursive traversal.

```text
Start Location
      ↓
Visit Location
      ↓
Explore Neighbour
      ↓
Continue Deeper
      ↓
Backtrack
```

---

## Shortest Path

The graph module calculates the shortest route between two campus locations using weighted route distances.

Example:

```text
Main Gate
    ↓
Library
    ↓
Cafeteria
```

The system displays:

- Starting location
- Destination
- Total distance
- Route/path

---

# 📊 Data Structures and Their Uses

| Data Structure | Purpose |
|---|---|
| **Linked List** | Student record management |
| **Stack** | LIFO student processing |
| **Queue** | FIFO student processing |
| **Binary Search Tree** | Ordered student searching |
| **Hash Table** | Fast student record lookup |
| **Graph** | Campus location and route management |

---

# 🧪 Testing Strategy

Each module has its own dedicated test class.

| Module | Test Class |
|---|---|
| Linked List | `Main.java` |
| Stack | `StackMain.java` |
| Queue | `QueueMain.java` |
| BST | `BSTMain.java` |
| Hashing | `HashingMain.java` |
| Graph | `GraphMain.java` |

### Testing includes:

- Normal operations
- Insert operations
- Delete operations
- Search operations
- Duplicate data validation
- Empty structure checking
- Traversal testing
- Invalid data handling
- Graph traversal
- Shortest-path testing

---

# ▶️ How to Compile and Run

All commands should be executed from the project root directory.

---

## Linked List

```powershell
javac -d out src\model\Student.java src\linkedlist\StudentLinkedList.java src\Main.java
java -cp out Main
```

---

## Stack

```powershell
javac -d out src\model\Student.java src\stack\StudentStack.java src\StackMain.java
java -cp out StackMain
```

---

## Queue

```powershell
javac -d out src\model\Student.java src\queue\StudentQueue.java src\QueueMain.java
java -cp out QueueMain
```

---

## Binary Search Tree

```powershell
javac -d out src\model\Student.java src\tree\StudentBST.java src\BSTMain.java
java -cp out BSTMain
```

---

## Hash Table

```powershell
javac -d out src\model\Student.java src\hashing\StudentHashTable.java src\HashingMain.java
java -cp out HashingMain
```

---

## Graph

```powershell
javac -d out src\graph\CampusGraph.java src\GraphMain.java
java -cp out GraphMain
```

---

# ⚙️ Technologies Used

### Programming Language

- Java

### Concepts

- Object-Oriented Programming
- Data Structures
- Algorithms
- Searching
- Sorting/Ordering
- Graph Traversal
- Hashing

### Development Tools

- Visual Studio Code
- Java JDK
- PowerShell / Terminal

### Version Control

- Git
- GitHub

---

# 🌿 GitHub Collaboration

The project is maintained through the **Team Leader's GitHub repository**.

### Repository Owner

**S.M. Insath**

### GitHub Username

```text
insath07
```

### Repository

```text
CIT300-University-Record-Campus-System
```

### Repository URL

https://github.com/insath07/CIT300-University-Record-Campus-System

---

# 🌳 Branch Structure

The team follows a branch-based development workflow.

```text
main
│
├── hainiya-stack-queue
│
├── harshad-bst-hashing
│
└── arshad-graph
```

### Branch Responsibilities

| Branch | Responsible Member | Module |
|---|---|---|
| `main` | S.M. Insath | Final Integrated Project |
| `hainiya-stack-queue` | N.D.F. Hainiya | Stack + Queue |
| `harshad-bst-hashing` | H.M. Harshath | BST + Hashing |
| `arshad-graph` | A.L.M. Arshad | Graph |

---

# 🔄 Git Integration Workflow

The project follows the following development workflow:

```text
Individual Development
        ↓
Module Testing
        ↓
Member Branch
        ↓
Git Commit
        ↓
Git Push
        ↓
Pull Request
        ↓
Team Leader Review
        ↓
Merge into main
        ↓
Final Integration
        ↓
Full System Testing
        ↓
Final Submission
```

The **`main` branch represents the final integrated project**.

The Team Leader is responsible for maintaining and verifying the final `main` branch.

---

# 🧩 Integration Responsibilities

The Team Leader performs the final integration of all modules.

### Integration checklist

- [ ] Linked List merged
- [ ] Stack merged
- [ ] Queue merged
- [ ] BST merged
- [ ] Hashing merged
- [ ] Graph merged
- [ ] All source files verified
- [ ] All modules compiled
- [ ] All test classes executed
- [ ] Integration issues resolved
- [ ] README updated
- [ ] GitHub repository verified
- [ ] Final `main` branch tested

---

# 📚 CIT300 Topics Demonstrated

This project demonstrates concepts from **Weeks 1–9**.

### Linear Data Structures

- Linked List
- Stack
- Queue

### Trees

- Binary Search Tree
- Tree Traversal

### Hashing

- Hash Functions
- Hash Table
- Collision Handling
- Separate Chaining

### Graphs

- Graph Representation
- Adjacency List
- BFS
- DFS
- Weighted Routes
- Shortest Path

### Searching

- Linked List Search
- BST Search
- Hash Table Search
- Graph Location Search

---

# 🎓 Learning Outcomes

Through this project, the group demonstrates the ability to:

1. Select suitable data structures for different problems.
2. Implement data structures using Java.
3. Perform insertion, deletion and search operations.
4. Implement stack and queue processing.
5. Implement tree-based searching and traversal.
6. Implement hashing and collision handling.
7. Represent real-world systems using graphs.
8. Implement BFS and DFS.
9. Calculate shortest paths in a weighted graph.
10. Test individual modules.
11. Integrate multiple modules into one project.
12. Use Git and GitHub for collaborative development.

---

# 📈 Project Benefits

The modular design provides several benefits:

- Easy maintenance
- Independent module testing
- Clear separation of responsibilities
- Easier debugging
- Reusable data structures
- Collaborative Git workflow
- Simple final integration
- Clear demonstration of CIT300 concepts

---

# 🔐 Repository Management

The GitHub repository is managed by the Team Leader.

The development branches allow group members to work independently without directly modifying the final `main` branch.

The final project is integrated into:

```text
main
```

Only the tested and reviewed modules should be included in the final integrated version.

---

# ✅ Final Project Status

| Component | Status |
|---|---|
| Student Model | ✅ Completed |
| Linked List | ✅ Completed |
| Stack | ✅ Completed |
| Queue | ✅ Completed |
| Binary Search Tree | ✅ Completed |
| Hash Table | ✅ Completed |
| Graph | ✅ Completed |
| Individual Testing | ✅ Completed |
| Git Branches | ✅ Completed |
| GitHub Collaboration | ✅ Completed |
| Final Integration | 🔄 In Progress |
| Final System Testing | 🔄 In Progress |

---

# 📝 Conclusion

The **University Student Record and Campus Route Management System** provides a practical implementation of the Data Structures and Algorithms concepts covered in the CIT300 module.

The project combines Linked Lists, Stacks, Queues, Binary Search Trees, Hash Tables and Graphs to demonstrate how different data structures can be selected and implemented according to specific system requirements.

Through individual module development, testing, Git branching, Pull Requests and final integration, the project also demonstrates collaborative software development practices.

The final integrated system provides a clear practical demonstration of the group's understanding of **Data Structures, Algorithms, Java programming and GitHub-based collaboration**.

---

## 👑 Project Leadership

**Team Leader:** S.M. Insath  
**Student ID:** 23DA2-1139  
**GitHub:** `insath07`  
**Email:** `mohammedimmmu678@gmail.com`

**CIT300 – Data Structures and Algorithms**

---