package com.globo.mart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GloboMartApplication {

	String output;
	public static void main(String[] args) {
		SpringApplication.run(GloboMartApplication.class, args);
	}
	
	//To add new Product
	public void addProduct() {
		String url="http://localhost:8081/product";
		try {
			URL url1 = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
			   conn.setRequestMethod("POST");
			   conn.setRequestProperty("Accept", "application/json");
			   
			   if (conn.getResponseCode() != 200) {
			      throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			   }
			   
			   BufferedReader br = new BufferedReader(new InputStreamReader(
			      (conn.getInputStream())));
			   while ((output = br.readLine()) != null) {
			      System.out.println(output);
			   }
			   conn.disconnect();

			} catch (MalformedURLException e) {
			   e.printStackTrace();
			} catch (IOException e) {
			   e.printStackTrace();
			}
	}
	
	
	//To get Product
	public void getProduct() {
		String url="http://localhost:8081/product/1";
		try {
			URL url1 = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
			   conn.setRequestMethod("GET");
			   conn.setRequestProperty("Accept", "application/json");
			   
			   if (conn.getResponseCode() != 200) {
			      throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			   }
			   
			   BufferedReader br = new BufferedReader(new InputStreamReader(
			      (conn.getInputStream())));
			   while ((output = br.readLine()) != null) {
			      System.out.println(output);
			   }
			   conn.disconnect();

			} catch (MalformedURLException e) {
			   e.printStackTrace();
			} catch (IOException e) {
			   e.printStackTrace();
			}
	}
	
	
	
	//To remove Product
	public void removeProduct() {
		String url="http://localhost:8081/product/1";
		try {
			URL url1 = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
			   conn.setRequestMethod("DELETE");
			   conn.setRequestProperty("Accept", "application/json");
			   
			   if (conn.getResponseCode() != 200) {
			      throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			   }
			   
			   BufferedReader br = new BufferedReader(new InputStreamReader(
			      (conn.getInputStream())));
			   while ((output = br.readLine()) != null) {
			      System.out.println(output);
			   }
			   conn.disconnect();

			} catch (MalformedURLException e) {
			   e.printStackTrace();
			} catch (IOException e) {
			   e.printStackTrace();
			}
	}
}
