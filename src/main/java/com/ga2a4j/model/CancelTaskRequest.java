package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a request to cancel a task in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelTaskRequest {
    /**
     * JSON-RPC version, always "2.0".
     */
    private String jsonrpc = "2.0";
    
    /**
     * Request identifier that can be used to match responses to requests.
     * Can be an integer, string, or null.
     */
    private Object id;
    
    /**
     * The method name, always "tasks/cancel" for this request type.
     */
    private String method = "tasks/cancel";
    
    /**
     * Parameters for the cancel task request, containing the task ID.
     */
    private TaskIdParams params;
}
