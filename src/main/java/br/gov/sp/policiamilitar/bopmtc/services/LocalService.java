package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Local;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.LocalRepository;

@Service
@Transactional
public class LocalService {
    
    @Autowired
    private LocalRepository localRepository; 
    
    
    public LocalService() {
        super();
    }  
        
    public Iterable<Local> findAll() {
        return this.localRepository.findAll();
    }    
      
    public void addOrUpdate(final Local status) {
        this.localRepository.save(status);
    }
    
    public void remove(final String id){
    	this.localRepository.delete(id);
    }

	public Local findOne(String id) {		
		return this.localRepository.findOne(id);
	}
    
}
