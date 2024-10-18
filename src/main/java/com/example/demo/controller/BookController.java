package com.example.demo.controller;
import com.example.demo.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("book")
    public Book getBook() {
        Book book = new Book(
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

    @GetMapping("books")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,
                "9781449337711",
                "Designing Evolvable Web APIs with ASP.NET",
                "Harnessing the Power of the Web",
                "Glenn Block et al.",
                "2020-06-04T09:12:43.000Z",
                "O'Reilly Media",
                238,
                "Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft",
                "http://chimera.labs.oreilly.com/books/1234000001708/index.html"));
        books.add(new Book(2,
                "9781449325862",
                "Git Pocket Guide",
                "A Working Introduction",
                "Richard E. Silverman",
                "2020-06-04T08:48:39.000Z",
                "O'Reilly Media",
                234,
                "This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp",
                "http://chimera.labs.oreilly.com/books/1230000000561/index.html"));

        books.add(new Book(3,
                "9781449337711",
                "Designing Evolvable Web APIs with ASP.NET",
                "Harnessing the Power of the Web",
                "Glenn Block et al.",
                "2020-06-04T09:12:43.000Z",
                "O'Reilly Media",
                238,
                "Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft",
                "http://chimera.labs.oreilly.com/books/1234000001708/index.html"
        ));

            books.add(new Book(4,
                    "9781449365035",
                    "Speaking JavaScript",
                    "An In-Depth Guide for Programmers",
                    "Axel Rauschmayer",
                    "2014-02-01T00:00:00.000Z",
                    "O'Reilly Media",
                    460,
                    "Like it or not, JavaScript is everywhere these days-from browser to server to mobile-and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who o",
                    "http://speakingjs.com/"
            ));

            books.add(new Book(5,
                    "9781491904244",
                    "You Don't Know JS",
                    "ES6 & Beyond",
                    "Kyle Simpson",
                    "2015-12-27T00:00:00.000Z",
                    "O'Reilly Media",
                    278,
                    "No matter how much experience you have with JavaScript, odds are you don’t fully understand the language. As part of the \\\"You Don’t Know JS\\\" series, this compact guide focuses on new features available in ECMAScript 6 (ES6), the latest version of the st",
                    "https://github.com/getify/You-Dont-Know-JS/tree/master/es6%20&%20beyond"
            ));
            books.add(new Book(6,
                    "9781491950296",
                    "Programming JavaScript Applications",
                    "Robust Web Architecture with Node, HTML5, and Modern JS Libraries",
                    "Eric Elliott",
                    "2014-07-01T00:00:00.000Z",
                    "O'Reilly Media",
                    254,
                    "Take advantage of JavaScript's power to build robust web-scale or enterprise applications that are easy to extend and maintain. By applying the design patterns outlined in this practical book, experienced JavaScript developers will learn how to write flex",
                    "http://chimera.labs.oreilly.com/books/1234000000262/index.html"
            ));
            books.add(new Book(7,
                    "9781593275846",
                    "Eloquent JavaScript, Second Edition",
                    "A Modern Introduction to Programming",
                    "Marijn Haverbeke",
                    "2014-12-14T00:00:00.000Z",
                    "No Starch Press",
                    472,
                    "JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale ",
                    "http://eloquentjavascript.net/"
            ));
            books.add(new Book(8,
                    "9781593277574",
                    "Understanding ECMAScript 6",
                    "The Definitive Guide for JavaScript Developers",
                    "Nicholas C. Zakas",
                    "2016-09-03T00:00:00.000Z",
                    "No Starch Press",
                    352,
                    "ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that E",
                    "https://leanpub.com/understandinges6/read"
            ));
            return books;
        }


       @GetMapping("books/{id}/{isbn}")
        public Book bookPathVariable(@PathVariable int id,
                                     @PathVariable String isbn){
        return new Book(id,isbn,
                "Designing Evolvable Web APIs with ASP.NET",
                "Harnessing the Power of the Web",
                "Glenn Block et al.",
                "2020-06-04T09:12:43.000Z",
                "O'Reilly Media",
                238,
                "Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft",
                "http://chimera.labs.oreilly.com/books/1234000001708/index.html");
        }
    }

