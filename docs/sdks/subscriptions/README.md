# Subscriptions
(*subscriptions*)

## Overview

With a Subscription it's possible to configure which Events are suitable for your company and how they should be dispatched.

### Available Operations

* [deleteSubscription](#deletesubscription) - Delete a Subscription.
* [getSubscription](#getsubscription) - Get a Subscription.
* [getSubscriptions](#getsubscriptions) - Get Subscriptions.
* [postSubscription](#postsubscription) - Create a Subscription.
* [updateSubscription](#updatesubscription) - Update a Subscription.

## deleteSubscription

Delete a Subscription.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.DeleteSubscriptionRequest;
import de.testcompany.Event_Notification.models.operations.DeleteSubscriptionResponse;
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

            de.testcompany.Event_Notification.models.operations.DeleteSubscriptionResponse res = sdk.subscriptions.deleteSubscription("<value>");

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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `subscriptionId`                                           | *String*                                                   | :heavy_check_mark:                                         | The unique id of the Subscription which should be managed. |


### Response

**[de.testcompany.Event_Notification.models.operations.DeleteSubscriptionResponse](../../models/operations/DeleteSubscriptionResponse.md)**


## getSubscription

Receive a specific Subscription.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetSubscriptionRequest;
import de.testcompany.Event_Notification.models.operations.GetSubscriptionResponse;
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

            de.testcompany.Event_Notification.models.operations.GetSubscriptionResponse res = sdk.subscriptions.getSubscription("<value>");

            if (res.subscription != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `subscriptionId`                                           | *String*                                                   | :heavy_check_mark:                                         | The unique id of the Subscription which should be managed. |


### Response

**[de.testcompany.Event_Notification.models.operations.GetSubscriptionResponse](../../models/operations/GetSubscriptionResponse.md)**


## getSubscriptions

Returns a list of all Subscriptions or the Subscriptions that belong to a company.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetSubscriptionsRequest;
import de.testcompany.Event_Notification.models.operations.GetSubscriptionsResponse;
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

            de.testcompany.Event_Notification.models.operations.GetSubscriptionsRequest req = new GetSubscriptionsRequest(
){{
                after = "<value>";
                before = "<value>";
                companyId = 366979L;
                limit = 462018;
                loanPartnerId = "<value>";

            }};

            de.testcompany.Event_Notification.models.operations.GetSubscriptionsResponse res = sdk.subscriptions.getSubscriptions(req);

            if (res.subscriptions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [de.testcompany.Event_Notification.models.operations.GetSubscriptionsRequest](../../models/operations/GetSubscriptionsRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[de.testcompany.Event_Notification.models.operations.GetSubscriptionsResponse](../../models/operations/GetSubscriptionsResponse.md)**


## postSubscription

Create a Subscription for company related event notifications.

A LoanPartnerId can be specified instead of a CompanyId. This is to support usecases, that currently work with LoanPartnerId.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.callbacks.PostSubscriptionPostNewEventResponse;
import de.testcompany.Event_Notification.models.operations.PostSubscriptionResponse;
import de.testcompany.Event_Notification.models.shared.Callback;
import de.testcompany.Event_Notification.models.shared.CallbackEvents;
import de.testcompany.Event_Notification.models.shared.EndPoint;
import de.testcompany.Event_Notification.models.shared.EndPointType;
import de.testcompany.Event_Notification.models.shared.EventInput;
import de.testcompany.Event_Notification.models.shared.EventType;
import de.testcompany.Event_Notification.models.shared.EventTypeSingle;
import de.testcompany.Event_Notification.models.shared.Security;
import de.testcompany.Event_Notification.models.shared.SubscriptionInput;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            EventNotification sdk = EventNotification.builder()
                .setSecurity(new Security(
                "<value>"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            de.testcompany.Event_Notification.models.shared.SubscriptionInput req = new SubscriptionInput(
                new EndPoint(
                    EndPointType.WEBHOOK),
                "All Submission events"){{
                companyId = 209547353334L;
                eventTypes = new de.testcompany.Event_Notification.models.shared.EventType[]{{
                    add(new EventType(
                    ){{}}),
                }};
                loanPartnerId = "123312";

            }};

            de.testcompany.Event_Notification.models.operations.PostSubscriptionResponse res = sdk.subscriptions.postSubscription(req);

            if (res.subscriptionId != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [de.testcompany.Event_Notification.models.shared.SubscriptionInput](../../models/shared/SubscriptionInput.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[de.testcompany.Event_Notification.models.operations.PostSubscriptionResponse](../../models/operations/PostSubscriptionResponse.md)**


## updateSubscription

Update a Subscription.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.UpdateSubscriptionRequest;
import de.testcompany.Event_Notification.models.operations.UpdateSubscriptionResponse;
import de.testcompany.Event_Notification.models.shared.PatchOperation;
import de.testcompany.Event_Notification.models.shared.PatchOperationSubscription;
import de.testcompany.Event_Notification.models.shared.PatchOperationSubscriptionPath;
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

            de.testcompany.Event_Notification.models.operations.UpdateSubscriptionResponse res = sdk.subscriptions.updateSubscription("<value>", new de.testcompany.Event_Notification.models.shared.PatchOperationSubscription[]{{
                add(new PatchOperationSubscription(
                PatchOperation.REPLACE,
                PatchOperationSubscriptionPath.ROOT_SUBSCRIPTION_NAME){{
                    op = PatchOperation.REPLACE;
                    path = PatchOperationSubscriptionPath.ROOT_SUBSCRIPTION_NAME;
                    value = "A new description";
                }}),
            }});

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

| Parameter                                                                                                                                                                                                      | Type                                                                                                                                                                                                           | Required                                                                                                                                                                                                       | Description                                                                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `subscriptionId`                                                                                                                                                                                               | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | The unique id of the Subscription which should be managed.                                                                                                                                                     |
| `requestBody`                                                                                                                                                                                                  | List<[de.testcompany.Event_Notification.models.shared.PatchOperationSubscription](../../models/shared/PatchOperationSubscription.md)>                                                                          | :heavy_minus_sign:                                                                                                                                                                                             | The specification of the values to be updated for the Subscription.<br/>See path for possible fields to be updated.<br/><br/>JSON Patch definition according to <a href='https://tools.ietf.org/html/rfc6902'>RFC6902</a>. |


### Response

**[de.testcompany.Event_Notification.models.operations.UpdateSubscriptionResponse](../../models/operations/UpdateSubscriptionResponse.md)**

