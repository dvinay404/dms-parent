package org.ap.dms.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "APPLICATION_M_DATETYPE")
@XmlRootElement
public class ApplicationMDateType implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "dateRefIdSequence", sequenceName = "dateRefId_seq", allocationSize = 1, initialValue = 100000)
	@Column(name = "DATEREF_ID")
	private String dateRefId;
	
	@Column(name = "DATEREF_NAME")
	private String dateRefName;
	
	@Column(name = "DATEREF_DES")
	private String dateRefDes;

	public String getDateRefId() {
		return dateRefId;
	}

	public void setDateRefId(String dateRefId) {
		this.dateRefId = dateRefId;
	}

	public String getDateRefName() {
		return dateRefName;
	}

	public void setDateRefName(String dateRefName) {
		this.dateRefName = dateRefName;
	}

	public String getDateRefDes() {
		return dateRefDes;
	}

	public void setDateRefDes(String dateRefDes) {
		this.dateRefDes = dateRefDes;
	}

	@Override
	public String toString() {
		return "ApplicationMDateType [dateRefId=" + dateRefId + ", dateRefName=" + dateRefName + ", dateRefDes="
				+ dateRefDes + "]";
	}

	
}
