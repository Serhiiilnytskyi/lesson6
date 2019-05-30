package com.lits;

import com.lits.dao.BookDao;
import com.lits.dao.StudentDao;
import com.lits.entity.Book;
import com.lits.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //    Student student = new Student("Serhii", "Ilnytskyi", "serhiiilnytskyi@gmail.com");
        StudentDao studentDao = new StudentDao();
        BookDao bookDao = new BookDao();
  //      studentDao.saveStudent(student);

        Book book = new Book("SomeBook");
        List<Book> books = new ArrayList<>();
        books.add(book);

        Student student1 = new Student("Happy", "Fucker", "HappyFucker@h.m");
        student1.setBooks(books);
        studentDao.saveStudent(student1);
    }
}
