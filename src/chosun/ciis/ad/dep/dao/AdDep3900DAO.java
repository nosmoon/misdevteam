/***************************************************************************************************
 * 파일명 : AdDep3900DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3900_MDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3900_MDataSet;
/**
 * 
 */
public class AdDep3900DAO {
	
    public AD_DEP_3900_MDataSet ad_dep_3900_m(AD_DEP_3900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3900_MDataSet ds = (AD_DEP_3900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    
    
}
