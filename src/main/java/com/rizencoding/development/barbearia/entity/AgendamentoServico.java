package com.rizencoding.development.barbearia.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "agendamento_servico",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"agendamento_id", "servico_id"}
        ))
public class AgendamentoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "agendamento_id")
    private Agendamento agendamento;
    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;
    private Integer precoCobrado;
}
