/***************************************************************************************************
 * 파일명 : AdDep3400DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3400_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3410_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3420_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3430_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3400_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3410_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3420_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3430_LDataSet;
/**
 * 
 */
public class AdDep3400DAO {
	
    public AD_DEP_3400_MDataSet ad_dep_3400_m(AD_DEP_3400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3400_MDataSet ds = (AD_DEP_3400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   

    public AD_DEP_3410_LDataSet ad_dep_3410_l(AD_DEP_3410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3410_LDataSet ds = (AD_DEP_3410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   


    public AD_DEP_3420_LDataSet ad_dep_3420_l(AD_DEP_3420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3420_LDataSet ds = (AD_DEP_3420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   


    public AD_DEP_3430_LDataSet ad_dep_3430_l(AD_DEP_3430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3430_LDataSet ds = (AD_DEP_3430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
}
