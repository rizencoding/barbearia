package com.rizencoding.development.barbearia.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Data
@Table(name= "horarios")
public class HorarioTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="barbeiro_id")
    private User barbeiro;
    @Enumerated(EnumType.STRING)
    private DayOfWeek diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
}
