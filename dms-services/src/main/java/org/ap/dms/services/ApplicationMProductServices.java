package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.ApplicationMProduct;

public interface ApplicationMProductServices {
	
	
void addApplicationMProduct(ApplicationMProduct applicationMDateType) throws Exception;
	
	void deleteApplicationMProduct(long productId) throws Exception;
	
	List<ApplicationMProduct> getAllApplicationMProduct() throws Exception;

}
