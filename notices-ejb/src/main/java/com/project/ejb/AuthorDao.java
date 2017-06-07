package com.project.ejb;

import com.project.model.Author;

import javax.ejb.Stateless;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class AuthorDao extends AbstractDao<Author, Long> {

    public AuthorDao() {
        super(Author.class);
    }

}
