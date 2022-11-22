package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 在庫検索サービス*/
@Service
public class SearchService {
	
	@Autowired
	private BookListMapper bookListMapper;
	
	public BookListModel getSearchResult(SearchModel searchword) {
		return bookListMapper.search(searchword);
	}
}
