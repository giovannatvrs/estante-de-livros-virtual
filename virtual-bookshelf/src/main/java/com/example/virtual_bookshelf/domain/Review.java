package com.example.virtual_bookshelf.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Review")
@Entity
public class Review {
    @EmbeddedId
    ReviewId reviewId;

    @ManyToOne
    @MapsId("user_id")
    private User user;

    @ManyToOne
    @MapsId("book_id")
    private Book book;

    @Column(name="rating")
    private int rating;

    @Column(name="column")
    private String comment;

}
