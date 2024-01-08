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

/**
 * Tag to describe internal endpoints
 */
public class Internal {
	
	private SDKConfiguration sdkConfiguration;

	public Internal(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
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
        
        de.testcompany.Event_Notification.models.operations.PostPingResponse res = new de.testcompany.Event_Notification.models.operations.PostPingResponse(contentType, httpRes.statusCode(), httpRes) {{
            rfc7807Problem = null;
        }};
        
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
}