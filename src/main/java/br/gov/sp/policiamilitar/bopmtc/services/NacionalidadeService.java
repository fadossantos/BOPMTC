package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Nacionalidade;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.NacionalidadeRepository;

@Service
@Transactional
public class NacionalidadeService {
    
    @Autowired
    private NacionalidadeRepository nacionalidadeRepository; 
    
    
    public NacionalidadeService() {
        super();
    }  
        
    public Iterable<Nacionalidade> findAll() {
        return this.nacionalidadeRepository.findAll();
    }    
      
    public void addOrUpdate(final Nacionalidade status) {
        this.nacionalidadeRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.nacionalidadeRepository.delete(id);
    }

	public Nacionalidade findOne(Long id) {		
		return this.nacionalidadeRepository.findOne(id);
	}
    
}
