package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Book;

@Mapper
public interface BookMapper extends BaseMapper<Book>{
	//public List<Book> list();
	
}
