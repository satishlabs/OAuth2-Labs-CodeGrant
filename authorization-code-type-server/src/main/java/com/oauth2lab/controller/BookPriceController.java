package com.oauth2lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oauth2lab.info.BookPriceInfo;

@RestController
//@RequestMapping("/myapi")
public class BookPriceController {
	
	@GetMapping("/bookPrice/{bookId}")
	public BookPriceInfo getBookPrice(@PathVariable Integer bookId) {
		System.out.println("BookPriceController --- getBookPrice()");
		BookPriceInfo bInfo = new BookPriceInfo(bookId, 5000.0, 10.0,"Spring Security");
		return bInfo;
	}
}
