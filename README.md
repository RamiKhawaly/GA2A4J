# GA2A4J - Google Agent-to-Agent Protocol for Java

This project provides a Java implementation of the Google Agent-to-Agent (A2A) protocol, enabling seamless communication between AI agents.

## Project Structure

The project is organized into two main modules:

### 1. ga2a4j-sdk

This module contains the core SDK classes that implement the A2A protocol. It can be used as a dependency in other projects that need to integrate with the A2A protocol.

Key features:
- Data model classes for the A2A protocol
- Protocol implementation utilities
- Core functionality for agent-to-agent communication

### 2. a2a-rest

This is a Spring Boot application that provides REST APIs implementing the Google Agent-to-Agent protocol. It uses the ga2a4j-sdk as a dependency.

Project details:
- Project name: a2a-rest
- Package: com.ramix.a2a
- Implements specific endpoints for the A2A protocol (detailed in separate documentation)

## Getting Started

### Using the SDK

To use the SDK in your project, add it as a dependency in your Maven or Gradle project.

### Running the REST API

The a2a-rest module can be run as a standalone Spring Boot application.

## Documentation

For more detailed information about the A2A protocol and how to use this implementation, please refer to the documentation.
