# A2A REST API

## Overview
This module provides a REST API implementation of the Google Agent2Agent (A2A) protocol. It serves as a demonstration of how to implement the A2A protocol as a Spring Boot service, exposing the necessary endpoints for agent-to-agent communication.

## Features
- Complete implementation of the A2A protocol specification
- RESTful API endpoints for all A2A operations
- Support for streaming responses using Server-Sent Events (SSE)
- Optional push notification support
- Authentication mechanisms as specified in the A2A protocol

## Endpoints

The following endpoints are implemented according to the A2A protocol specification:

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/.well-known/agent.json` | GET | Returns the Agent Card with metadata about the agent's capabilities |
| `/tasks/send` | POST | Sends a task to the agent for processing |
| `/tasks/sendSubscribe` | POST | Sends a task and subscribes to streaming updates |
| `/tasks/get` | POST | Retrieves the current state of a task |
| `/tasks/cancel` | POST | Cancels an in-progress task |
| `/tasks/pushNotification/set` | POST | Configures push notification settings |

## Dependencies

This module depends on:
- `ga2a4j-sdk`: The core SDK module containing the A2A protocol data models and interfaces
- Spring Boot Web: For REST API implementation
- Spring Boot Validation: For request validation
- Spring Boot Actuator: For health checks and monitoring

## Building and Running

### Prerequisites
- Java 17 or higher
- Maven 3.8 or higher

### Build
```bash
# From the root project directory
mvn clean install

# To build just this module
mvn clean install -pl a2a-rest
```

### Run
```bash
# From the a2a-rest directory
mvn spring-boot:run

# Or after building
java -jar target/a2a-rest-1.0-SNAPSHOT.jar
```

The server will start on port 8080 by default. You can access the Agent Card at http://localhost:8080/.well-known/agent.json

## Configuration

The application can be configured using standard Spring Boot configuration mechanisms. Key configuration properties include:

```properties
# application.properties or application.yml
server.port=8080

# A2A agent configuration
a2a.agent.name=Example A2A Agent
a2a.agent.description=A reference implementation of the Google Agent2Agent protocol
a2a.agent.version=1.0.0

# Enable/disable capabilities
a2a.capabilities.streaming=true
a2a.capabilities.pushNotifications=false
a2a.capabilities.stateTransitionHistory=true
```

## Usage Examples

### Sending a Task

```bash
curl -X POST http://localhost:8080/tasks/send \
  -H "Content-Type: application/json" \
  -d '{
    "jsonrpc": "2.0",
    "id": "request-123",
    "method": "tasks/send",
    "params": {
      "taskId": "task-123",
      "message": {
        "role": "user",
        "parts": [{
          "type": "text",
          "text": "Hello, agent!"
        }]
      }
    }
  }'
```

### Streaming a Task

```bash
curl -X POST http://localhost:8080/tasks/sendSubscribe \
  -H "Content-Type: application/json" \
  -H "Accept: text/event-stream" \
  -d '{
    "jsonrpc": "2.0",
    "id": "request-123",
    "method": "tasks/sendSubscribe",
    "params": {
      "taskId": "task-123",
      "message": {
        "role": "user",
        "parts": [{
          "type": "text",
          "text": "Hello, agent!"
        }]
      }
    }
  }'
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.