# Cursor

A cursor refers to a random string of characters which marks a specific item in a collection of data.

The cursor will always point to the item, however it will be invalidated if the item is deleted or removed.



## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `after`                                                                                  | *String*                                                                                 | :heavy_minus_sign:                                                                       | This is the cursor that points to the end of the page of data that has been returned.<br/> |
| `before`                                                                                 | *String*                                                                                 | :heavy_minus_sign:                                                                       | This is the cursor that points to the start of the page of data that has been returned.<br/> |