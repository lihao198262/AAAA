package com.lihao.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lihao.crm.entity.Book;
import com.lihao.crm.repository.BookRepository;


@Controller
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/bookQuery")
	public String bookQuery(String bookName, Model model) {
		List<Book> books = bookRepository.findAllByNameLike("%" + bookName + "%");
		model.addAttribute("books", books);
		return "library/library2";
	}

	@GetMapping("/library")
	public String library() {
		return "library/library";
	}
}
