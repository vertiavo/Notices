package com.project.ejb;

import com.project.model.Author;
import org.junit.Test;

import javax.ejb.EJB;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by vertiavo on 09.06.17.
 */
public class AuthorDaoTest {

    @EJB
    private AuthorDao authorDao;

    @Test
    public void addingTest() {
        Author author = new Author();
        author.setFirstName("Jan");
        author.setLastName("Kowalski");
        author.setEmail("jkowal@kowal.com");
        authorDao.save(author);

        assertThat(authorDao.findAll().contains(author), equalTo(true));
    }

    @Test
    public void removingTest() {
        Author author = new Author();
        author.setFirstName("Jan");
        author.setLastName("Kowalski");
        author.setEmail("jkowal@kowal.com");
        authorDao.save(author);

        authorDao.remove(author.getId());
        assertThat(authorDao.findAll().contains(author), equalTo(false));
    }

}