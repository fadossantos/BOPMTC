package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Sexo;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.SexoRepository;

@Service
@Transactional
public class SexoService {
    
    @Autowired
    private SexoRepository sexoRepository; 
    
    
    public SexoService() {
        super();
    }  
        
    public Iterable<Sexo> findAll() {
        return this.sexoRepository.findAll();
    }    
      
    public void addOrUpdate(final Sexo status) {
        this.sexoRepository.save(status);
    }
    
    public void remove(final String id){
    	this.sexoRepository.delete(id);
    }

	public Sexo findOne(String id) {		
		return this.sexoRepository.findOne(id);
	}
    
}
