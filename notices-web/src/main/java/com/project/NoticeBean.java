package com.project;

import com.project.ejb.NoticeDao;
import com.project.model.Notice;
import org.primefaces.context.RequestContext;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by vertiavo on 19.05.17.
 */

@Named
@ViewScoped
public class NoticeBean implements Serializable {

    @EJB
    private NoticeDao dao;

    private Notice newNotice = new Notice();

    public List<Notice> getNotices() {
        return dao.findAll();
    }

    public void onRemoveNotice(Notice notice) {
        dao.remove(notice.getId());
    }

    public void onNoticeAdd() {
        newNotice = new Notice();
    }

    public void onNoticeAdded() {
        dao.save(newNotice);
        RequestContext.getCurrentInstance().execute("PF('NoticeDlg').hide()");
    }

    public Notice getNewNotice() {
        return newNotice;
    }

    public void setNewNotice(Notice newNotice) {
        this.newNotice = newNotice;
    }

}
