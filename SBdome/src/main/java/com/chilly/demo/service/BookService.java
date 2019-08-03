package com.chilly.demo.service;

import com.chilly.demo.entity.Book;

import java.util.List;

public interface BookService {
    /**
     * 显示全部Book
     * @return Books
     */
    List<Book> getAllBook();

    /**
     *
     * @param book
     * @return 添加成功返回插入的id，否则0
     */
    int addBook(Book book);

    /**
     *
     * @param id
     * @return 删除成功返回1，否则返回0
     */
    int deleteBookById(int id);

    /**
     *
     * @param book
     * @return 修改成功返回1，否则返回0
     */
    int updateBookById(Book book);

    /**
     *
     * @param id
     * @return
     */
    Book findBookById(int id);
}
