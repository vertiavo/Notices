package com.project.ejb;

import com.project.model.Category;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class CategoryDao {

    @PersistenceContext(unitName = "com.project.notice-ejb_ejb_1.0PU")
    private EntityManager em;

    public void save(Category category) {
        em.persist(category);
    }

    public Category update(Category category) {
        return em.merge(category);
    }

    public void remove(Long id) {
        em.remove(em.getReference(Category.class, id));
    }

    public List<Category> findAll() {
        TypedQuery<Category> query = em.createNamedQuery("Category.findAll", Category.class);
        return query.getResultList();
    }

}
