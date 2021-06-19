package com.example.truongminhquan.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publishercatalog")
public class PublisherCatalogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "contactperson")
    private String contactPerson;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "publishercatalog")
    private List<BookEntity> books;

    public PublisherCatalogEntity() {
    }

    public PublisherCatalogEntity(String name, String address, String contactPerson, String phone) {
        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
