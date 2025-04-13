# GA2A4J SDK

## Overview
The GA2A4J SDK is a Java library that provides a comprehensive implementation of the Google Agent2Agent (A2A) protocol. This SDK allows Java applications to easily integrate with and leverage the A2A protocol for agent-to-agent communication.

## Components

The SDK consists of the following main components:

### Data Models

The SDK provides Java classes that map to the A2A protocol's JSON schema:

- **Agent Models**: `AgentCard`, `AgentCapabilities`, `AgentAuthentication`, `AgentProvider`, `AgentSkill`
- **Communication Models**: `Task`, `Message`, `Part` (with subtypes like `TextPart`, `FilePart`, `DataPart`)
- **Output Models**: `Artifact`
- **Request/Response Models**: JSON-RPC compliant models for various A2A operations

### Client

The SDK includes a client implementation that allows applications to:

- Discover agents via their Agent Cards
- Send tasks to A2A servers
- Receive and process responses
- Handle streaming responses for long-running tasks
- Manage task lifecycle (cancel, get status, etc.)

### Utilities

Helper classes for common operations:

- JSON serialization/deserialization
- Authentication handling
- Error handling

## Usage Examples

### Basic Client Usage

```java
import com.ga2a4j.client.A2AClient;
import com.ga2a4j.model.*;

// Create a client
A2AClient client = new A2AClient("https://example-agent.com/a2a");

// Discover agent capabilities
AgentCard agentCard = client.discoverAgent();

// Create a task with a text message
Task task = client.sendTask("task-123", 
    Message.builder()
        .role("user")
        .parts(List.of(new TextPart("Hello, please analyze this data")))
        .build());

// Check task status
Task updatedTask = client.getTaskStatus("task-123");

// Cancel a task if needed
client.cancelTask("task-123");
```

### Streaming Example

```java
import com.ga2a4j.client.A2AStreamingClient;
import com.ga2a4j.model.*;
import com.ga2a4j.streaming.TaskUpdateListener;

// Create a streaming client
A2AStreamingClient client = new A2AStreamingClient("https://example-agent.com/a2a");

// Send a task with streaming updates
client.sendTaskWithStreaming("task-456", 
    Message.builder()
        .role("user")
        .parts(List.of(new TextPart("Generate a detailed report")))
        .build(),
    new TaskUpdateListener() {
        @Override
        public void onStatusUpdate(Task task) {
            System.out.println("Task status: " + task.getStatus());
        }
        
        @Override
        public void onArtifactUpdate(Artifact artifact) {
            System.out.println("Received artifact: " + artifact.getName());
        }
        
        @Override
        public void onComplete(Task task) {
            System.out.println("Task completed!");
        }
    });
```

## Dependencies

The SDK has the following dependencies:

- Java 11 or higher
- Jackson for JSON processing
- Lombok for reducing boilerplate code

## Building

To build the SDK:

```bash
mvn clean install
```

## Including in Your Project

### Maven

```xml
<dependency>
    <groupId>com.ga2a4j</groupId>
    <artifactId>ga2a4j-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Gradle

```groovy
implementation 'com.ga2a4j:ga2a4j-sdk:1.0-SNAPSHOT'
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.
