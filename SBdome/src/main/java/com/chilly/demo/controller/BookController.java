package com.chilly.demo.controller;

import com.chilly.demo.entity.Book;
import com.chilly.demo.exception.BaseExceptionHandleAction;
import com.chilly.demo.mapper.book.BookMapper;
import com.chilly.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/7/28
 */
@Controller
@RequestMapping("/book")
public class BookController extends BaseExceptionHandleAction {

    @Resource
    BookService bookService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/getAllBook";
    }

    @RequestMapping("/getAllBook")
    public String getAllBook(Model model){
        List<Book> bookList = bookService.getAllBook();
        model.addAttribute("books",bookList);
        return "book/list";  //对应resources/templates文件中的.html文件
    }

    @RequestMapping("/addBook")
    public String addBook(Book book){
        int i = bookService.addBook(book);
        System.out.println("id"+i);

        return "redirect:/book/getAllBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "book/bookAdd";
    }

    @RequestMapping("/deleteBookById")
    public String deleteBookById(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/getAllBook";
    }

    @RequestMapping("/updateBookById")
    public String updateBookById(Book book){
        bookService.updateBookById(book);
        return "redirect:/book/getAllBook";
    }

    @RequestMapping("/toUpdateBookById")
    public String toUpdateBookById(Model model,int id){
        Book book = bookService.findBookById(id);
        model.addAttribute("book",book);
        return "book/bookEdit";
    }

}
