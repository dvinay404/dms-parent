package org.ap.dms.services.impl;

import java.util.List;

import javax.ejb.EJB;

import org.ap.dms.dao.ApplicationMDateTypeDao;
import org.ap.dms.models.entity.ApplicationMDateType;
import org.ap.dms.services.ApplicationMDateTypeServices;

public class ApplicationMDateTypeImpl implements ApplicationMDateTypeServices{
	
	@EJB
	private ApplicationMDateTypeDao applicationMDateTypeDao;

	public void addApplicationMDateType(ApplicationMDateType applicationMDateType ) throws Exception {
		applicationMDateTypeDao.addApplicationMDateType(applicationMDateType);
	}

	public void deleteApplicationMDateType(long dateRefId) throws Exception {
		applicationMDateTypeDao.deleteApplicationMDateType(dateRefId);
	}

	public List<ApplicationMDateType> getAllApplicationMDateType() throws Exception {
			return applicationMDateTypeDao.getAllApplicationMDateType();
		}

}
