package com.team.finn.net.interceptor;


import com.team.finn.utils.L;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;



/**
 *  版本号：1.0
 *  备注消息：
 **/

public class LogInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request=chain.request();
        Response response=chain.proceed(chain.request());
        MediaType mediaType=response.body().contentType();
        String content=response.body().string();
        long t1 = System.nanoTime();
        L.i(String.format("Sending request %s on %s%n%s", request.url(), chain.connection(), request.headers()));
        long t2 = System.nanoTime();
        L.i(String.format("Received response for %s in %.1fms%n%s", response.request().url(), (t2 - t1) / 1e6d, response.headers()));
        L.i("NetWork", "response body:" + content);
        if(response.body()!=null)
        {
            ResponseBody body=ResponseBody.create(mediaType, content);
            return response.newBuilder().body(body).build();
        }
        return response;

    }
}