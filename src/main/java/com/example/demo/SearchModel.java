package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SearchModel implements Serializable {
	private String searchWord;
	private String bookName;
	private String author;
	private Date registDate;
}
