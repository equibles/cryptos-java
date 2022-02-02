# Equibles Cryptos API for Java

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.equibles.cryptos</groupId>
  <artifactId>equibles-cryptos</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.equibles.cryptos:equibles-cryptos:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/equibles-cryptos-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.equibles.cryptos.*;
import com.equibles.cryptos.auth.*;
import com.equibles.cryptos.models.*;
import com.equibles.cryptos.api.CryptosApi;

import java.io.File;
import java.util.*;

public class CryptosApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.equibles.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CryptosApi* | [**list**](docs/CryptosApi.md#list) | **GET** /cryptos/list | Get a list of all the available crytocurrencies.
*CryptosApi* | [**profile**](docs/CryptosApi.md#profile) | **GET** /cryptos/profile | The profile of this cryptocurrency.
*PricesApi* | [**endOfDay**](docs/PricesApi.md#endOfDay) | **GET** /cryptos/prices/endofday | Lists the end of day prices for a given cryptocurrency.
*PricesApi* | [**intraday**](docs/PricesApi.md#intraday) | **GET** /cryptos/prices/intraday | Lists the intraday prices for a given cryptocurrency with one minute precision.

## Documentation for Models

 - [AssetType](docs/AssetType.md)
 - [CryptoCurrencyProfile](docs/CryptoCurrencyProfile.md)
 - [CryptoCurrencyProfileResponse](docs/CryptoCurrencyProfileResponse.md)
 - [CryptoCurrencyProfilesResponse](docs/CryptoCurrencyProfilesResponse.md)
 - [Exchange](docs/Exchange.md)
 - [Image](docs/Image.md)
 - [Price](docs/Price.md)
 - [PricesResponse](docs/PricesResponse.md)
 - [ResponseStatus](docs/ResponseStatus.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Query String

- **Type**: API key
- **API key parameter name**: ApiKey
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
[Equibles](https://www.equibles.com)\
equibles@gmail.com
