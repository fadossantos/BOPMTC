package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.CondicoesTempo;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.CondicoesTempoRepository;

@Service
@Transactional
public class CondicoesTempoService {
    
    @Autowired
    private CondicoesTempoRepository condicoesTempoRepository; 
    
    
    public CondicoesTempoService() {
        super();
    }  
        
    public Iterable<CondicoesTempo> findAll() {
        return this.condicoesTempoRepository.findAll();
    }    
      
    public void addOrUpdate(final CondicoesTempo status) {
        this.condicoesTempoRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.condicoesTempoRepository.delete(id);
    }

	public CondicoesTempo findOne(Long id) {		
		return this.condicoesTempoRepository.findOne(id);
	}
    
}
