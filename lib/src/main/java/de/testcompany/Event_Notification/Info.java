/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.testcompany.Event_Notification.utils.HTTPClient;
import de.testcompany.Event_Notification.utils.HTTPRequest;
import de.testcompany.Event_Notification.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

/**
 * General information about the API and the connectivity
 */
public class Info {
	
	private SDKConfiguration sdkConfiguration;

	public Info(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get API service status and info
     * Delivers information about API service status and basic information about the current version
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public de.testcompany.Event_Notification.models.operations.GetServiceInfoResponse getServiceInfo() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = de.testcompany.Event_Notification.utils.Utils.generateURL(baseUrl, "/info");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        de.testcompany.Event_Notification.models.operations.GetServiceInfoResponse res = new de.testcompany.Event_Notification.models.operations.GetServiceInfoResponse(contentType, httpRes.statusCode(), httpRes) {{
            serviceInfo = null;
            oAuthProblem = null;
            rfc7807Problem = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.ServiceInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.ServiceInfo.class);
                res.serviceInfo = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.OAuthProblem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.OAuthProblem.class);
                res.oAuthProblem = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (de.testcompany.Event_Notification.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                de.testcompany.Event_Notification.models.shared.Rfc7807Problem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), de.testcompany.Event_Notification.models.shared.Rfc7807Problem.class);
                res.rfc7807Problem = out;
            }
        }

        return res;
    }
}