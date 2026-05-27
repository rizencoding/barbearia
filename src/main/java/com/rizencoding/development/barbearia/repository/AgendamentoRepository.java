package com.rizencoding.development.barbearia.repository;

import com.rizencoding.development.barbearia.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN true")
    boolean isBarbeiroOcupado(Long barbeiroId, LocalTime horaInicio,LocalTime horaFim);
}
