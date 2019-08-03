package com.chilly.demo.service.impl;

import com.chilly.demo.entity.Book;
import com.chilly.demo.mapper.book.BookMapper;
import com.chilly.demo.service.BookService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/8/1
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    /**
     * 显示全部Book
     * * @return Books
     */
    @Override
    public List<Book> getAllBook(){
        return bookMapper.getAllBook();
    }

    /**
     *
     * @param book
     * @return 添加成功返回插入的id，否则0
     */
    @Override
    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    /**
     *
     * @param id
     * @return 删除成功返回1，否则返回0
     */
    @Override
    public int deleteBookById(int id){
        return bookMapper.deleteBookById(id);
    }

    /**
     *
     * @param book
     * @return 修改成功返回1，否则返回0
     */
    @Override
    public int updateBookById(Book book){
        return bookMapper.updateBookById(book);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Book findBookById(int id){
        return bookMapper.findBookById(id);
    }
}
