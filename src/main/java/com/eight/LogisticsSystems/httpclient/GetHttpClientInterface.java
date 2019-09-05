package com.shop.purchase.httpclient;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


/**
 * @author summer
 * @date 2019/8/27 9:21
 */
public class GetHttpClientInterface {
    public static void main(String[] args) throws IOException {
        //Get请求
        //1、获取HttpClient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2、创建连接方式
        String url = "http://192.168.1.1:8080/compare";
        HttpGet get = new HttpGet(url);
        //3、设置请求方式连接的参数
        get.setConfig(MyRequsetConfig.getRequestConfig());
        try {
            //1、执行请求，获取服务器返回的结果
            CloseableHttpResponse response = client.execute(get);
            String resopse = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(resopse);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }

    }

    //test
    public List test() throws IOException {
        //Get请求
        //1、获取HttpClient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2、创建连接方式
        String url = "http://192.168.1.1:8080/compare";
        HttpGet get = new HttpGet(url);
        //3、设置请求方式连接的参数
        List result = null;
        get.setConfig(MyRequsetConfig.getRequestConfig());
        try {
            //1、执行请求，获取服务器返回的结果
            CloseableHttpResponse response = client.execute(get);
            result = Collections.singletonList(EntityUtils.toString(response.getEntity(), "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
        return result;
    }

    //仓库库存地址
    public List warehouseAddress() throws IOException {
        //Get请求
        //1、获取HttpClient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2、创建连接方式
        String url = "http://192.168.1.16:8080/stockSearch";
        HttpGet get = new HttpGet(url);
        //3、设置请求方式连接的参数
        List result = null;
        get.setConfig(MyRequsetConfig.getRequestConfig());
        try {
            //1、执行请求，获取服务器返回的结果
            CloseableHttpResponse response = client.execute(get);
            result = Collections.singletonList(EntityUtils.toString(response.getEntity(), "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
        return result;
    }

    //供应商信息
    //仓库库存地址
    public List SupplierInformation(String product) throws IOException {
        //Get请求
        //1、获取HttpClient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2、创建连接方式
        String url = "http://192.168.1.199:8080/selectByGoodsType?goodstype=" + product;
        HttpGet get = new HttpGet(url);
        //3、设置请求方式连接的参数
        List result = null;
        get.setConfig(MyRequsetConfig.getRequestConfig());
        try {
            //1、执行请求，获取服务器返回的结果
            CloseableHttpResponse response = client.execute(get);
            result = Collections.singletonList(EntityUtils.toString(response.getEntity(), "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
        return result;
    }


}
