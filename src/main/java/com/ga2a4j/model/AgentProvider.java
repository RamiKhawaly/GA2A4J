package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an Agent Provider in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentProvider {
    /**
     * The organization providing the agent.
     */
    private String organization;
    
    /**
     * Optional URL of the provider.
     */
    private String url;
}