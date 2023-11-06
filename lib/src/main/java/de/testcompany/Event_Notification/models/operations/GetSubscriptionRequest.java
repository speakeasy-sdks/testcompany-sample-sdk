/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.testcompany.Event_Notification.utils.SpeakeasyMetadata;


public class GetSubscriptionRequest {
    /**
     * The unique id of the Subscription which should be managed.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscriptionId")
    public String subscriptionId;

    public GetSubscriptionRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    public GetSubscriptionRequest(@JsonProperty("subscriptionId") String subscriptionId) {
        this.subscriptionId = subscriptionId;
  }
}
