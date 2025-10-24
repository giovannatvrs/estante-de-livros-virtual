package com.example.virtual_bookshelf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
public class ReviewId implements Serializable {
    @Column(name="user_id")
    private long userId;
    @Column(name="book_id")
    private long bookId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica se são a mesma referência
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica null e tipo
        ReviewId other = (ReviewId) obj; // Converte para o tipo correto
        // Compara os campos-chave para determinar a igualdade
        return Objects.equals(this.userId, other.userId) && Objects.equals(this.bookId, other.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, bookId);
    }
}
