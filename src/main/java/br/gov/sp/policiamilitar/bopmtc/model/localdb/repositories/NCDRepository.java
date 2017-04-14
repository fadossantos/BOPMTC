package br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.NCD;


@Repository
public interface NCDRepository extends CrudRepository<NCD, Long> {
	
	@Query("select n from NCD n where n.natCod = ? order by n.natCod,n.natCplDes,n.dtlCplDes")
	Iterable<NCD> findPorNatCod(String natCod);

	@Query("select distinct n.natCod from NCD n order by n.natCod")
	Iterable<String> findAllNatCod();	
}
