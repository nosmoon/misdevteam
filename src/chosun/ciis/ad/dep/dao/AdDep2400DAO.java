/***************************************************************************************************
 * 파일명 : AdDep2400DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2400_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2410_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2420_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2430_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2440_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2400_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2410_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2420_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2430_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2440_LDataSet;
/**
 * 
 */
public class AdDep2400DAO {
	
    public AD_DEP_2400_MDataSet ad_dep_2400_m(AD_DEP_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2400_MDataSet ds = (AD_DEP_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    
    public AD_DEP_2410_LDataSet ad_dep_2410_l(AD_DEP_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2410_LDataSet ds = (AD_DEP_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_2420_LDataSet ad_dep_2420_l(AD_DEP_2420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2420_LDataSet ds = (AD_DEP_2420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_2430_LDataSet ad_dep_2430_l(AD_DEP_2430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2430_LDataSet ds = (AD_DEP_2430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }

    public AD_DEP_2440_LDataSet ad_dep_2440_l(AD_DEP_2440_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2440_LDataSet ds = (AD_DEP_2440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
