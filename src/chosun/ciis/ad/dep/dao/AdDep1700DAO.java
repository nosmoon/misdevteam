/***************************************************************************************************
 * 파일명 : AdDep1500DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1700_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1710_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1700_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1710_LDataSet;

import chosun.ciis.ad.dep.dm.AD_DEP_1750_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1751_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1750_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1751_LDataSet;

/**
 * 
 */
public class AdDep1700DAO {
	
    public AD_DEP_1700_MDataSet ad_dep_1700_m(AD_DEP_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1700_MDataSet ds = (AD_DEP_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1710_LDataSet ad_dep_1710_l(AD_DEP_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1710_LDataSet ds = (AD_DEP_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    
    public AD_DEP_1750_MDataSet ad_dep_1750_m(AD_DEP_1750_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1750_MDataSet ds = (AD_DEP_1750_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1751_LDataSet ad_dep_1751_l(AD_DEP_1751_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1751_LDataSet ds = (AD_DEP_1751_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
}
