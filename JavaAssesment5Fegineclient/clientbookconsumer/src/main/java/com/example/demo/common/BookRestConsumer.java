package com.example.demo.common;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRestConsumer {

	public Book book;

	public String getBookData() {
		// TODO Auto-generated method stub
		return "getbookdata";
	}

	public String getAllBooks() {
		// TODO Auto-generated method stub
		return "getbookrecords";
	}

	public String getBookById(Integer id) {
		// TODO Auto-generated method stub
		return "getbookid";
	}

	public ResponseEntity<String> getEntityData() {
		// TODO Auto-generated method stub
		return null;
	}

}
