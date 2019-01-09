/***************************************************************************************************
 * 파일명 : AdDep3100DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3100_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3110_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3100_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3110_LDataSet;
/**
 * 
 */
public class AdDep3100DAO {
	
    public AD_DEP_3100_MDataSet ad_dep_3100_m(AD_DEP_3100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3100_MDataSet ds = (AD_DEP_3100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_3110_LDataSet ad_dep_3110_l(AD_DEP_3110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3110_LDataSet ds = (AD_DEP_3110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
