package com.project.ejb;

import com.project.model.Author;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class AuthorDao {

    @PersistenceContext(unitName = "com.project.notice-ejb_ejb_1.0PU")
    private EntityManager em;

    public void save(Author author) {
        em.persist(author);
    }

    public Author update(Author author) {
        return em.merge(author);
    }

    public void remove(Long id) {
        em.remove(em.getReference(Author.class, id));
    }

    public List<Author> findAll() {
        TypedQuery<Author> query = em.createNamedQuery("Author.findAll", Author.class);
        return query.getResultList();
    }

}
