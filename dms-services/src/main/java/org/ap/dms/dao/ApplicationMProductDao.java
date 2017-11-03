package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.ApplicationMProduct;


@Stateless
public class ApplicationMProductDao extends Dao{

	
	
	@EJB
    private Dao dao;
	
	
	public void addApplicationMProduct(ApplicationMProduct applicationMDateType) throws Exception {
		dao.create(applicationMDateType);
    }

    public void deleteApplicationMProduct(long  dateRefId) throws Exception {
        dao.delete(ApplicationMProduct .class, dateRefId);
    }

    public List<ApplicationMProduct> getAllApplicationMProduct() throws Exception {
        return dao.getAll( ApplicationMProduct.class );
    }

}
