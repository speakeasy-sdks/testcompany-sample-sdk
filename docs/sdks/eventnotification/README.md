# EventNotification SDK


## Overview

Event Notification: ## Summary
Use this API to subscribe to event notifications such as 'submission created'.

Specify a webhook Url to automatically receive event notifications when events occur (PUSH).
Or alternatively use the endpoint GET /subscription/{subscriptionId}/events to PULL available events.

Available Event Types can be accessed through the Event Types Endpoints.

If you use a webhook url, make sure, that at least the TECHNICAL_PING event, needs to be processed, for every webhook.

Technical description for error handling
<https://developer.ehyphome.de/local-apis/errorHandling.pdf>
### Available Operations

