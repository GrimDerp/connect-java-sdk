
# CreateOrderRequestDiscount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogObjectId** | **String** | Only used for catalog taxes. The catalog object ID from exsiting [CatalogDiscount](#type-catalogdiscount).  Do not provide a value for this field if you provide values in other fields for an ad hoc discount. |  [optional]
**name** | **String** | Only used for ad hoc discounts. The discount&#39;s name. |  [optional]
**percentage** | **String** | Only used for ad hoc discounts. The percentage of the discount, as a string representation of a decimal number.  A value of &#x60;7.25&#x60; corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0 |  [optional]
**amountMoney** | [**Money**](Money.md) | Only used for ad hoc discounts. The monetary amount of the discount. |  [optional]



