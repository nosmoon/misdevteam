/***************************************************************************************************
 * 파일명 : AdDep1300DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1300_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1310_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1320_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1300_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1310_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1320_ADataSet;

/**
 * 
 */
public class AdDep1300DAO {
	
    public AD_DEP_1300_MDataSet ad_dep_1300_m(AD_DEP_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1300_MDataSet ds = (AD_DEP_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1310_LDataSet ad_dep_1310_l(AD_DEP_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1310_LDataSet ds = (AD_DEP_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1320_ADataSet ad_dep_1320_a(AD_DEP_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1320_ADataSet ds = (AD_DEP_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      

}
