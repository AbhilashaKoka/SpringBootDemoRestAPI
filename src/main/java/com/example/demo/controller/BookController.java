package com.example.demo.controller;
import com.example.demo.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

@GetMapping("book")
    public Book getBook()
    {
     Book book=new Book(
             1,
             "9781449337711",
             "Designing Evolvable Web APIs with ASP.NET",
             "Harnessing the Power of the Web",
            "Glenn Block et al.",
             "2020-06-04T09:12:43.000Z",
             "O'Reilly Media",
             238,
             "Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft",
            "http://chimera.labs.oreilly.com/books/1234000001708/index.html");
return book;
    }
}
