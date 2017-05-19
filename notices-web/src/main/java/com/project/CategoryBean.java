package com.project;

import com.project.ejb.CategoryDao;
import com.project.model.Category;
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
public class CategoryBean implements Serializable {

    @EJB
    private CategoryDao dao;

    private Category newCategory = new Category();

    public List<Category> getCategories() {
        return dao.findAll();
    }

    public void onRemoveCategory(Category category) {
        dao.remove(category.getId());
    }

    public void onCategoryAdd() {
        newCategory = new Category();
    }

    public void onCategoryAdded() {
        dao.save(newCategory);
        RequestContext.getCurrentInstance().execute("PF('CategoryDlg').hide()");
    }

    public Category getNewCategory() {
        return newCategory;
    }

    public void setNewCategory(Category newCategory) {
        this.newCategory = newCategory;
    }

}
