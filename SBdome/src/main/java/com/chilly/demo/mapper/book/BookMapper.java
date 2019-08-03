package com.chilly.demo.mapper.book;

import com.chilly.demo.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

//    @Select("SELECT * FROM book")
//    @Results({
//        @Result(property = "id",column = "id",javaType = int.class),
//        @Result(property = "bookname",column = "bookname",javaType = String.class),
//        @Result(property = "bookintro",column = "bookintro",javaType = String.class)
//    })
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
