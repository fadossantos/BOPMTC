package br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Sexo;


@Repository
public interface SexoRepository extends CrudRepository<Sexo, String> {
	
	
}
