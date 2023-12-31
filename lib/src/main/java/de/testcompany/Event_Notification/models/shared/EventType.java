/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventType - Event type specific category and names.
 */

public class EventType {
    /**
     * Event type specific category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    public String category;

    public EventType withCategory(String category) {
        this.category = category;
        return this;
    }
    
    /**
     * General Event type specific names.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("names")
    public String[] names;

    public EventType withNames(String[] names) {
        this.names = names;
        return this;
    }
    
    public EventType(){}
}
