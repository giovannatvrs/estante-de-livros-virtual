package com.example.virtual_bookshelf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="reviews")
@Entity
public class Review {
    @EmbeddedId
    private ReviewKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name="book_id")
    private Book book;

    private double note;
    private String comment;
    private Instant createdAt;

}
