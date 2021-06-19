package com.example.truongminhquan.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "publisherid")
    private int publisherid;

    @ManyToOne() //EAGER
    @JoinColumn(name = "publisherid", insertable = false, updatable = false)
    private PublisherCatalogEntity publishercatalog;

    public BookEntity() {
    }

    public BookEntity(String name, String author, String genre, int publisherid, PublisherCatalogEntity publishercatalog) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.publisherid = publisherid;
        this.publishercatalog = publishercatalog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public PublisherCatalogEntity getPublishercatalog() {
        return publishercatalog;
    }

    public void setPublishercatalog(PublisherCatalogEntity publishercatalog) {
        this.publishercatalog = publishercatalog;
    }
}
