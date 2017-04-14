package br.gov.sp.policiamilitar.bopmtc.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.policiamilitar.bopmtc.model.localdb.EspecieVeiculo;
import br.gov.sp.policiamilitar.bopmtc.model.localdb.repositories.EspecieVeiculoRepository;

@Service
@Transactional
public class EspecieVeiculoService {
    
    @Autowired
    private EspecieVeiculoRepository especieVeiculoRepository; 
    
    
    public EspecieVeiculoService() {
        super();
    }  
        
    public Iterable<EspecieVeiculo> findAll() {
        return this.especieVeiculoRepository.findAll();
    }    
      
    public void addOrUpdate(final EspecieVeiculo status) {
        this.especieVeiculoRepository.save(status);
    }
    
    public void remove(final Long id){
    	this.especieVeiculoRepository.delete(id);
    }

	public EspecieVeiculo findOne(Long id) {		
		return this.especieVeiculoRepository.findOne(id);
	}
    
}
