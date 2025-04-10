package com.ga2a4j.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Represents a DataPart in the A2A protocol.
 * DataPart is a type of Part that contains binary data with a MIME type.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DataPart extends Part {
    /**
     * The MIME type of the data.
     */
    private String mimeType;
    
    /**
     * The binary data encoded as a Base64 string.
     */
    private String data;
    
    /**
     * Constructor that initializes the type field to "data".
     * 
     * @param mimeType The MIME type of the data
     * @param data The binary data encoded as a Base64 string
     */
    public DataPart(String mimeType, String data) {
        super("data");
        this.mimeType = mimeType;
        this.data = data;
    }
}
