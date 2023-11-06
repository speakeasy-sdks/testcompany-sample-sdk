/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.operations;

import de.testcompany.Event_Notification.utils.SpeakeasyMetadata;


public class GetSubscriptionsRequest {
    /**
     * Cursor that points to the end of the page of data that has been returned.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    public String after;

    public GetSubscriptionsRequest withAfter(String after) {
        this.after = after;
        return this;
    }
    
    /**
     * Cursor that points to the start of the page of data that has been returned.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=before")
    public String before;

    public GetSubscriptionsRequest withBefore(String before) {
        this.before = before;
        return this;
    }
    
    /**
     * The id of the Company, for which the Subscription is applicable.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=companyId")
    public Long companyId;

    public GetSubscriptionsRequest withCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    
    /**
     * Specifies how many items to return at one time (max 50). &lt;br&gt; A query may return fewer than the value of limit due to filtering.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;

    public GetSubscriptionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * The id of the Loan partner, for which the Subscription is applicable.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=loanPartnerId")
    public String loanPartnerId;

    public GetSubscriptionsRequest withLoanPartnerId(String loanPartnerId) {
        this.loanPartnerId = loanPartnerId;
        return this;
    }
    
    public GetSubscriptionsRequest(){}
}