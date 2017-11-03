package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.ApplicationMDateType;

public interface ApplicationMDateTypeServices {

	
void addApplicationMDateType(ApplicationMDateType applicationMDateType) throws Exception;
	
	void deleteApplicationMDateType(long dateRefId) throws Exception;
	
	List<ApplicationMDateType> getAllApplicationMDateType() throws Exception;
}
