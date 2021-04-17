package br.edu.insper.desagil.site;

import java.util.Date;

public class Comment {
	private Date date;
	private String author;
	private String content;
	
	public Comment(String author, String content) {
		super();
		this.author = author;
		this.content = content;
		this.date=new Date();
	}
	
	public Date getDate() {
		return this.date;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getContent() {
		return this.content;
	}
	
}
