/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EndPoint - Endpoint to receive event notifications.
 */

public class EndPoint {
    /**
     * The specific endPointType, holding information, how you receive your Events.
     */
    @JsonProperty("endPointType")
    public EndPointEndPointType endPointType;

    public EndPoint withEndPointType(EndPointEndPointType endPointType) {
        this.endPointType = endPointType;
        return this;
    }
    
    public EndPoint(@JsonProperty("endPointType") EndPointEndPointType endPointType) {
        this.endPointType = endPointType;
  }
}
