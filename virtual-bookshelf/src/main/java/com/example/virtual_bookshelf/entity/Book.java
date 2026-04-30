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
@Table(name="books")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private Long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="isbn")
    private String isbn;

    @Column(name="genre")
    private String genre;

    @OneToMany(mappedBy = "book")
    Set<Review> reviews;

    @ManyToMany
    private Set<Bookshelf> bookshelves;


}