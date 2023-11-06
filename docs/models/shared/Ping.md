# Ping

Ping Ressource to test a specific endpoint.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `companyId`                                                         | *Long*                                                              | :heavy_minus_sign:                                                  | The id of the Company, for which the Ping should be performed.      | 209547353334                                                        |
| `loanPartnerId`                                                     | *String*                                                            | :heavy_minus_sign:                                                  | The id of the Loan partner, for which the Ping should be performed. | 123312                                                              |
| `webhookUrl`                                                        | *String*                                                            | :heavy_check_mark:                                                  | Webhook url for which the Ping should be performed.                 | https://server.com                                                  |