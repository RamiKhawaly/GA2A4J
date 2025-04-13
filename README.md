# GA2A4J - Google Agent-to-Agent Protocol for Java

GA2A4J is a Java implementation of Google's Agent-to-Agent (A2A) protocol, designed to facilitate communication between AI agents.

## Project Structure

The project is organized into two main modules:

### 1. ga2a4j-sdk

This module contains the core SDK implementation of the A2A protocol. It includes:

- Data models representing the A2A protocol entities
- Core functionality for agent communication
- Utility classes for working with the protocol

The SDK can be used as a dependency in other projects that need to implement the A2A protocol.

### 2. a2a-rest

This is a Spring Boot application that implements REST APIs for the Google Agent-to-Agent protocol. It uses the ga2a4j-sdk as a dependency and provides HTTP endpoints for agent communication.

- Project name: a2a-rest
- Package: com.ramix.a2a

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Building the Project

```bash
mvn clean install
```

### Using the SDK in Your Project

Add the following dependency to your Maven project:

```xml
<dependency>
    <groupId>com.ga2a4j</groupId>
    <artifactId>ga2a4j-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Example Usage

```java
// Example code showing how to use the SDK
import com.ga2a4j.model.AgentCard;
import com.ga2a4j.model.AgentCapabilities;

// Create an agent card
AgentCard agentCard = AgentCard.builder()
    .name("My Agent")
    .url("https://myagent.example.com")
    .version("1.0.0")
    .capabilities(new AgentCapabilities())
    .build();
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
