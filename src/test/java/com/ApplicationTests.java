package com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapper.BookMapper;
import com.service.BookService;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	BookService bs;
	@Autowired
	BookMapper bm;
	@Test
	void contextLoads() {
		bs.list();
	}
	
	@Test
	void page() {
		
	}
}
