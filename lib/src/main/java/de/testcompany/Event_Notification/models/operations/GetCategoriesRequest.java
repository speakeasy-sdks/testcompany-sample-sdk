/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.operations;

import de.testcompany.Event_Notification.utils.SpeakeasyMetadata;


public class GetCategoriesRequest {
    /**
     * Optional language (EN/DE). The default is EN.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=language")
    public String language;

    public GetCategoriesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }
    
    public GetCategoriesRequest(){}
}
