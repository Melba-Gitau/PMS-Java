package com.test.Testshop;

import okhttp3.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
@RestController
@RequestMapping("/message")
public class SmsApi {
    @PostMapping("/sms")
    public HashMap<String, Object> map(@RequestBody Details details){
        HashMap<String, Object> map = new HashMap<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        okhttp3.RequestBody body =  okhttp3.RequestBody.create(mediaType, " {\r\n" +
                " \"api_key\":\"5cfcaadcf19e0\",\r\n " +
                " \"username\":\"Justus\",\r\n" +
                " \"sender_id\":\"PAYLIFE\",\r\n " +
                " \"message\":\""+details.getMessage()+"\",\r\n" +
                "\"phone\":\""+details.getPhone()+"\"\r\n}");
        System.out.print(" {\r\n" +
                " \"api_key\":\"5cfcaadcf19e0\",\r\n " +
                " \"username\":\"Justus\",\r\n" +
                " \"sender_id\":\"PAYLIFE\",\r\n " +
                " \"message\":\""+details.getMessage()+",\r\n" +
                "\"phone\":\""+details.getPhone()+"\r\n}");
        Request request = new Request.Builder()
                .url("http://bulksms.mobitechtechnologies.com/api/sendsms")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response = client.newCall(request).execute();
            map.put("Success",true);
            map.put("message", "sent successfully");
        } catch (IOException e) {
            map.put("Success", false);
            map.put("message","failed to send");
            throw new RuntimeException(e);
        }
        return map;
    }


}
