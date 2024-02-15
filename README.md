# Event-Notification

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/speakeasy-sdks/testcompany-sample-sdk.git/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/testcompany-sample-sdk/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
    
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README
<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'de.testcompany.Event_Notification:Event-Notification:0.5.0'
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [eventTypes](docs/sdks/eventtypes/README.md)

* [getCategories](docs/sdks/eventtypes/README.md#getcategories) - Get Event Categories.
* [getCategory](docs/sdks/eventtypes/README.md#getcategory) - Get an Event Category.
* [getName](docs/sdks/eventtypes/README.md#getname) - Get an Event Type Name.
* [getNames](docs/sdks/eventtypes/README.md#getnames) - Get Event Names.

### [info](docs/sdks/info/README.md)

* [getServiceInfo](docs/sdks/info/README.md#getserviceinfo) - Get API service status and info

### [events](docs/sdks/events/README.md)

* [getEvents](docs/sdks/events/README.md#getevents) - Get Event Notifications.
* [postPing](docs/sdks/events/README.md#postping) - Ping endpoint
* [updateEvents](docs/sdks/events/README.md#updateevents) - Update Event Notifications.

### [internal](docs/sdks/internal/README.md)

* [postPing](docs/sdks/internal/README.md#postping) - Ping endpoint

### [subscriptions](docs/sdks/subscriptions/README.md)

* [deleteSubscription](docs/sdks/subscriptions/README.md#deletesubscription) - Delete a Subscription.
* [getSubscription](docs/sdks/subscriptions/README.md#getsubscription) - Get a Subscription.
* [getSubscriptions](docs/sdks/subscriptions/README.md#getsubscriptions) - Get Subscriptions.
* [postSubscription](docs/sdks/subscriptions/README.md#postsubscription) - Create a Subscription.
* [updateSubscription](docs/sdks/subscriptions/README.md#updatesubscription) - Update a Subscription.
<!-- End Available Resources and Operations [operations] -->

<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally using the `setServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://event-notification-service.ehyp.prod.interhyp-cloud.de` | None |
| 1 | `https://event-notification-service.ehyp.dev.interhyp-cloud.de` | None |




### Override Server URL Per-Client

The default server can also be overridden globally using the `setServerURL` option when initializing the SDK client instance. For example:
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
