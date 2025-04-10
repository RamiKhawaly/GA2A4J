package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Represents an Artifact in the A2A protocol.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Artifact {
    private String name;
    private String description;
    private List<Part> parts;
    private Integer index;
    private Boolean append;
    private Boolean lastChunk;
    private Map<String, Object> metadata;
}