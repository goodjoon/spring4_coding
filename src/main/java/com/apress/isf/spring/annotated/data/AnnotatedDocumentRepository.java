package com.apress.isf.spring.annotated.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.spring.data.DocumentDAO;

@Repository("documentDAO")
public class AnnotatedDocumentRepository implements DocumentDAO {

	@Override
	public Document[] getAll() {
		return storage();
	}
	
	private Document[] storage() {
		List<Document> result = new ArrayList<Document>();
		
		Type type = new Type();
		type.setName("PDF");
		type.setDesc("Portable Document Format");
		type.setExtension(".pdf");
		
		Document document = new Document();
		document.setName("Book Template");
		document.setType(type);
		document.setLocation("D:/temp/felipeg/documents/random/Book Template.pdf");
		
		result.add(document);
		
		document = new Document();
		document.setName("Sample Contract");
		document.setType(type);
		document.setLocation("D:/temp/felipeg/contracts/Sample Contract.pdf");
		
		result.add(document);
		
		type = new Type();
		type.setName("NOTE");
		type.setDesc("Text Notes");
		type.setExtension(".txt");
		
		document = new Document();
		document.setName("Clustering with RabbitMQ");
		document.setType(type);
		document.setLocation("D:/temp/felipeg/documents/random/Clustering with TabbitMQ.txt");
		
		result.add(document);
		
		type = new Type();
		type.setName("WEB");
		type.setDesc("Web Link");
		type.setExtension(".url");
		
		document = new Document();
		document.setName("Pro Spring Security Book");
		document.setType(type);
		document.setLocation("http://www.apress.com/9781430248187");
		
		result.add(document);
		
		return result.toArray(new Document[result.size()]);
	}
}
