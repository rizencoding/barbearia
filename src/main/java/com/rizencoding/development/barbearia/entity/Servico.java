package com.rizencoding.development.barbearia.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "servicos")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String descricao;
    private Integer preco;
    @Column(nullable = false)
    private Integer duracaoMinutos;
}
