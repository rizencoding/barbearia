package com.rizencoding.development.barbearia.repository;

import com.rizencoding.development.barbearia.entity.Agendamento;
import com.rizencoding.development.barbearia.entity.AgendamentoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoServicoRepository extends JpaRepository<AgendamentoServico, Long> {
}
