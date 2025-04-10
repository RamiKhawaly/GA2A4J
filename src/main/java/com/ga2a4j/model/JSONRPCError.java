package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a JSON-RPC error in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JSONRPCError {
    /**
     * Error code.
     */
    private Integer code;
    
    /**
     * Error message.
     */
    private String message;
    
    /**
     * Additional error data.
     */
    private Object data;
}