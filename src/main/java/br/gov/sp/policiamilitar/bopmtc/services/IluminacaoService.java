package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.Iluminacao;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.IluminacaoRepository;

@Service
@Transactional
public class IluminacaoService {
    
    @Autowired
    private IluminacaoRepository iluminacaoRepository; 
    
    
    public IluminacaoService() {
        super();
    }  
        
    public Iterable<Iluminacao> findAll() {
        return this.iluminacaoRepository.findAll();
    }    
      
    public void addOrUpdate(final Iluminacao status) {
        this.iluminacaoRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.iluminacaoRepository.delete(id);
    }

	public Iluminacao findOne(Long id) {		
		return this.iluminacaoRepository.findOne(id);
	}
    
}
