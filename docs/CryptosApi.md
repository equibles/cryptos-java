# CryptosApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](CryptosApi.md#list) | **GET** /cryptos/list | Get a list of all the available crytocurrencies.
[**profile**](CryptosApi.md#profile) | **GET** /cryptos/profile | The profile of this cryptocurrency.

<a name="list"></a>
# **list**
> CryptoCurrencyProfilesResponse list(page, pageSize)

Get a list of all the available crytocurrencies.

### Example
```java
// Import classes:
//import com.equibles.cryptos.ApiClient;
//import com.equibles.cryptos.ApiException;
//import com.equibles.cryptos.Configuration;
//import com.equibles.cryptos.auth.*;
//import com.equibles.cryptos.api.CryptosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

CryptosApi apiInstance = new CryptosApi();
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 100; // Integer | The number of elements in each page. Max value: 100.
try {
    CryptoCurrencyProfilesResponse result = apiInstance.list(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptosApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 100. | [optional] [default to 100]

### Return type

[**CryptoCurrencyProfilesResponse**](CryptoCurrencyProfilesResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="profile"></a>
# **profile**
> CryptoCurrencyProfileResponse profile(ticker)

The profile of this cryptocurrency.

### Example
```java
// Import classes:
//import com.equibles.cryptos.ApiClient;
//import com.equibles.cryptos.ApiException;
//import com.equibles.cryptos.Configuration;
//import com.equibles.cryptos.auth.*;
//import com.equibles.cryptos.api.CryptosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

CryptosApi apiInstance = new CryptosApi();
String ticker = "ticker_example"; // String | The cryptocurrency ticker. Example: BTC (for Bitcoin)
try {
    CryptoCurrencyProfileResponse result = apiInstance.profile(ticker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptosApi#profile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | **String**| The cryptocurrency ticker. Example: BTC (for Bitcoin) |

### Return type

[**CryptoCurrencyProfileResponse**](CryptoCurrencyProfileResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

