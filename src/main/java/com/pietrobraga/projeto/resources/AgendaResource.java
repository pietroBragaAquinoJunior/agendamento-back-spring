package com.pietrobraga.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pietrobraga.projeto.entities.Agenda;
import com.pietrobraga.projeto.services.AgendaService;

@RestController
@RequestMapping(value="/agendas")
public class AgendaResource {
	
	@Autowired
	private AgendaService service;

	@GetMapping
	public ResponseEntity<List<Agenda>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Agenda> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Agenda> insert(@RequestBody Agenda agenda){
		return ResponseEntity.ok().body(service.insert(agenda));
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Agenda> update(@PathVariable Long id, @RequestBody Agenda agenda){
		return ResponseEntity.ok().body(service.update(id, agenda));
	}
	
}
