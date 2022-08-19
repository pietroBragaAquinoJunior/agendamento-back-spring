package com.pietrobraga.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pietrobraga.projeto.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
