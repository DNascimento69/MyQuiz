package br.edu.ifes.sr.poo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.ifes.sr.poo2.model.Resposta;
import br.edu.ifes.sr.poo2.repository.RespostaRepository;
import br.edu.ifes.sr.poo2.service.generic.CRUDGenerics;

@Service
public class RespostaService implements CRUDGenerics<Resposta> {

	@Autowired
	RespostaRepository repos;

	public void save(Resposta t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public Resposta find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Resposta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
