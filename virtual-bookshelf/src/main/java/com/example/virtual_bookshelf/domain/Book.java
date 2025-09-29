package com.example.virtual_bookshelf.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.IdGeneratorType;

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

    
    
}
