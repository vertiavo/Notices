package com.project.ejb;

import com.project.model.Notice;

import javax.ejb.Stateless;

/**
 * Created by vertiavo on 18.05.17.
 */

@Stateless
public class NoticeDao extends AbstractDao<Notice, Long> {

    public NoticeDao() {
        super(Notice.class);
    }

}
