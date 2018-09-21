package com.gros.endpoint;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.get;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import javax.servlet.MultipartConfigElement;

import com.google.gson.Gson;

public class PruebaServiceEndPoint {
	
	public static void main(String[] args) {
		
		port(8080);
		
		
		get("/authorization", (request, response) -> {
			System.out.println("Llego al servicio...");
			response.type("application/json");
			response.status(200);
			return "{\"Estatus\":\"OK\",\"message\":\"Saludos desde el servicio\"}";
		});
		
		get("/ebxmlCheck/healtCheck", (request, response) -> {
			response.type("application/json");
			response.status(200);
			return "{\"Estatus\":\"OK\"}";
		});
		
		post("/pruebaServicio/remove", (request, response) -> {
			response.type("application/json");
			response.status(200);
			return "{\"Estatus\":\"OK\"}";
		});
	}
	
}
