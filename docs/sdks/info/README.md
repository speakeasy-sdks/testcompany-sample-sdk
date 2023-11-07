# Info
(*.info*)

## Overview

General information about the API and the connectivity

### Available Operations

* [getServiceInfo](#getserviceinfo) - Get API service status and info

## getServiceInfo

Delivers information about API service status and basic information about the current version

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetServiceInfoResponse;
import de.testcompany.Event_Notification.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            EventNotification sdk = EventNotification.builder()
                .setSecurity(new Security("string"){{
                    bearerAuth = "";
                }})
                .build();

            GetServiceInfoResponse res = sdk.info.getServiceInfo();

            if (res.serviceInfo != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[de.testcompany.Event_Notification.models.operations.GetServiceInfoResponse](../../models/operations/GetServiceInfoResponse.md)**

