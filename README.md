# Task Tracker CLI

A simple command-line application for tracking tasks and managing your to-do list.

## About

Task Tracker is a CLI application designed to help users organize their tasks directly from the terminal. It allows users to create, update, delete, and list tasks while tracking their progress through different statuses.

This project is part of a programming exercise focused on practicing fundamental software development concepts, including command-line argument handling, file system operations, JSON data persistence, and error handling.

## Features

- **Add tasks:** Create new tasks with a unique ID.
- **Update tasks:** Modify existing task descriptions.
- **Delete tasks:** Remove tasks by their ID.
- **Track progress:** Mark tasks as `todo`, `in-progress`, or `done`.
- **List tasks:** Display all tasks or filter them by status.
- **Persistent storage:** Store task data in a JSON file in the current working directory.
- **Automatic file creation:** Create the JSON file if it does not exist.
- **Timestamps:** Track when tasks are created and last updated.

## Requirements

The application is designed to follow these constraints:

- Run from the command line.
- Accept user input through positional command-line arguments.
- Store task data in a local JSON file.
- Use native file system capabilities for reading and writing data.
- Avoid external libraries and frameworks.
- Handle invalid commands, missing arguments, and nonexistent task IDs gracefully.

## Commands

The following examples define the intended command-line interface.

### Add a task

```bash
task-cli add "Buy groceries"
```

Example output:

```text
Task added successfully (ID: 1)
```

### Update a task

```bash
task-cli update 1 "Buy groceries and cook dinner"
```

### Delete a task

```bash
task-cli delete 1
```

### Mark a task as in progress

```bash
task-cli mark-in-progress 1
```

### Mark a task as done

```bash
task-cli mark-done 1
```

### List tasks

Display all tasks:

```bash
task-cli list
```

Display tasks by status:

```bash
task-cli list done
task-cli list todo
task-cli list in-progress
```

## Task Properties

Each task should contain the following properties:

| Property | Description |
|---|---|
| `id` | Unique identifier assigned to the task. |
| `description` | Short description of the task. |
| `status` | Current status: `todo`, `in-progress`, or `done`. |
| `createdAt` | Date and time when the task was created. |
| `updatedAt` | Date and time when the task was last updated. |

## Data Storage

Tasks are stored in a JSON file in the current working directory. The file is created automatically if it does not exist.

Example structure:

```json
[
  {
    "id": 1,
    "description": "Buy groceries",
    "status": "todo",
    "createdAt": "2026-10-13T18:30:00",
    "updatedAt": "2026-10-13T18:30:00"
  },
  {
    "id": 2,
    "description": "Study Java",
    "status": "in-progress",
    "createdAt": "2026-10-13T18:35:00",
    "updatedAt": "2026-10-13T19:00:00"
  }
]
```

The `updatedAt` property should be refreshed whenever an existing task is modified, including when its status changes.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21 or later.
- A terminal or command-line interface.
- Git (optional, for version control).

Verify your Java installation:

```bash
java -version
javac -version
```

Both commands should report Java 21.

### Installation

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project directory:

```bash
cd "Task Tracker"
```

### Compile

Compile the Java source code:

```bash
javac -d out src/main/java/Main.java
```

### Run

Execute the application:

```bash
java -cp out Main
```

### Example

Once the application is implemented, commands should follow this format:

```bash
java -cp out Main add "Buy groceries"
java -cp out Main list
java -cp out Main mark-done 1
```

**Note:** The examples above assume that `Main.java` contains no `package` declaration and that the application processes command-line arguments through `args` in the `main` method.