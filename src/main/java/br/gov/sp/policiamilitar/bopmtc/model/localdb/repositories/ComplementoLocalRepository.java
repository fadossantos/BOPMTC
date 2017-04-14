package br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.ComplementoLocal;


@Repository
public interface ComplementoLocalRepository extends CrudRepository<ComplementoLocal, Long> {	
	
}
