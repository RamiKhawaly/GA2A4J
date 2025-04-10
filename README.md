# GA2A4J Project

This is a Spring Boot application that demonstrates the use of data models for task management.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

1. Clone the repository
2. Navigate to the project directory
3. Build the project with Maven:

```bash
mvn clean install
```

### Running the Application

```bash
java -jar target/GA2A4J-0.0.1-SNAPSHOT.jar
```

## Usage Examples

The GA2A4J project includes a CLI demo application that demonstrates how to work with the Task model.

### CLI Application Commands

When running the application, you'll see a menu with the following options:

1. **Add Task** - Create a new task with title, description, and due date
2. **List Tasks** - Display all tasks with their details
3. **Update Task** - Modify an existing task's properties
4. **Delete Task** - Remove a task from the list
5. **Exit** - Close the application

### Code Examples

#### Creating a Task

```java
Task task = new Task();
task.setId(1L);
task.setTitle("Complete project documentation");
task.setDescription("Write comprehensive documentation for the GA2A4J project");
task.setDueDate(LocalDate.now().plusDays(7));
task.setCompleted(false);
```

#### Updating a Task's Status

```java
Task task = findTaskById(1L); // Assuming this method exists
if (task != null) {
    task.setCompleted(true);
    System.out.println("Task marked as completed!");
}
```

#### Working with a List of Tasks

```java
List<Task> tasks = new ArrayList<>();

// Add tasks
Task task1 = new Task();
task1.setId(1L);
task1.setTitle("First task");
tasks.add(task1);

// Filter completed tasks
List<Task> completedTasks = tasks.stream()
    .filter(Task::isCompleted)
    .collect(Collectors.toList());
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
