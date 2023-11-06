/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Violation - Description of a faulty field value.
 */

public class Violation {
    /**
     * Name of the field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field")
    public String field;

    public Violation withField(String field) {
        this.field = field;
        return this;
    }
    
    /**
     * Error description.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public Violation withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public Violation(){}
}