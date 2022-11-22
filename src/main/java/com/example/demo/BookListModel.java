package com.example.demo;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BookListModel {
	private String bookName;
	private String author;
	private Date registDate;
}
