package com.example.virtual_bookshelf.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.IdGeneratorType;

import java.util.Set;
import java.util.concurrent.Flow;

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

    @ManyToOne
    @JoinColumn(name="publisher_id")
    private Publisher publisher;
    
}
