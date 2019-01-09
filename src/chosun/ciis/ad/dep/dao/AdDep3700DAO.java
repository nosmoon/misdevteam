/***************************************************************************************************
 * 파일명 : AdDep3700DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3700_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3710_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3715_UDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3720_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3730_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3700_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3710_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3715_UDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3720_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3730_ADataSet;
/**
 * 
 */
public class AdDep3700DAO {
	
    public AD_DEP_3700_MDataSet ad_dep_3700_m(AD_DEP_3700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3700_MDataSet ds = (AD_DEP_3700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    public AD_DEP_3710_LDataSet ad_dep_3710_l(AD_DEP_3710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3710_LDataSet ds = (AD_DEP_3710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    public AD_DEP_3715_UDataSet ad_dep_3715_u(AD_DEP_3715_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3715_UDataSet ds = (AD_DEP_3715_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    public AD_DEP_3720_SDataSet ad_dep_3720_s(AD_DEP_3720_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3720_SDataSet ds = (AD_DEP_3720_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    } 
    public AD_DEP_3730_ADataSet ad_dep_3730_a(AD_DEP_3730_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3730_ADataSet ds = (AD_DEP_3730_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
}
