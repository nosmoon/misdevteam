/***************************************************************************************************
 * 파일명 : AdDep3200DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3210_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3210_LDataSet;
/**
 * 
 */
public class AdDep3200DAO {
	
    public AD_DEP_3200_MDataSet ad_dep_3200_m(AD_DEP_3200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3200_MDataSet ds = (AD_DEP_3200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_3210_LDataSet ad_dep_3210_l(AD_DEP_3210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3210_LDataSet ds = (AD_DEP_3210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
