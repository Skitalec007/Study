package com.library.library_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "author", nullable = false, length = 100)
    private String author;

    @Column(name = "publication_year")
    private Integer publicationYear;

    @Column(name = "is_borrowed")
    private Boolean isBorrowed = false;

    // Конструкторы
    public Book() {}

    public Book(String title, String author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Integer getPublicationYear() { return publicationYear; }
    public void setPublicationYear(Integer publicationYear) { this.publicationYear = publicationYear; }

    public Boolean getIsBorrowed() { return isBorrowed; }
    public void setIsBorrowed(Boolean isBorrowed) { this.isBorrowed = isBorrowed; }

    @Override
    public String toString() {
        return String.format("Book{id=%d, title='%s', author='%s', year=%d, borrowed=%s}",
                id, title, author, publicationYear, isBorrowed);
    }
}