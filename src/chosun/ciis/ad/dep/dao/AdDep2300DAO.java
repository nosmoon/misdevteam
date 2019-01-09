/***************************************************************************************************
 * 파일명 : AdDep2300DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2300_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2310_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2320_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2330_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2340_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2300_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2310_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2320_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2330_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2340_LDataSet;
/**
 * 
 */
public class AdDep2300DAO {
	
    public AD_DEP_2300_MDataSet ad_dep_2300_m(AD_DEP_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2300_MDataSet ds = (AD_DEP_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    
    public AD_DEP_2310_LDataSet ad_dep_2310_l(AD_DEP_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2310_LDataSet ds = (AD_DEP_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }  
    
    public AD_DEP_2320_LDataSet ad_dep_2320_l(AD_DEP_2320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2320_LDataSet ds = (AD_DEP_2320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_2330_LDataSet ad_dep_2330_l(AD_DEP_2330_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2330_LDataSet ds = (AD_DEP_2330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_2340_LDataSet ad_dep_2340_l(AD_DEP_2340_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2340_LDataSet ds = (AD_DEP_2340_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    } 
    
}
