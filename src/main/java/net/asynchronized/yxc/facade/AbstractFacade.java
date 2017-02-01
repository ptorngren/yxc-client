/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class AbstractFacade {
    
    private String host;
    private String rootUrl;
    
    public AbstractFacade(String host) {
        this.host = host;
        this.rootUrl = "http://" + host;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
        setRootUrl("http://" + host);
    }

    public String getRootUrl() {
        return rootUrl;
    }

    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }
    
    
    protected <T> T call(String subPath, Class<? extends T> type) throws IOException {
        T t = null;
        URL url = new URL(rootUrl + subPath);
        ObjectMapper mapper = new ObjectMapper();
        t = mapper.readValue(url, type);
        
        return t;
    }
    
    protected Response post(String subPath, Object o) throws IOException {
        Response response = null;
        URL url = new URL(rootUrl + subPath);
        ObjectMapper mapper = new ObjectMapper();
        HttpURLConnection client = (HttpURLConnection) url.openConnection();
        client.setDoOutput(true);
        client.setDoInput(true);
        client.setRequestMethod("POST");
        client.setRequestProperty("Content-Type", "application/json");
        OutputStream os = client.getOutputStream();
        
        mapper.writeValue(os, o);
        os.close();
        InputStream is = client.getInputStream();
        response = mapper.readValue(is, Response.class);
        is.close();
        client.disconnect();
        
        return response;
    }
}
