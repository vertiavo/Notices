package com.project.ejb;

import com.project.model.Notice;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class NoticeDao {

    @PersistenceContext(unitName = "com.project.notice-ejb_ejb_1.0PU")
    private EntityManager em;

    public void save(Notice notice) {
        em.persist(notice);
    }

    public Notice update(Notice notice) {
        return em.merge(notice);
    }

    public void remove(Long id) {
        em.remove(em.getReference(Notice.class, id));
    }

    public List<Notice> findAll() {
        TypedQuery<Notice> query = em.createNamedQuery("Notice.findAll", Notice.class);
        return query.getResultList();
    }

}
