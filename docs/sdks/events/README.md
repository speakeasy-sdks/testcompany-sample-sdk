# Events
(*events*)

## Overview

Events hold basic information about what happened in the application. Based on the Events it's possible to get the specific data of the underlying resource.

### Available Operations

* [getEvents](#getevents) - Get Event Notifications.
* [postPing](#postping) - Ping endpoint
* [updateEvents](#updateevents) - Update Event Notifications.

## getEvents

Returns a list of open event notifications. Use this to pull event notifications, if a callback Url was not provided.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetEventsRequest;
import de.testcompany.Event_Notification.models.operations.GetEventsResponse;
import de.testcompany.Event_Notification.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            EventNotification sdk = EventNotification.builder()
                .setSecurity(new Security(
                "<value>"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            de.testcompany.Event_Notification.models.operations.GetEventsRequest req = new GetEventsRequest(
                "<value>"){{
                after = "<value>";
                before = "<value>";
                limit = 630035;
                status = "<value>";

            }};

            de.testcompany.Event_Notification.models.operations.GetEventsResponse res = sdk.events.getEvents(req);

            if (res.events != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [de.testcompany.Event_Notification.models.operations.GetEventsRequest](../../models/operations/GetEventsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[de.testcompany.Event_Notification.models.operations.GetEventsResponse](../../models/operations/GetEventsResponse.md)**


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
                "<value>"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            de.testcompany.Event_Notification.models.shared.Ping req = new Ping(
                "https://server.com"){{
                companyId = 209547353334L;
                loanPartnerId = "123312";

            }};

            de.testcompany.Event_Notification.models.operations.PostPingResponse res = sdk.events.postPing(req);

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


## updateEvents

Update Event Notifications.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.UpdateEventsRequest;
import de.testcompany.Event_Notification.models.operations.UpdateEventsResponse;
import de.testcompany.Event_Notification.models.shared.PatchOperation;
import de.testcompany.Event_Notification.models.shared.PatchOperationEvent;
import de.testcompany.Event_Notification.models.shared.Path;
import de.testcompany.Event_Notification.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            EventNotification sdk = EventNotification.builder()
                .setSecurity(new Security(
                "<value>"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            de.testcompany.Event_Notification.models.operations.UpdateEventsResponse res = sdk.events.updateEvents("<value>", new de.testcompany.Event_Notification.models.shared.PatchOperationEvent[]{{
                add(new PatchOperationEvent(
                "91fba95d-c3c9-4a67-a5d4-fd0b0d4870f4",
                PatchOperation.REPLACE,
                Path.ROOT_EVENT_STATUS){{
                    eventId = "91fba95d-c3c9-4a67-a5d4-fd0b0d4870f4";
                    op = PatchOperation.REPLACE;
                    path = Path.ROOT_EVENT_STATUS;
                    value = "A new description";
                }}),
            }});

            if (res.eventsWithoutPaging != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                | Type                                                                                                                                                                                                     | Required                                                                                                                                                                                                 | Description                                                                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `subscriptionId`                                                                                                                                                                                         | *String*                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                       | The unique id of the Subscription which should be managed.                                                                                                                                               |
| `requestBody`                                                                                                                                                                                            | List<[de.testcompany.Event_Notification.models.shared.PatchOperationEvent](../../models/shared/PatchOperationEvent.md)>                                                                                  | :heavy_minus_sign:                                                                                                                                                                                       | The specification of the values to be updated for the Events.<br/>See path for possible fields to be updated.<br/><br/>JSON Patch definition according to <a href='https://tools.ietf.org/html/rfc6902'>RFC6902</a>. |


### Response

**[de.testcompany.Event_Notification.models.operations.UpdateEventsResponse](../../models/operations/UpdateEventsResponse.md)**

