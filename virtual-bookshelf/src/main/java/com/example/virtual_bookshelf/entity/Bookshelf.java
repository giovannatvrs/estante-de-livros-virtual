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
@Table(name="Bookshelf")
@Entity
public class Bookshelf {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bookshelf_id")
    private long bookShelfId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "bookshelf_name")
    private String name;

    @Column(name="bookshelf_description")
    private String description;

    @ManyToMany
    private List<Book> books;



}
