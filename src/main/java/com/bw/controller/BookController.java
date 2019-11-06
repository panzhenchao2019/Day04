package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.bean.Book;
import com.bw.service.BookService;
import com.github.pagehelper.PageHelper;

@Controller
public class BookController {

	@Autowired
	private BookService ser;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Book> list = ser.list();
		model.addAttribute("list", list);
		return "list";
	}
}
