package com.example.virtual_bookshelf.entity;

import com.example.virtual_bookshelf.enums.StatusLivro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private long id;

    @Column(name="book_title")
    private String title;

    @Column(name="ISBN")
    private String ISBN;

    @Column(name="genre")
    private String genre;

    @Enumerated(EnumType.STRING)
    @Column(name="book_status")
    private StatusLivro status;

    @OneToMany(mappedBy = "book")
    Set<Review> reviews;

    @ManyToMany
    private Set<Bookshelf> bookshelves;

    @ManyToOne
    @JoinColumn(name="publisher_id", nullable = false)
    private BookPublisher publisher;

    @ManyToMany
    @JoinTable(
            name="Book_Author",
            joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name="author_id")
    )
    private Set<Author> authors;
    
}
