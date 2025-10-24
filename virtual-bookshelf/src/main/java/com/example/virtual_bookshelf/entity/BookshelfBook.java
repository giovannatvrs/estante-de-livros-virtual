package com.example.virtual_bookshelf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="Bookshelf_Book")
@Entity
public class BookshelfBook {
    @EmbeddedId
    BookshelfBookId id;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name="book_id")
    Book book;

    @ManyToOne
    @MapsId("bookshelfId")
    @JoinColumn(name="bookshelf_id")
    Bookshelf bookshelf;

    @Column(name="added_at")
    private Instant addedAt;

}
