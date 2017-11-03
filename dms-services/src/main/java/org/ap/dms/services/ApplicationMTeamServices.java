package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.ApplicationMTeam;

public interface ApplicationMTeamServices {
	
	
	
void addApplicationMTeam(ApplicationMTeam applicationMTeam) throws Exception;
	
	void deleteApplicationMTeam(long teamId) throws Exception;
	
	List<ApplicationMTeam> getAllApplicationMTeam() throws Exception;


}
