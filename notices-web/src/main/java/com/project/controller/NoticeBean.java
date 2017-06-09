package com.project.controller;

import com.project.ejb.AuthorDao;
import com.project.ejb.CategoryDao;
import com.project.ejb.NoticeDao;
import com.project.model.Author;
import com.project.model.Category;
import com.project.model.Notice;
import org.primefaces.context.RequestContext;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by vertiavo on 19.05.17.
 */

@Named
@ViewScoped
public class NoticeBean implements Serializable {

    @EJB
    private NoticeDao dao;

    @EJB
    private AuthorDao daoAuthor;

    @EJB
    private CategoryDao daoCategory;

    private Author author;

    private Category category;

    private Long selectedC;

    private Long selectedA;

    private Notice newNotice = new Notice();

    public List<Notice> getNotices() {
        return dao.findPublished();
    }

    public List<Notice> getAllNotices() {
        return dao.findAll();
    }

    public List<Author> getAuthors() {
        return daoAuthor.findAll();
    }

    public List<Category> getCategories() {
        return daoCategory.findAll();
    }

    public void onRemoveNotice(Notice notice) {
        dao.remove(notice.getId());
    }

    public void onNoticeAdd() {
        newNotice = new Notice();
    }

    public void onNoticeAdded() {
        List<Category> categories = getCategories();
        for (Category c : categories) {
            if (c.getId() == selectedC) {
                category = c;
            }
        }
        List<Author> authors = getAuthors();
        for (Author a : authors) {
            if (a.getId() == selectedA) {
                author = a;
            }
        }
        newNotice.setAuthor(author);
        newNotice.setCategory(category);
        newNotice.setDate(new Date());
        newNotice.setType("NEW");
        dao.save(newNotice);
        RequestContext.getCurrentInstance().execute("PF('NoticeDlg').hide()");
    }

    public void publish(Notice toPublish) {
        toPublish.setType("PUBLISHED");
        addMessage("Notice published");
        dao.update(toPublish);
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public Notice getNewNotice() {
        return newNotice;
    }

    public void setNewNotice(Notice newNotice) {
        this.newNotice = newNotice;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getSelectedC() {
        return selectedC;
    }

    public void setSelectedC(Long selected) {
        this.selectedC = selected;
    }

    public Long getSelectedA() {
        return selectedA;
    }

    public void setSelectedA(Long selectedA) {
        this.selectedA = selectedA;
    }
}
