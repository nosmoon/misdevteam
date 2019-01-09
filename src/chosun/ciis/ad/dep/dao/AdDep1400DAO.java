/***************************************************************************************************
 * 파일명 : AdDep1400DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1400_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1410_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1420_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1400_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1410_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1420_ADataSet;

/**
 * 
 */
public class AdDep1400DAO {
	
	public AD_DEP_1400_MDataSet ad_dep_1400_m(AD_DEP_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1400_MDataSet ds = (AD_DEP_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    } 
    public AD_DEP_1410_ADataSet ad_dep_1410_a(AD_DEP_1410_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1410_ADataSet ds = (AD_DEP_1410_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1420_ADataSet ad_dep_1420_a(AD_DEP_1420_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1420_ADataSet ds = (AD_DEP_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      

}
