package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.NCD;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.NCDRepository;

@Service
@Transactional
public class NCDService {
    
    @Autowired
    private NCDRepository nCDRepository; 
    
    
    public NCDService() {
        super();
    }  
        
    public Iterable<NCD> findAll() {
        return this.nCDRepository.findAll();
    }
    
    public Iterable<NCD> findByNatCod(String natCod){
    	return this.nCDRepository.findPorNatCod(natCod);
    }
      
    public void addOrUpdate(final NCD ncd) {
        this.nCDRepository.save(ncd);
    }
    
    public void remove(final Long id){
    	this.nCDRepository.delete(id);
    }

	public NCD findOne(Long id) {		
		return this.nCDRepository.findOne(id);
	}

	public Object findAllNatCod() {
		return this.nCDRepository.findAllNatCod();
	}
    
}
