package org.ap.dms.services.impl;

import java.util.List;

import org.ap.dms.dao.ApplicationMTeamDao;
import org.ap.dms.models.entity.ApplicationMTeam;
import org.ap.dms.services.ApplicationMTeamServices;

public class ApplicationMTeamServicesImpl implements ApplicationMTeamServices {
	
	
	
	private ApplicationMTeamDao applicationMTeamDao;

	public void addApplicationMTeam(ApplicationMTeam applicationMTeam) throws Exception {
		applicationMTeamDao.addApplicationMTeam(applicationMTeam);
	}

	public void deleteApplicationMTeam(long teamId) throws Exception {
		applicationMTeamDao.deleteApplicationMTeam(teamId);
	}

	public List<ApplicationMTeam> getAllApplicationMTeam() throws Exception {
		return applicationMTeamDao.getAllApplicationMTeam();
	}

}
