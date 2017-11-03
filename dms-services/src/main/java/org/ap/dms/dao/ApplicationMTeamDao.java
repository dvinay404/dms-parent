package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.ApplicationMTeam;

@Stateless
public class ApplicationMTeamDao extends Dao {
	
	@EJB
    private Dao dao;
	
	public void addApplicationMTeam(ApplicationMTeam applicationMTeam ) throws Exception {
		dao.create(applicationMTeam);
    }

    public void deleteApplicationMTeam(long  teamId) throws Exception {
        dao.delete(ApplicationMTeam .class, teamId);
    }

    public List<ApplicationMTeam> getAllApplicationMTeam() throws Exception {
        return dao.getAll( ApplicationMTeam.class );
    }

}
