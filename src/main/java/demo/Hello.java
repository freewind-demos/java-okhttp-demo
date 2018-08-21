package demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Hello {

    private static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws Exception {
        Request request = new Request.Builder()
                .url("http://httpbin.org/get")
                .header("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        String body = response.body().string();
        System.out.println(body);
    }

}
