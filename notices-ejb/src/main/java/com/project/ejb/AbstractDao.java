package com.project.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by vertiavo on 07.06.17.
 */
public abstract class AbstractDao<T, ID> {

    @PersistenceContext(unitName = "com.project.notice-ejb_ejb_1.0PU")
    protected EntityManager em;
    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void save(T t) {
        em.persist(t);
    }

    public T update(T t) {
        return em.merge(t);
    }

    public void remove(ID id) {
        em.remove(em.getReference(entityClass, id));
    }

    public T findById(ID id) {
        return em.find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq =em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }

}
