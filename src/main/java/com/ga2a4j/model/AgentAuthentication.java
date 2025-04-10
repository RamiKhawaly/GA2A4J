package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents authentication information for an agent in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentAuthentication {
    /**
     * The authentication schemes supported by the agent.
     */
    private List<String> schemes;
    
    /**
     * Optional credentials information.
     */
    private String credentials;
}