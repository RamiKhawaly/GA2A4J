package com.ga2a4j.model.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an error when push notification is not supported.
 * This error is returned with code -32003 when a client requests push notifications
 * from an agent that doesn't support this feature.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PushNotificationNotSupportedError {
    /**
     * Error code for push notification not supported (-32003)
     */
    private Integer code = -32003;
    
    /**
     * Error message
     */
    private String message = "Push Notification is not supported";
    
    /**
     * Additional error data (null for this error type)
     */
    private Object data = null;
}