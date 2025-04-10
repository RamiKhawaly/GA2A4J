package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the capabilities of an agent in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentCapabilities {
    /**
     * Whether the agent supports streaming.
     * Defaults to false.
     */
    private boolean streaming;
    
    /**
     * Whether the agent supports push notifications.
     * Defaults to false.
     */
    private boolean pushNotifications;
    
    /**
     * Whether the agent supports state transition history.
     * Defaults to false.
     */
    private boolean stateTransitionHistory;
}