/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Events - Events
 */

public class Events {
    /**
     * Array of event notifications.
     */
    @JsonProperty("data")
    public Event[] data;

    public Events withData(Event[] data) {
        this.data = data;
        return this;
    }
    
    /**
     * Cursor-based pagination to improve performance and minimize networks traffic, Pagination is enforced for operations
     * that potentially could return a large collection of items.
     * 
     */
    @JsonProperty("paging")
    public PageableResultInfo paging;

    public Events withPaging(PageableResultInfo paging) {
        this.paging = paging;
        return this;
    }
    
    public Events(@JsonProperty("data") Event[] data, @JsonProperty("paging") PageableResultInfo paging) {
        this.data = data;
        this.paging = paging;
  }
}