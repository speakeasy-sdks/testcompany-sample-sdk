# Internal
(*internal*)

## Overview

Tag to describe internal endpoints

### Available Operations

* [postPing](#postping) - Ping endpoint

## postPing

Dispatch ping Event to configured Subscription endpoint.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.PostPingResponse;
import de.testcompany.Event_Notification.models.shared.Ping;
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

            de.testcompany.Event_Notification.models.shared.Ping req = new Ping(
                "https://server.com"){{
                companyId = 209547353334L;
                loanPartnerId = "123312";

            }};

            de.testcompany.Event_Notification.models.operations.PostPingResponse res = sdk.internal.postPing(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [de.testcompany.Event_Notification.models.shared.Ping](../../models/shared/Ping.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[de.testcompany.Event_Notification.models.operations.PostPingResponse](../../models/operations/PostPingResponse.md)**

