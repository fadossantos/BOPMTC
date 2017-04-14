package br.gov.sp.policiamilitar.bopmtc.model.localdb;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@NamedQuery(name="NCD.findAll", query="SELECT s FROM NCD s")
public class NCD implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	private long ncdCod;

	private String natCod;
	
	private String natDes;
	
	private long natCplCod;
	
	private String natCplDes;
	
	private long dtlCplCod;
	
	private String dtlCplDes;
	
	public NCD() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public NCD(long nCDCOD, String natCod, String natDes, long natCplCod, String natCplDes, long dtlCplCod,
			String dtlCplDes) {
		super();
		this.ncdCod = nCDCOD;
		this.natCod = natCod;
		this.natDes = natDes;
		this.natCplCod = natCplCod;
		this.natCplDes = natCplDes;
		this.dtlCplCod = dtlCplCod;
		this.dtlCplDes = dtlCplDes;
	}


	public long getNcdCod() {
		return ncdCod;
	}

	public void setNcdCod(long nCDCOD) {
		this.ncdCod = nCDCOD;
	}

	public String getNatCod() {
		return natCod;
	}

	public void setNatCod(String natCod) {
		this.natCod = natCod;
	}

	public String getNatDes() {
		return natDes;
	}

	public void setNatDes(String natDes) {
		this.natDes = natDes;
	}

	public long getNatCplCod() {
		return natCplCod;
	}

	public void setNatCplCod(long natCplCod) {
		this.natCplCod = natCplCod;
	}

	public String getNatCplDes() {
		return natCplDes;
	}

	public void setNatCplDes(String natCplDes) {
		this.natCplDes = natCplDes;
	}

	public long getDtlCplCod() {
		return dtlCplCod;
	}

	public void setDtlCplCod(long dtlCplCod) {
		this.dtlCplCod = dtlCplCod;
	}

	public String getDtlCplDes() {
		return dtlCplDes;
	}

	public void setDtlCplDes(String dtlCplDes) {
		this.dtlCplDes = dtlCplDes;
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);

	}
}