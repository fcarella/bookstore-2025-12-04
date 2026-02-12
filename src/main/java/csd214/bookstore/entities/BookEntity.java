package csd214.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class BookEntity extends PublicationEntity {
    @Column(name = "author")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }
}