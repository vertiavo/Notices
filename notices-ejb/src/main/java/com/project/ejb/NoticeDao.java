package com.project.ejb;

import com.project.model.Notice;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class NoticeDao extends AbstractDao<Notice, Long> {

    public NoticeDao() {
        super(Notice.class);
    }

    public List<Notice> findPublished() {
        TypedQuery<Notice> query = em.createNamedQuery("Notice.findPublished", Notice.class);
        return query.getResultList();
    }

}
