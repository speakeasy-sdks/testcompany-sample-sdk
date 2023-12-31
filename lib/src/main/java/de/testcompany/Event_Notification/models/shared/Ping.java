/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ping - Ping Ressource to test a specific endpoint.
 */

public class Ping {
    /**
     * The id of the Company, for which the Ping should be performed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyId")
    public Long companyId;

    public Ping withCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    
    /**
     * The id of the Loan partner, for which the Ping should be performed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loanPartnerId")
    public String loanPartnerId;

    public Ping withLoanPartnerId(String loanPartnerId) {
        this.loanPartnerId = loanPartnerId;
        return this;
    }
    
    /**
     * Webhook url for which the Ping should be performed.
     */
    @JsonProperty("webhookUrl")
    public String webhookUrl;

    public Ping withWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }
    
    public Ping(@JsonProperty("webhookUrl") String webhookUrl) {
        this.webhookUrl = webhookUrl;
  }
}
