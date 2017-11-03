package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.ApplicationMCrType;
import org.ap.dms.models.entity.DmsRequest;

public interface ApplicationMCrTypeServices {

	
	void addApplicationMCrType(ApplicationMCrType applicationMCrType) throws Exception;
	
	void deleteApplicationMCrType(long crTypeId) throws Exception;
	
	List<ApplicationMCrType> getAllApplicationMCrType() throws Exception;
	

}
