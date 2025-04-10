package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a skill provided by an agent in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentSkill {
    /**
     * The unique identifier of the skill.
     */
    private String id;
    
    /**
     * The name of the skill.
     */
    private String name;
    
    /**
     * Optional description of the skill.
     */
    private String description;
    
    /**
     * Optional tags associated with the skill.
     */
    private List<String> tags;
    
    /**
     * Optional examples of using the skill.
     */
    private List<String> examples;
    
    /**
     * Optional input modes supported by the skill.
     */
    private List<String> inputModes;
    
    /**
     * Optional output modes supported by the skill.
     */
    private List<String> outputModes;
}