/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventCategoryDescription - Event type specific category with description
 */

public class EventCategoryDescription {
    /**
     * Event type specific category.
     */
    @JsonProperty("category")
    public String category;

    public EventCategoryDescription withCategory(String category) {
        this.category = category;
        return this;
    }
    
    /**
     * Description of an Event type specific category.
     */
    @JsonProperty("description")
    public String description;

    public EventCategoryDescription withDescription(String description) {
        this.description = description;
        return this;
    }
    
    public EventCategoryDescription(@JsonProperty("category") String category, @JsonProperty("description") String description) {
        this.category = category;
        this.description = description;
  }
}
