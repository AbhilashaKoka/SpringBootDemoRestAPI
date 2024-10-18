package com.example.demo;

import com.example.demo.bean.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		Book book = new Book( );
//		book.setId(1);
//		book.setIsbn("9781449331818");
//		book.setTitle("Learning JavaScript Design Patterns");
//		book.setSubTitle("A JavaScript and jQuery Developer's Guide");
//		book.setAuthor("Addy Osmani");
//		book.setPublished("2012-07-01T00:00:00.000Z");
//		book.setPublisher("O'Reilly Media");
//		book.setPages(254);
//		book.setDescription("With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.");
//		book.setWebsite("https://www.addyosmani.com/resources/essentialjsdesignpatterns/book/");
//		System.out.println(book.getId());
//		System.out.println(book.getIsbn());
//		System.out.println(book.getTitle());
//		System.out.println(book.getSubTitle());
//		System.out.println(book.getAuthor());
//		System.out.println(book.getPublished());
//		System.out.println(book.getPages());
//		System.out.println(book.getDescription());
//		System.out.println(book.getWebsite());

	}
}
