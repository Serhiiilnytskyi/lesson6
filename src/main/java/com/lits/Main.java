package com.lits;

import com.lits.dao.BookDao;
import com.lits.dao.StudentDao;
import com.lits.entity.Book;
import com.lits.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.lits");
        applicationContext.refresh();
    //    Student student = new Student("Serhii", "Ilnytskyi", "serhiiilnytskyi@gmail.com");
        StudentDao studentDao = new StudentDao();
        BookDao bookDao = new BookDao();
  //      studentDao.saveStudent(student);



        Book book = new Book("SomeBook");
        Book book1 = new Book("SomeBook");
        Book book2 = new Book("SomeBook");
        Book book3 = new Book("SomeBook");

        Student student1 = new Student("Happy", "Fucker", "HappyFucker@h.m");
        student1.setBooks(Arrays.asList(book, book1, book2, book3));
        studentDao.saveStudent(student1);

        studentDao.getStudents();
    }
}
