package com.project.ejb;

import com.project.model.Category;
import org.junit.Test;

import javax.ejb.EJB;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by vertiavo on 09.06.17.
 */
public class CategoryDaoTest {

    @EJB
    private CategoryDao categoryDao;

    @Test
    public void addingTest() {
        Category category = new Category();
        category.setTitle("Testowa");
        categoryDao.save(category);

        assertThat(categoryDao.findAll().contains(category), equalTo(true));
    }

    @Test
    public void removingTest() {
        Category category = new Category();
        category.setTitle("Testowa");
        categoryDao.save(category);

        categoryDao.remove(category.getId());
        assertThat(categoryDao.findAll().contains(category), equalTo(false));
    }

}