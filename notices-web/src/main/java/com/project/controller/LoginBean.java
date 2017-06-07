package com.project.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;

import com.project.util.JSF;

/**
 * Created by vertiavo on 07.06.17.
 */

@Named
@RequestScoped
public class LoginBean implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() throws IOException, ServletException {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
        try {
            //logowanie
            request.login(username, password);
            //logowanie udane - przekierowanie na strone index.xhtml
            externalContext.redirect(externalContext.getRequestContextPath()+"/index.xhtml");
        } catch (ServletException e) {
            // dodajemy informacje o bledzie (renderowane na stronie)
            e.printStackTrace(System.out);
            JSF.addErrorMessage("Invalid credentials");
        }
    }
    // akcja wylogowania
    public void logout() throws IOException {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.invalidateSession();
        externalContext.redirect(externalContext.getRequestContextPath() + "/index.xhtml");
        System.out.println("logout called");
    }

}
