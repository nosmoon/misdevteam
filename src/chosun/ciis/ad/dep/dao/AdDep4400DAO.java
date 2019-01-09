/***************************************************************************************************
 * 파일명 : AdDep4400DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : KBS
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

import chosun.ciis.ad.dep.dm.AD_DEP_4410_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4450_ADM;

import chosun.ciis.ad.dep.ds.AD_DEP_4410_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4450_ADataSet;


public class AdDep4400DAO {
	
    public AD_DEP_4410_LDataSet ad_dep_4410_l(AD_DEP_4410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4410_LDataSet ds = (AD_DEP_4410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    
    public AD_DEP_4450_ADataSet ad_dep_4450_a(AD_DEP_4450_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4450_ADataSet ds = (AD_DEP_4450_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}
