package com.example.virtual_bookshelf.entity;

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
    private long userId;
    private long bookId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica se são a mesma referência
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica null e tipo
        ReviewId that = (ReviewId) obj; // Converte para o tipo correto
        // Compara os campos-chave para determinar a igualdade
        return Objects.equals(userId, that.userId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, bookId);
    }
}
