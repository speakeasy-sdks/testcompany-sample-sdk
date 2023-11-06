# PostSubscriptionPostNewEventResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `callback`                                                                                                               | [de.testcompany.Event_Notification.models.shared.Callback](../../models/shared/Callback.md)                              | :heavy_minus_sign:                                                                                                       | Your server returns this code if it accepts the callback.                                                                |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | HTTP response content type for this operation                                                                            |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | HTTP response status code for this operation                                                                             |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | Raw HTTP response; suitable for custom response parsing                                                                  |