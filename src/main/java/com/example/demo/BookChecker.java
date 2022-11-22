package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookChecker {
	
	@Autowired
	private SearchService searchservice;

	/** メインページ */
	@RequestMapping("bookchecker")
	public String start() {
		return "index.html";
	}
	
	/** 検索結果ページ */
	@RequestMapping("search")
	public String search(@ModelAttribute SearchModel searchModel, Model model) {
		//検索実行
		BookListModel bookListModel =searchservice.getSearchResult(searchModel);
		model.addAttribute("searchinfo",bookListModel);
		return "search";
	}
	
	/** 登録ページ */
	@RequestMapping("register")
	public String register() {
		return "register.html";
	}
}
