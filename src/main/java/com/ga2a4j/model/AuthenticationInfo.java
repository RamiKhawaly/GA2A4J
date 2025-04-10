package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Authentication information for the A2A protocol.
 * Contains authentication schemes and credentials.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationInfo {
    /**
     * List of authentication schemes supported
     */
    private List<String> schemes;
    
    /**
     * Authentication credentials
     */
    private String credentials;
    
    /**
     * Additional properties that might be needed for authentication
     */
    private Map<String, Object> additionalProperties;
}