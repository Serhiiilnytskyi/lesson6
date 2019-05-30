package com.lits.dao;

import com.lits.entity.Book;
import com.lits.entity.Student;
import com.lits.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDao {
    public void saveBook(Book book) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(book);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
