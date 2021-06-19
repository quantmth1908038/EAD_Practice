package com.example.truongminhquan.controller;

import com.example.truongminhquan.entity.BookEntity;
import com.example.truongminhquan.entity.PublisherCatalogEntity;
import com.example.truongminhquan.service.BookService;
import com.example.truongminhquan.service.PublisherCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    BookService bookService;

    @Autowired
    PublisherCatalogService publisherCatalogService;

    @GetMapping({"/", "/index", "/book"})
    public String ListBook(Model model) {
        List<BookEntity> books = bookService.getAllBook();
        model.addAttribute("books", books);
        return "listpro";
    }

    @GetMapping("/book/create")
    public String viewAddBook(Model model) {
        BookEntity bookEntity = new BookEntity();
        List<PublisherCatalogEntity> publisherCatalogs = publisherCatalogService.getAllPublisherCatalog();
        model.addAttribute("publisherCatalogs", publisherCatalogs);
        model.addAttribute("model", bookEntity);
        return "addpro";
    }

    @PostMapping("/book/create")
    public String addBook(@ModelAttribute BookEntity bookEntity, Model model) {
        bookService.createBook(bookEntity);
        return "redirect:/book";
    }

    @GetMapping({"/pubcata"})
    public String ListPC(Model model) {
        List<PublisherCatalogEntity> publisherCatalogs = publisherCatalogService.getAllPublisherCatalog();
        model.addAttribute("publisherCatalogs", publisherCatalogs);
        return "listpubcata";
    }

    @GetMapping("/pubcata/create")
    public String viewAddPC(Model model) {
        PublisherCatalogEntity publisherCatalogEntity = new PublisherCatalogEntity();
        model.addAttribute("model", publisherCatalogEntity);
        return "addpubcata";
    }

    @PostMapping("/pubcata/create")
    public String addPC(@ModelAttribute PublisherCatalogEntity publisherCatalogEntity, Model model) {
        publisherCatalogService.createPublisherCatalog(publisherCatalogEntity);
        return "redirect:/pubcata";
    }

    @PostMapping("/book/search")
    public String bookSearch(@RequestParam String name, Model model) {
        List<BookEntity> books = bookService.getBookByName(name);
        model.addAttribute("books", books);
        return "listpro";
    }

}
