package org.ap.dms.services.impl;

import java.util.List;

import javax.ejb.EJB;

import org.ap.dms.dao.ApplicationMProductDao;
import org.ap.dms.models.entity.ApplicationMProduct;
import org.ap.dms.services.ApplicationMProductServices;

public class ApplicationMProductServicesImpl implements ApplicationMProductServices {

	@EJB
	private ApplicationMProductDao applicationMProductDao;

	public void addApplicationMProduct(ApplicationMProduct applicationMProduct) throws Exception {
		applicationMProductDao.addApplicationMProduct(applicationMProduct);
	}

	public void deleteApplicationMProduct(long dateRefId) throws Exception {
		applicationMProductDao.deleteApplicationMProduct(dateRefId);
	}

	public List<ApplicationMProduct> getAllApplicationMProduct() throws Exception {
		return applicationMProductDao.getAllApplicationMProduct();
	}

}
