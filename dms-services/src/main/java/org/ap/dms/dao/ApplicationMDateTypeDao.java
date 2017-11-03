package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.ApplicationMDateType;

@Stateless
public class ApplicationMDateTypeDao extends Dao{
	
	@EJB
    private Dao dao;
	
	
	public void addApplicationMDateType(ApplicationMDateType applicationMDateType) throws Exception {
		dao.create(applicationMDateType);
    }

    public void deleteApplicationMDateType(long  dateRefId) throws Exception {
        dao.delete(ApplicationMDateType.class, dateRefId);
    }

    public List<ApplicationMDateType> getAllApplicationMDateType() throws Exception {
        return dao.getAll( ApplicationMDateType.class );
    }

}
