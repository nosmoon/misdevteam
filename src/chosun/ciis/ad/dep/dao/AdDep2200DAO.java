/***************************************************************************************************
 * 파일명 : AdDep1000DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2210_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2220_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_2200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2210_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2220_ADataSet;

/**
 * 
 */
public class AdDep2200DAO {
	
    public AD_DEP_2200_MDataSet ad_dep_2200_m(AD_DEP_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2200_MDataSet ds = (AD_DEP_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_DEP_2210_LDataSet ad_dep_2210_l(AD_DEP_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2210_LDataSet ds = (AD_DEP_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    
    public AD_DEP_2220_ADataSet ad_dep_2220_a(AD_DEP_2220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2220_ADataSet ds = (AD_DEP_2220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }       
}
