/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package de.testcompany.Event_Notification.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.testcompany.Event_Notification.utils.SpeakeasyMetadata;


public class GetNamesRequest {
    /**
     * The unique name of a specific Event Type Category.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=typeCategory")
    public String typeCategory;

    public GetNamesRequest withTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
        return this;
    }
    
    /**
     * Optional language (EN/DE). The default is EN.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=language")
    public String language;

    public GetNamesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }
    
    public GetNamesRequest(@JsonProperty("typeCategory") String typeCategory) {
        this.typeCategory = typeCategory;
  }
}
