package com.project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by vertiavo on 18.05.17.
 */

@Entity
@NamedQuery(name = "Notice.findAll", query = "SELECT n FROM Notice n")
public class Notice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne()
    private Author author;

    @ManyToOne()
    private Category category;

    private String content;

    private Date date;

    private Type type;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "title='" + title + '\'' +
                ", category=" + category +
                ", author=" + author +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
