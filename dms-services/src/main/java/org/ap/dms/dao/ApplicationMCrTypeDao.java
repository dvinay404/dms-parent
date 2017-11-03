package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.ApplicationMCrType;

@Stateless
public class ApplicationMCrTypeDao extends Dao{
	
	
	@EJB
    private Dao dao;
	
	
	public void addApplicationMCrType(ApplicationMCrType applicationMCrType) throws Exception {
		dao.create(applicationMCrType);
    }

    public void deleteApplicationMCrType(long  crTypeId) throws Exception {
        dao.delete(ApplicationMCrType.class, crTypeId);
    }

    public List<ApplicationMCrType> getAllApplicationMCrType() throws Exception {
        return dao.getAll( ApplicationMCrType.class );
    }

}
