/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PatchOperationSubscriptionPath - Patchable paths of a subscription.
 */
public enum PatchOperationSubscriptionPath {
    ROOT_SUBSCRIPTION_NAME("/subscriptionName"),
    ROOT_END_POINT_END_POINT_TYPE("/endPoint/endPointType"),
    ROOT_END_POINT_WEBHOOK_URL("/endPoint/webhookUrl"),
    ROOT_END_POINT_EVENT_DISPATCH_INTERVAL_IN_SECONDS("/endPoint/eventDispatchIntervalInSeconds"),
    ROOT_END_POINT_EVENT_DISPATCH_COUNT("/endPoint/eventDispatchCount"),
    ROOT_EVENT_TYPES("/eventTypes");

    @JsonValue
    public final String value;

    private PatchOperationSubscriptionPath(String value) {
        this.value = value;
    }
}
