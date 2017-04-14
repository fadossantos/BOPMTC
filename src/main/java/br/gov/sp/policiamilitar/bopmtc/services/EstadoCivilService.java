package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.EstadoCivil;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.EstadoCivilRepository;

@Service
@Transactional
public class EstadoCivilService {
    
    @Autowired
    private EstadoCivilRepository estadoCivilRepository; 
    
    
    public EstadoCivilService() {
        super();
    }  
        
    public Iterable<EstadoCivil> findAll() {
        return this.estadoCivilRepository.findAll();
    }    
      
    public void addOrUpdate(final EstadoCivil status) {
        this.estadoCivilRepository.save(status);
    }
    
    public void remove(final String id){
    	this.estadoCivilRepository.delete(id);
    }

	public EstadoCivil findOne(String id) {		
		return this.estadoCivilRepository.findOne(id);
	}
    
}
