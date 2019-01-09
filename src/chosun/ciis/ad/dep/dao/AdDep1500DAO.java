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
import chosun.ciis.ad.dep.dm.AD_DEP_1500_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1510_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1520_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1525_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1530_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1540_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1500_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1510_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1520_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1525_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1530_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1540_ADataSet;

/**
 * 
 */
public class AdDep1500DAO {
	
    public AD_DEP_1500_MDataSet ad_dep_1500_m(AD_DEP_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1500_MDataSet ds = (AD_DEP_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1510_LDataSet ad_dep_1510_l(AD_DEP_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1510_LDataSet ds = (AD_DEP_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1520_SDataSet ad_dep_1520_s(AD_DEP_1520_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1520_SDataSet ds = (AD_DEP_1520_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1525_SDataSet ad_dep_1525_s(AD_DEP_1525_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1525_SDataSet ds = (AD_DEP_1525_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_DEP_1530_ADataSet ad_dep_1530_a(AD_DEP_1530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1530_ADataSet ds = (AD_DEP_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }       
    public AD_DEP_1540_ADataSet ad_dep_1540_a(AD_DEP_1540_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1540_ADataSet ds = (AD_DEP_1540_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
}
