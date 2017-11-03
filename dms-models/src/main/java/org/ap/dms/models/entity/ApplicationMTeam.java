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
@Table(name = "APPLICATION_M_TEAM")
@XmlRootElement
public class ApplicationMTeam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "teamIdSequence", sequenceName = "cteamId_seq", allocationSize = 1, initialValue = 100000)
	@Column(name = "TEAM_ID")
	private String teamId ;
	
	@Column(name = "PRODUCT_ID")
	private String teamNmae ;
	
	@Column(name = "TEAM_DES")
	private String teamDes ;
	
	@Column(name = "SPM_ID")
	private String spmID ;
	
	@Column(name = "SPM_NAME")
	private String spmName ;
	
	@Column(name = "PA_ID")
	private String paId ;
	
	@Column(name = "PA_NAME")
	private String paName;
	
	
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamNmae() {
		return teamNmae;
	}
	public void setTeamNmae(String teamNmae) {
		this.teamNmae = teamNmae;
	}
	public String getTeamDes() {
		return teamDes;
	}
	public void setTeamDes(String teamDes) {
		this.teamDes = teamDes;
	}
	public String getSpmID() {
		return spmID;
	}
	public void setSpmID(String spmID) {
		this.spmID = spmID;
	}
	public String getSpmName() {
		return spmName;
	}
	public void setSpmName(String spmName) {
		this.spmName = spmName;
	}
	public String getPaId() {
		return paId;
	}
	public void setPaId(String paId) {
		this.paId = paId;
	}
	public String getPaName() {
		return paName;
	}
	public void setPaName(String paName) {
		this.paName = paName;
	}
	
	
	@Override
	public String toString() {
		return "ApplicationMTeam [teamId=" + teamId + ", teamNmae=" + teamNmae + ", teamDes=" + teamDes + ", spmID="
				+ spmID + ", spmName=" + spmName + ", paId=" + paId + ", paName=" + paName + "]";
	}
	
	
	
	
	

}
