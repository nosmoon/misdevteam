/***************************************************************************************************
 * 파일명 : AdDep2500DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.dep.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.dep.dm.AD_DEP_2500_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2510_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2500_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2510_LDataSet;
/**
 * 
 */
public class AdDep2500DAO {
	
	 public AD_DEP_2500_MDataSet ad_dep_2500_m(AD_DEP_2500_MDM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_DEP_2500_MDataSet ds = (AD_DEP_2500_MDataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds; 
	}
    public AD_DEP_2510_LDataSet ad_dep_2510_l(AD_DEP_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2510_LDataSet ds = (AD_DEP_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }  
    
    
}
