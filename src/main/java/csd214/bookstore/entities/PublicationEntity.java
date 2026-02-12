package csd214.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PublicationEntity extends ProductEntity {
    @Column(name = "title")
    private String title;

    @Column(name = "copies", nullable = false)
    private int copies;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "PublicationEntity{" +
                "title='" + title + '\'' +
                ", copies=" + copies +
                "} " + super.toString();
    }
}