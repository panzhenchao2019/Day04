package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Book;
import com.bw.mapper.BookMapper;

@Service
public class BookServiceimpl implements BookService{

	@Autowired
	private BookMapper m;

	public List<Book> list() {
		// TODO Auto-generated method stub
		return m.list();
	}
}
