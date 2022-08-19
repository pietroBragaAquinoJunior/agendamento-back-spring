package com.pietrobraga.projeto.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pietrobraga.projeto.entities.Agenda;
import com.pietrobraga.projeto.repositories.AgendaRepository;

@Service
public class AgendaService {

	@Autowired
	private AgendaRepository repo;
	
	public List<Agenda> findAll(){
		return repo.findAll();
	}
	
	public Agenda findById(Long id) {
		return repo.findById(id).get();
	}
	
	public Agenda insert(Agenda agenda) {
		return repo.save(agenda);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	@Transactional
	public Agenda update(Long id, Agenda novo) {
		Agenda antigo = repo.getReferenceById(id);
		antigo.setTitulo(novo.getTitulo());
		antigo.setDescricao(novo.getDescricao());
		antigo.setDataFim(novo.getDataFim());
		return repo.save(antigo);
	}
	
}
