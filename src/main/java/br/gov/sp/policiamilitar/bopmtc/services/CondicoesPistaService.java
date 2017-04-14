package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.CondicoesPista;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.CondicoesPistaRepository;

@Service
@Transactional
public class CondicoesPistaService {
    
    @Autowired
    private CondicoesPistaRepository condicoesPistaRepository; 
    
    
    public CondicoesPistaService() {
        super();
    }  
        
    public Iterable<CondicoesPista> findAll() {
        return this.condicoesPistaRepository.findAll();
    }    
      
    public void addOrUpdate(final CondicoesPista status) {
        this.condicoesPistaRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.condicoesPistaRepository.delete(id);
    }

	public CondicoesPista findOne(Long id) {		
		return this.condicoesPistaRepository.findOne(id);
	}
    
}
