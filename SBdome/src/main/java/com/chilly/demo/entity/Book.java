package com.chilly.demo.entity;

import javax.validation.constraints.NotEmpty;

/**
 * @auther ChillyLin
 * @date 2019/7/28
 */
public class Book {

    private int id;

    @NotEmpty(message = "BookName is required.")
    private String bookname;

    private String bookintro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookintro() {
        return bookintro;
    }

    public void setBookintro(String bookintro) {
        this.bookintro = bookintro;
    }
}
