package com.example.virtual_bookshelf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class BookshelfBookId implements Serializable {
    @Column(name="book_id")
    private long bookId;

    @Column(name="bookshelf_id")
    private long bookshelfId;


    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        BookshelfBookId other = (BookshelfBookId) obj;
        return Objects.equals(bookId, other.bookId) && Objects.equals(bookshelfId, other.bookshelfId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(bookId, bookshelfId);
    }
}
