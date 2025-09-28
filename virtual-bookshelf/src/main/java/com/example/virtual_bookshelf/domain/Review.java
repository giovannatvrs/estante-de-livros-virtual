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
    @MapsId("id")
    private User user;

    @ManyToOne
    private Book book;

    @Column(name="rating")
    private int rating;

    @Column(name="column")
    private String comment;

}
