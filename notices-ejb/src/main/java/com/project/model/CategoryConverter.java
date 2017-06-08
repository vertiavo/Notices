package com.project.model;

import com.project.ejb.CategoryDao;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.List;

/**
 * Created by vertiavo on 09.06.17.
 */

@FacesConverter(forClass = Category.class, value = "category")
public class CategoryConverter implements Converter {

    @EJB
    private CategoryDao categoryDao;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s.trim().equals(""))
            return null;
        else {
            try {
                long number = Long.parseLong(s);
                List<Category> categories = categoryDao.findAll();
                System.out.println(categories.size());
                for (Category c : categories) {
                    if (c.getId() == number) {
                        System.out.println(c.getId());
                        return categoryDao.findById(number);
                    }
                }
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(
                        FacesMessage.SEVERITY_ERROR,
                        "Conversion error",
                        "Not a vaild category"));
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null || o.equals(""))
            return "";
        else
            return String.valueOf(((Category) o).getId());
    }
}
