package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.entity.Book;
import com.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bs;
	
	@GetMapping("/findAll")
	public List<Book> findAll(){
		return bs.list();
	}
	
	@GetMapping("/findOne")
	public Book findOne(@RequestParam int id){
		return bs.getById(id);
	}
	
	//分页
	@GetMapping("/{page}/{pagesize}")
	//当前页码和当前页码数量
	public Page<Book> page(@PathVariable int page,@PathVariable("pagesize") int size){
		Page<Book> pageinfo = new Page<>(page,size);
	//	LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
		Page<Book> page2 = bs.page(pageinfo);
		return page2;
		
	}
}
