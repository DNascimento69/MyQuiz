package br.edu.ifes.sr.poo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.edu.ifes.sr.poo2.model.Pergunta;

@Repository
@Transactional
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {

	Pergunta getAll();
	
}
