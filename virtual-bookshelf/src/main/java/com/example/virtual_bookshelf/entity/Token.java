package com.example.virtual_bookshelf.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private Instant createdAt;
    private Instant expiresAt;
    private Instant validatedAt;

    @ManyToOne
    @JoinColumn(name="fk_user_id", nullable = false)
    private User user;

}
