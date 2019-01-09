/***************************************************************************************************
 * 파일명 : AdDep2600DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2600_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2610_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2620_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2600_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2610_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2620_LDataSet;
/**
 * 
 */
public class AdDep2600DAO {
	
    public AD_DEP_2600_MDataSet ad_dep_2600_m(AD_DEP_2600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2600_MDataSet ds = (AD_DEP_2600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_2610_LDataSet ad_dep_2610_l(AD_DEP_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2610_LDataSet ds = (AD_DEP_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_2620_LDataSet ad_dep_2620_l(AD_DEP_2620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2620_LDataSet ds = (AD_DEP_2620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
