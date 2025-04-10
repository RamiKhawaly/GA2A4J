package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Parameters for requests that require a task ID.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskIdParams {
    /**
     * The unique identifier of the task.
     */
    private String taskId;
}
