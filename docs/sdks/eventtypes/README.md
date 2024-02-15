# EventTypes
(*eventTypes*)

## Overview

Event Types collect all information and further descriptions about all available Event Type Categories and Event Type Names.

### Available Operations

* [getCategories](#getcategories) - Get Event Categories.
* [getCategory](#getcategory) - Get an Event Category.
* [getName](#getname) - Get an Event Type Name.
* [getNames](#getnames) - Get Event Names.

## getCategories

Returns a list of all possible Event Type Categories.

### Example Usage

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
                "<value>"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            de.testcompany.Event_Notification.models.operations.GetCategoriesResponse res = sdk.eventTypes.getCategories("<value>");

            if (res.eventCategoryDescriptions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `language`                                    | *String*                                      | :heavy_minus_sign:                            | Optional language (EN/DE). The default is EN. |


### Response

**[de.testcompany.Event_Notification.models.operations.GetCategoriesResponse](../../models/operations/GetCategoriesResponse.md)**


## getCategory

Returns a specific Event Type Category with its description.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetCategoryRequest;
import de.testcompany.Event_Notification.models.operations.GetCategoryResponse;
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

            de.testcompany.Event_Notification.models.operations.GetCategoryResponse res = sdk.eventTypes.getCategory("<value>", "<value>");

            if (res.eventCategoryDescription != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `typeCategory`                                     | *String*                                           | :heavy_check_mark:                                 | The unique name of a specific Event Type Category. |
| `language`                                         | *String*                                           | :heavy_minus_sign:                                 | Optional language (EN/DE). The default is EN.      |


### Response

**[de.testcompany.Event_Notification.models.operations.GetCategoryResponse](../../models/operations/GetCategoryResponse.md)**


## getName

Returns a specific Event Type Name with its description for a specific Event Type Category.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetNameRequest;
import de.testcompany.Event_Notification.models.operations.GetNameResponse;
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

            de.testcompany.Event_Notification.models.operations.GetNameResponse res = sdk.eventTypes.getName("<value>", "<value>", "<value>");

            if (res.eventNameDescription != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `typeCategory`                                     | *String*                                           | :heavy_check_mark:                                 | The unique name of a specific Event Type Category. |
| `typeName`                                         | *String*                                           | :heavy_check_mark:                                 | The unique name of a specific Event Type Name.     |
| `language`                                         | *String*                                           | :heavy_minus_sign:                                 | Optional language (EN/DE). The default is EN.      |


### Response

**[de.testcompany.Event_Notification.models.operations.GetNameResponse](../../models/operations/GetNameResponse.md)**


## getNames

Returns a list of all possible Event Type Names for a specific Event Type Category.

### Example Usage

```java
package hello.world;

import de.testcompany.Event_Notification.EventNotification;
import de.testcompany.Event_Notification.models.operations.GetNamesRequest;
import de.testcompany.Event_Notification.models.operations.GetNamesResponse;
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

            de.testcompany.Event_Notification.models.operations.GetNamesResponse res = sdk.eventTypes.getNames("<value>", "<value>");

            if (res.eventNameDescriptions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `typeCategory`                                     | *String*                                           | :heavy_check_mark:                                 | The unique name of a specific Event Type Category. |
| `language`                                         | *String*                                           | :heavy_minus_sign:                                 | Optional language (EN/DE). The default is EN.      |


### Response

**[de.testcompany.Event_Notification.models.operations.GetNamesResponse](../../models/operations/GetNamesResponse.md)**

