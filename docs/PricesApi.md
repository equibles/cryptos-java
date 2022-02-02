# PricesApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**endOfDay**](PricesApi.md#endOfDay) | **GET** /cryptos/prices/endofday | Lists the end of day prices for a given cryptocurrency.
[**intraday**](PricesApi.md#intraday) | **GET** /cryptos/prices/intraday | Lists the intraday prices for a given cryptocurrency with one minute precision.

<a name="endOfDay"></a>
# **endOfDay**
> PricesResponse endOfDay(ticker, startTime, endTime, page, pageSize)

Lists the end of day prices for a given cryptocurrency.

### Example
```java
// Import classes:
//import com.equibles.cryptos.ApiClient;
//import com.equibles.cryptos.ApiException;
//import com.equibles.cryptos.Configuration;
//import com.equibles.cryptos.auth.*;
//import com.equibles.cryptos.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
String ticker = "ticker_example"; // String | The ticker of the cryptocurrency. Example: BTC (for Bitcoin)
OffsetDateTime startTime = new OffsetDateTime(); // OffsetDateTime | The start time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17)
OffsetDateTime endTime = new OffsetDateTime(); // OffsetDateTime | The end time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17)
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 50000.
try {
    PricesResponse result = apiInstance.endOfDay(ticker, startTime, endTime, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#endOfDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | **String**| The ticker of the cryptocurrency. Example: BTC (for Bitcoin) |
 **startTime** | **OffsetDateTime**| The start time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17) | [optional]
 **endTime** | **OffsetDateTime**| The end time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17) | [optional]
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 50000. | [optional] [default to 1000]

### Return type

[**PricesResponse**](PricesResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="intraday"></a>
# **intraday**
> PricesResponse intraday(ticker, startTime, endTime, page, pageSize)

Lists the intraday prices for a given cryptocurrency with one minute precision.

### Example
```java
// Import classes:
//import com.equibles.cryptos.ApiClient;
//import com.equibles.cryptos.ApiException;
//import com.equibles.cryptos.Configuration;
//import com.equibles.cryptos.auth.*;
//import com.equibles.cryptos.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
String ticker = "ticker_example"; // String | The ticker of the cryptocurrency. Example: BTC (for Bitcoin)
OffsetDateTime startTime = new OffsetDateTime(); // OffsetDateTime | The start time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17)
OffsetDateTime endTime = new OffsetDateTime(); // OffsetDateTime | The end time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17)
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 50000.
try {
    PricesResponse result = apiInstance.intraday(ticker, startTime, endTime, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#intraday");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | **String**| The ticker of the cryptocurrency. Example: BTC (for Bitcoin) |
 **startTime** | **OffsetDateTime**| The start time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17) | [optional]
 **endTime** | **OffsetDateTime**| The end time of the window. UTC time formatted according to ISO 8601 (i.e: 2022-02-01T13:45:17) | [optional]
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 50000. | [optional] [default to 1000]

### Return type

[**PricesResponse**](PricesResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

