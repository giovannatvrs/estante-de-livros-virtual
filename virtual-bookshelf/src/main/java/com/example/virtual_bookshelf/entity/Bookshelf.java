package com.example.virtual_bookshelf.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="bookshelves")
@Entity
public class Bookshelf {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bookshelf_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;


    @ManyToMany(mappedBy = "bookshelves")
    private Set<Book> books;



}
