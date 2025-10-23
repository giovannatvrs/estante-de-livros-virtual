package com.example.virtual_bookshelf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="ISBN")
    private String ISBN;

    @Column(name="genre")
    private String genre;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private String status;

    @OneToMany(mappedBy = "book")
    List<Review> reviews;




    @ManyToOne
    @JoinColumn(name="publisher_id", nullable = false)
    private Publisher publisher;
    
}
