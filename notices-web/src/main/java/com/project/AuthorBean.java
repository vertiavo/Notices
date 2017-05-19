package com.project;

import com.project.ejb.AuthorDao;
import com.project.model.Author;
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
public class AuthorBean implements Serializable {

    @EJB
    private AuthorDao dao;

    private Author newAuthor = new Author();

    public List<Author> getAuthors() {
        return dao.findAll();
    }

    public void onRemoveAuthor(Author author) {
        dao.remove(author.getId());
    }

    public void onAuthorAdd() {
        newAuthor = new Author();
    }

    public void onAuthorAdded() {
        dao.save(newAuthor);
        RequestContext.getCurrentInstance().execute("PF('AuthorDlg').hide()");
    }

    public Author getNewAuthor() {
        return newAuthor;
    }

    public void setNewAuthor(Author newAuthor) {
        this.newAuthor = newAuthor;
    }

}
