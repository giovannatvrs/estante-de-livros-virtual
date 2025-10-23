package com.example.virtual_bookshelf.entity;

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
@Table(name="Publisher")
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="publisher_id")
    private long id;

    @Column(name="publisher_name")
    private String name;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}
