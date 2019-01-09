/***************************************************************************************************
 * 파일명 : AdDep1800DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1800_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1810_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1820_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1830_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1840_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1850_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1800_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1810_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1820_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1830_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1840_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1850_LDataSet;
/**
 * 
 */
public class AdDep1800DAO {
	
    public AD_DEP_1800_MDataSet ad_dep_1800_m(AD_DEP_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1800_MDataSet ds = (AD_DEP_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_1810_LDataSet ad_dep_1810_l(AD_DEP_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1810_LDataSet ds = (AD_DEP_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_1820_LDataSet ad_dep_1820_l(AD_DEP_1820_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1820_LDataSet ds = (AD_DEP_1820_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_1830_LDataSet ad_dep_1830_l(AD_DEP_1830_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1830_LDataSet ds = (AD_DEP_1830_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_1840_LDataSet ad_dep_1840_l(AD_DEP_1840_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1840_LDataSet ds = (AD_DEP_1840_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_1850_LDataSet ad_dep_1850_l(AD_DEP_1850_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1850_LDataSet ds = (AD_DEP_1850_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
}
