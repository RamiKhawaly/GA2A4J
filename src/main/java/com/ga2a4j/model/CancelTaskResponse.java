package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a response to a cancel task request in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelTaskResponse {
    /**
     * JSON-RPC version, always "2.0".
     */
    private String jsonrpc = "2.0";
    
    /**
     * Request identifier that this is a response to.
     */
    private Object id;
    
    /**
     * The result of the operation, containing task information.
     */
    private Task result;
    
    /**
     * Error information if the request failed.
     */
    private JSONRPCError error;
}