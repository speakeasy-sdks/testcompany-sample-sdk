/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.testcompany.Event_Notification.utils.HTTPClient;
import de.testcompany.Event_Notification.utils.HTTPRequest;
import de.testcompany.Event_Notification.utils.JSON;
import de.testcompany.Event_Notification.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

/**
 * Events hold basic information about what happened in the application. Based on the Events it's possible to get the specific data of the underlying resource.
 */
public class Events {
	
	private SDKConfiguration sdkConfiguration;

	public Events(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get Event Notifications.
     * Returns a list of open event notifications. Use this to pull event notifications, if a callback Url was not provided.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public de.testcompany.Event_Notification.models.operations.GetEventsResponse getEvents(de.testcompany.Event_Notification.models.operations.GetEventsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = de.testcompany.Event_Notification.utils.Utils.generateURL(de.testcompany.Event_Notification.models.operations.GetEventsRequest.class, baseUrl, "/subscriptions/{subscriptionId}/events", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = de.testcompany.Event_Notification.utils.Utils.getQueryParams(de.testcompany.Event_Notification.models.operations.GetEventsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        de.testcompany.Event_Notification.models.operations.GetEventsResponse res = new de.testcompany.Event_Notification.models.operations.GetEventsResponse(contentType, httpRes.statusCode()) {{
            events = null;
            rfc7807Problem = null;
            oAuthProblem = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.Events out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.Events.class);
                res.events = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.Rfc7807Problem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.Rfc7807Problem.class);
                res.rfc7807Problem = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.OAuthProblem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.OAuthProblem.class);
                res.oAuthProblem = out;
            }
        }

        return res;
    }

    /**
     * Ping endpoint
     * Dispatch ping Event to configured Subscription endpoint.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public de.testcompany.Event_Notification.models.operations.PostPingResponse postPing(de.testcompany.Event_Notification.models.shared.Ping request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = de.testcompany.Event_Notification.utils.Utils.generateURL(baseUrl, "/ping");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = de.testcompany.Event_Notification.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        de.testcompany.Event_Notification.models.operations.PostPingResponse res = new de.testcompany.Event_Notification.models.operations.PostPingResponse(contentType, httpRes.statusCode()) {{
            rfc7807Problem = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 400) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.Rfc7807Problem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.Rfc7807Problem.class);
                res.rfc7807Problem = out;
            }
        }

        return res;
    }

    /**
     * Update Event Notifications.
     * @param subscriptionId The unique id of the Subscription which should be managed.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public de.testcompany.Event_Notification.models.operations.UpdateEventsResponse updateEvents(String subscriptionId) throws Exception {
        return this.updateEvents(subscriptionId, null);
    }

    /**
     * Update Event Notifications.
     * @param subscriptionId The unique id of the Subscription which should be managed.
     * @param requestBody The specification of the values to be updated for the Events.
    See path for possible fields to be updated.

    JSON Patch definition according to <a href='https://tools.ietf.org/html/rfc6902'>RFC6902</a>.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public de.testcompany.Event_Notification.models.operations.UpdateEventsResponse updateEvents(String subscriptionId, de.testcompany.Event_Notification.models.shared.PatchOperationEvent[] requestBody) throws Exception {
        de.testcompany.Event_Notification.models.operations.UpdateEventsRequest request = new de.testcompany.Event_Notification.models.operations.UpdateEventsRequest(subscriptionId);
        request.requestBody=requestBody;
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = de.testcompany.Event_Notification.utils.Utils.generateURL(de.testcompany.Event_Notification.models.operations.UpdateEventsRequest.class, baseUrl, "/subscriptions/{subscriptionId}/events", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = de.testcompany.Event_Notification.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        de.testcompany.Event_Notification.models.operations.UpdateEventsResponse res = new de.testcompany.Event_Notification.models.operations.UpdateEventsResponse(contentType, httpRes.statusCode()) {{
            eventsWithoutPaging = null;
            rfc7807Problem = null;
            oAuthProblem = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.EventsWithoutPaging out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.EventsWithoutPaging.class);
                res.eventsWithoutPaging = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.Rfc7807Problem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.Rfc7807Problem.class);
                res.rfc7807Problem = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.OAuthProblem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.OAuthProblem.class);
                res.oAuthProblem = out;
            }
        }

        return res;
    }
}