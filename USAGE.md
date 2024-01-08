<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetCategoriesRequest;
import de.testcompany.Event_Notification.models.operations.GetCategoriesResponse;
import de.testcompany.Event_Notification.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            EventNotification sdk = EventNotification.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            de.testcompany.Event_Notification.models.operations.GetCategoriesResponse res = sdk.eventTypes.getCategories("string");

            if (res.eventCategoryDescriptions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->