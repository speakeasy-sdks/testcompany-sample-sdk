/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostSubscriptionResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PostSubscriptionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Unauthorized
     */
    
    public de.testcompany.Event_Notification.models.shared.OAuthProblem oAuthProblem;

    public PostSubscriptionResponse withOAuthProblem(de.testcompany.Event_Notification.models.shared.OAuthProblem oAuthProblem) {
        this.oAuthProblem = oAuthProblem;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public de.testcompany.Event_Notification.models.shared.Rfc7807Problem rfc7807Problem;

    public PostSubscriptionResponse withRfc7807Problem(de.testcompany.Event_Notification.models.shared.Rfc7807Problem rfc7807Problem) {
        this.rfc7807Problem = rfc7807Problem;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PostSubscriptionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PostSubscriptionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Added
     */
    
    public de.testcompany.Event_Notification.models.shared.SubscriptionId subscriptionId;

    public PostSubscriptionResponse withSubscriptionId(de.testcompany.Event_Notification.models.shared.SubscriptionId subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    public PostSubscriptionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
