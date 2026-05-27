package com.rizencoding.development.barbearia.entity;

import com.rizencoding.development.barbearia.entity.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clienteNome;
    @ManyToOne
    private User barbeiro;
    private String clienteTelefone;
    private LocalTime dataHoraInicio;
    private LocalTime dataHoraFim;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}
