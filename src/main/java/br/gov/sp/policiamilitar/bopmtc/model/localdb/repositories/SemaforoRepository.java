package br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Semaforo;


@Repository
public interface SemaforoRepository extends CrudRepository<Semaforo, Long> {
	
	
}
