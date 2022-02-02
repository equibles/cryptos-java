/*
 * Stocks
 * <h3>Authentication</h3>                     You need to authenticate to use this API.                     To authenticate click on the \"Authorize\" button and do one of the following steps.<br />                     1. Send your API key in the headers of the request by typing \"Bearer my-key\" on the Bearer authorization scheme.<br />                     2. Send your API key on the \"ApiKey\" query string parameter. To do this type your API key in the Query String authorization scheme.<br />                     Both methods are equally valid. We offer both options so that you can use the method that is easier to use in your application.<br />                     <br />                     <h3>API limits</h3>                     Your API key may be subject to daily/hourly limits. To know how much requests you have left look at the following headers in the response.<br />                     1. <strong>x-ratelimit-limit</strong> - The total number of requests that you are allowed to make in a given period (hour/day)                       2. <strong>x-ratelimit-remaining</strong> - The number of remaining requests that you can perform in the current period.<br />                     3. <strong>x-ratelimit-reset</strong> - The number of seconds until the current period resets.<br />                     <br />                     <h3>Suggestions</h3>                     You don't need to implement the whole API by hand in your programming language of choice.<br />                     Since this API has an OpenAPI specification you can use                      <a href=\"https://github.com/swagger-api/swagger-codegen\" target=\"_blank\">Swagger Generator</a>                      to automatically generate client stubs for more than 30 programming languages.                     <br />                     <br />                     You don't have an API key? <a href=\"https://www.equibles.com/api/pricing\" target=\"_blank\">Get one for free here.</a>
 *
 * OpenAPI spec version: v1
 * Contact: equibles@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.equibles.cryptos.api;

import com.equibles.cryptos.ApiCallback;
import com.equibles.cryptos.ApiClient;
import com.equibles.cryptos.ApiException;
import com.equibles.cryptos.ApiResponse;
import com.equibles.cryptos.Configuration;
import com.equibles.cryptos.Pair;
import com.equibles.cryptos.ProgressRequestBody;
import com.equibles.cryptos.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.equibles.cryptos.models.TransactionsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for insiders
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insidersCall(String fullTicker, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/stocks/transactions/insiders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fullTicker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fullTicker", fullTicker));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Query String" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call insidersValidateBeforeCall(String fullTicker, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'fullTicker' is set
        if (fullTicker == null) {
            throw new ApiException("Missing the required parameter 'fullTicker' when calling insiders(Async)");
        }
        
        com.squareup.okhttp.Call call = insidersCall(fullTicker, page, pageSize, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Lists the insider transactions for a given stock.
     * 
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @return TransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionsResponse insiders(String fullTicker, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<TransactionsResponse> resp = insidersWithHttpInfo(fullTicker, page, pageSize);
        return resp.getData();
    }

    /**
     * Lists the insider transactions for a given stock.
     * 
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @return ApiResponse&lt;TransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionsResponse> insidersWithHttpInfo(String fullTicker, Integer page, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = insidersValidateBeforeCall(fullTicker, page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<TransactionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists the insider transactions for a given stock. (asynchronously)
     * 
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insidersAsync(String fullTicker, Integer page, Integer pageSize, final ApiCallback<TransactionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = insidersValidateBeforeCall(fullTicker, page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for institutional
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call institutionalCall(String fullTicker, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/stocks/transactions/institutional";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fullTicker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fullTicker", fullTicker));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Query String" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call institutionalValidateBeforeCall(String fullTicker, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'fullTicker' is set
        if (fullTicker == null) {
            throw new ApiException("Missing the required parameter 'fullTicker' when calling institutional(Async)");
        }
        
        com.squareup.okhttp.Call call = institutionalCall(fullTicker, page, pageSize, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Lists the institutional transactions for a given stock.
     * 
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @return TransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionsResponse institutional(String fullTicker, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<TransactionsResponse> resp = institutionalWithHttpInfo(fullTicker, page, pageSize);
        return resp.getData();
    }

    /**
     * Lists the institutional transactions for a given stock.
     * 
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @return ApiResponse&lt;TransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionsResponse> institutionalWithHttpInfo(String fullTicker, Integer page, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = institutionalValidateBeforeCall(fullTicker, page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<TransactionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists the institutional transactions for a given stock. (asynchronously)
     * 
     * @param fullTicker The fully qualified ticker of the stock. Example: AAPL.XNAS (required)
     * @param page The number of the page to request. (optional, default to 1)
     * @param pageSize The number of elements in each page. Max value: 1000. (optional, default to 1000)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call institutionalAsync(String fullTicker, Integer page, Integer pageSize, final ApiCallback<TransactionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = institutionalValidateBeforeCall(fullTicker, page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
