/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.testcompany.Event_Notification.utils.DateTimeDeserializer;
import de.testcompany.Event_Notification.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Rfc7807Problem - Detailed information on the error.
 */

public class Rfc7807Problem {
    /**
     * Further description of the error pattern.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail")
    public String detail;

    public Rfc7807Problem withDetail(String detail) {
        this.detail = detail;
        return this;
    }
    
    /**
     * The path which was called.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance")
    public String instance;

    public Rfc7807Problem withInstance(String instance) {
        this.instance = instance;
        return this;
    }
    
    /**
     * HTTP status code based on the following error codes (https://tools.ietf.org/html/rfc2616#section-10).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Integer status;

    public Rfc7807Problem withStatus(Integer status) {
        this.status = status;
        return this;
    }
    
    /**
     * Error time as UTC date-time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;

    public Rfc7807Problem withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    /**
     * Error message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public Rfc7807Problem withTitle(String title) {
        this.title = title;
        return this;
    }
    
    /**
     * The Trace id of the request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("traceId")
    public String traceId;

    public Rfc7807Problem withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    
    /**
     * Further information on the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public Rfc7807Problem withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * Optional list of fields with incorrect content.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("violations")
    public Violation[] violations;

    public Rfc7807Problem withViolations(Violation[] violations) {
        this.violations = violations;
        return this;
    }
    
    public Rfc7807Problem(){}
}
