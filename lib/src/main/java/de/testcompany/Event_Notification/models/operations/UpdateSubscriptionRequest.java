/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.testcompany.Event_Notification.utils.SpeakeasyMetadata;


public class UpdateSubscriptionRequest {
    /**
     * The unique id of the Subscription which should be managed.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscriptionId")
    public String subscriptionId;

    public UpdateSubscriptionRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    /**
     * The specification of the values to be updated for the Subscription.
     * See path for possible fields to be updated.
     * 
     * JSON Patch definition according to &lt;a href='https://tools.ietf.org/html/rfc6902'&gt;RFC6902&lt;/a&gt;.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public de.testcompany.Event_Notification.models.shared.PatchOperationSubscription[] requestBody;

    public UpdateSubscriptionRequest withRequestBody(de.testcompany.Event_Notification.models.shared.PatchOperationSubscription[] requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    public UpdateSubscriptionRequest(@JsonProperty("subscriptionId") String subscriptionId) {
        this.subscriptionId = subscriptionId;
  }
}
