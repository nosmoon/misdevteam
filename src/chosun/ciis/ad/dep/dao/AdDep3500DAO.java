/***************************************************************************************************
 * 파일명 : AdDep3500DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3500_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3510_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3520_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3530_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_3540_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3500_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3510_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3520_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3530_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3540_ADataSet;
/**
 * 
 */
public class AdDep3500DAO {
	
    public AD_DEP_3500_MDataSet ad_dep_3500_m(AD_DEP_3500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3500_MDataSet ds = (AD_DEP_3500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   

    public AD_DEP_3510_LDataSet ad_dep_3510_l(AD_DEP_3510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3510_LDataSet ds = (AD_DEP_3510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   


    public AD_DEP_3520_LDataSet ad_dep_3520_l(AD_DEP_3520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3520_LDataSet ds = (AD_DEP_3520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   


    public AD_DEP_3530_ADataSet ad_dep_3530_a(AD_DEP_3530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3530_ADataSet ds = (AD_DEP_3530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   


    public AD_DEP_3540_ADataSet ad_dep_3540_a(AD_DEP_3540_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3540_ADataSet ds = (AD_DEP_3540_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    
}
