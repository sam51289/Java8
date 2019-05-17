package Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dto.Book;

public class BookImpl {
	
	public 	Predicate<Book> getBookNamePredicate(String bookName){
	 	Predicate<Book> bookNamePredicate = book-> book.getBookName().equals(bookName);
	 	return bookNamePredicate;
	}
	
	public void searchBuyAuthor(List<Book> bookList, String author){
		
		bookList.stream()
			.filter(b->b.getAuthor().equals(author))
			.collect(Collectors.toList())
			.forEach(a->System.out.println(a));
		
	}
	
	public void searchForLongBook(List<Book> bookList, int pages){
		
		System.out.println("Long Books are....");
		bookList.stream().filter(b->b.getPageCosunt() > pages)
		.collect(Collectors.toList())
		.forEach(a->System.out.println(a));

	}

	
	public void genericSearch(List<Book> bookList, Predicate<Book> predicate){
		
		System.out.println("Generic Search started");
		bookList.stream().filter(predicate).collect(Collectors.toList())
		.forEach(a->System.out.println(a));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(123, "Java", "Sumit", 100, 500));
		bookList.add(new Book(401, "JavaScript", "Sandip", 200, 400));
		bookList.add(new Book(701, "Angular", "Amit", 300, 300));
		bookList.add(new Book(205, "DataScience", "Sumit", 400, 1000));
		bookList.add(new Book(123, "AI", "Girish", 500, 1500));
		
		System.out.println("Searching for Author");
		BookImpl bookImpl= new BookImpl();
		bookImpl.searchBuyAuthor(bookList, "Amit");
		
		System.out.println("Searching for Pages");
		
		bookImpl.searchForLongBook(bookList, 300);
		
		System.out.println("Generic Search for author");
		bookImpl.genericSearch(bookList, bookImpl.getBookNamePredicate("Java"));
		
		
	}

}
