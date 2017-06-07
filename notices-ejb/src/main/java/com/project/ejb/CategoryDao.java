package com.project.ejb;

import com.project.model.Category;

import javax.ejb.Stateless;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class CategoryDao extends AbstractDao<Category, Long> {

    public CategoryDao() {
        super(Category.class);
    }

}
