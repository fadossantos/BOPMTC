package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Semaforo;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.SemaforoRepository;

@Service
@Transactional
public class SemaforoService {
    
    @Autowired
    private SemaforoRepository semaforoRepository; 
    
    
    public SemaforoService() {
        super();
    }  
        
    public Iterable<Semaforo> findAll() {
        return this.semaforoRepository.findAll();
    }    
      
    public void addOrUpdate(final Semaforo status) {
        this.semaforoRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.semaforoRepository.delete(id);
    }

	public Semaforo findOne(Long id) {		
		return this.semaforoRepository.findOne(id);
	}
    
}
