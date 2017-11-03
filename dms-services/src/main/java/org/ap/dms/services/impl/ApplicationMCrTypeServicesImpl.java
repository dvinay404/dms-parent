package org.ap.dms.services.impl;

import java.util.List;

import javax.ejb.EJB;

import org.ap.dms.dao.ApplicationMCrTypeDao;
import org.ap.dms.models.entity.ApplicationMCrType;
import org.ap.dms.services.ApplicationMCrTypeServices;

public class ApplicationMCrTypeServicesImpl implements ApplicationMCrTypeServices{
	
	
	@EJB
	private ApplicationMCrTypeDao applicationMCrTypeDao;

	public void addApplicationMCrType(ApplicationMCrType applicationMCrType) throws Exception {
		applicationMCrTypeDao.addApplicationMCrType(applicationMCrType);
	}

	public void deleteApplicationMCrType(long crTypeId) throws Exception {
		applicationMCrTypeDao.deleteApplicationMCrType(crTypeId);
	}

	@Override
	public List<ApplicationMCrType> getAllApplicationMCrType() throws Exception {
			return applicationMCrTypeDao.getAllApplicationMCrType();
		}

}
