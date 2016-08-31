package com.apress.isf.spring.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

@Configuration
public class MyDocumentsContext {
	private Map<String, Document> documents = new HashMap<String, Document>();
	private Map<String, Type> types = new HashMap<String, Type>();
}
