/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CallbackEvents - Resource to acknowledge a specific Event.
 */

public class CallbackEvents {
    /**
     * The token for the callback request. This token must be returned in the callback response to acknowledge that events were received.
     */
    @JsonProperty("callbackToken")
    public String callbackToken;

    public CallbackEvents withCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    
    /**
     * Array of event notifications.
     */
    @JsonProperty("data")
    public EventInput[] data;

    public CallbackEvents withData(EventInput[] data) {
        this.data = data;
        return this;
    }
    
    public CallbackEvents(@JsonProperty("callbackToken") String callbackToken, @JsonProperty("data") EventInput[] data) {
        this.callbackToken = callbackToken;
        this.data = data;
  }
}
