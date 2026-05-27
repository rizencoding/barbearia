package com.rizencoding.development.barbearia.entity;

import com.rizencoding.development.barbearia.entity.enums.UserEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    private UserEnum perfil;
}
