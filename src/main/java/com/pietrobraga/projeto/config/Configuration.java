package com.pietrobraga.projeto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pietrobraga.projeto.entities.Agenda;
import com.pietrobraga.projeto.repositories.AgendaRepository;

@CrossOrigin
@org.springframework.context.annotation.Configuration
public class Configuration implements CommandLineRunner {

	@Autowired
	private AgendaRepository agendaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Agenda a1 = new Agenda(null,"Teste","Descrição teste", Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
		Agenda a2 = new Agenda(null,"Teste","Descrição teste", Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
		Agenda a3 = new Agenda(null,"Teste","Descrição teste", Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
		
		agendaRepository.saveAll(Arrays.asList(a1,a2,a3));
		
	}

}
