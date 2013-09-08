package br.edu.ifes.sr.poo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import br.edu.ifes.sr.poo2.model.Pergunta;
import br.edu.ifes.sr.poo2.repository.PerguntaRepository;
import br.edu.ifes.sr.poo2.service.generic.CRUDGenerics;

public class PerguntaService implements CRUDGenerics<Pergunta> {

	@Autowired
	PerguntaRepository repos;

	public void save(Pergunta t) {
		repos.save(t);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public Pergunta find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pergunta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
