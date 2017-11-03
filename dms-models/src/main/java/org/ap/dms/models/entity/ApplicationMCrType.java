package org.ap.dms.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "APPLICATION_M_CRTYPE")
@XmlRootElement
//@NamedQueries({ @NamedQuery(name = "DmsRequest.getAll", query = "from DmsRequest e ") })
public class ApplicationMCrType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "crTypeIdSequence", sequenceName = "crTypeId_seq", allocationSize = 1, initialValue = 100000)
	@Column(name = "CRTYPE_ID")
	private int crTypeId;
	
	public int getCrTypeId() {
		return crTypeId;
	}
	public void setCrTypeId(int crTypeId) {
		this.crTypeId = crTypeId;
	}
	
	@Column(name = "CRTYPE_NAME")
	private String CRTYPENAME;
	
	
	public String getCRTYPENAME() {
		return CRTYPENAME;
	}
	public void setCRTYPENAME(String cRTYPENAME) {
		CRTYPENAME = cRTYPENAME;
	}
	
	@Column(name = "CRTYPE_DES")
	private String CRTYPEDES ;
	
	
	
	public String getCRTYPEDES() {
		return CRTYPEDES;
	}
	public void setCRTYPEDES(String cRTYPEDES) {
		CRTYPEDES = cRTYPEDES;
	}
	
	
	@Override
	public String toString() {
		return "ApplicationMCrType [crTypeId=" + crTypeId + ", CRTYPENAME=" + CRTYPENAME + ", CRTYPEDES=" + CRTYPEDES
				+ "]";
	}


}
