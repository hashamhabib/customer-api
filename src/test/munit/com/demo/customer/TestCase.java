package com.demo.customer;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class TestCase {
	
	@Test
    public void httpEndpoint() throws IOException
    {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://localhost:8081/api");
        HttpResponse response = client.execute(httpGet);
    }

}
