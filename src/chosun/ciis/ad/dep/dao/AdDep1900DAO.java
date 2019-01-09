/***************************************************************************************************
 * 파일명 : AdDep1900DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1900_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1910_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1900_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1910_ADataSet;

/**
 * 
 */
public class AdDep1900DAO {
	
    public AD_DEP_1900_MDataSet ad_dep_1900_m(AD_DEP_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1900_MDataSet ds = (AD_DEP_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1910_ADataSet ad_dep_1910_a(AD_DEP_1910_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1910_ADataSet ds = (AD_DEP_1910_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
}
