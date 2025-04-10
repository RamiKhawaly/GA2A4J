package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents an Agent Card in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentCard {
    /**
     * The name of the agent.
     */
    private String name;
    
    /**
     * Optional description of the agent.
     */
    private String description;
    
    /**
     * The URL of the agent.
     */
    private String url;
    
    /**
     * Optional provider information.
     */
    private AgentProvider provider;
    
    /**
     * The version of the agent.
     */
    private String version;
    
    /**
     * Optional URL to the agent's documentation.
     */
    private String documentationUrl;
    
    /**
     * The capabilities of the agent.
     */
    private AgentCapabilities capabilities;
    
    /**
     * Optional authentication information.
     */
    private AgentAuthentication authentication;
    
    /**
     * Default input modes supported by the agent.
     * Defaults to ["text"].
     */
    private List<String> defaultInputModes;
    
    /**
     * Default output modes supported by the agent.
     * Defaults to ["text"].
     */
    private List<String> defaultOutputModes;
    
    /**
     * The skills provided by the agent.
     */
    private List<AgentSkill> skills;
}