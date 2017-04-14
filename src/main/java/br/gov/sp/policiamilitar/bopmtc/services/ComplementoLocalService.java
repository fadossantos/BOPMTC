package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.ComplementoLocal;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.ComplementoLocalRepository;


@Service
@Transactional
public class ComplementoLocalService {
    
    @Autowired
    private ComplementoLocalRepository complementoLocalRepository; 
    
    
    public ComplementoLocalService() {
        super();
    }  
        
    public Iterable<ComplementoLocal> findAll() {
        return this.complementoLocalRepository.findAll();
    }    
      
    public void addOrUpdate(final ComplementoLocal status) {
        this.complementoLocalRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.complementoLocalRepository.delete(id);
    }

	public ComplementoLocal findOne(Long id) {		
		return this.complementoLocalRepository.findOne(id);
	}
    
}
