/***************************************************************************************************
 * 파일명 : AdDep4200DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_4200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4210_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4220_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_4221_UDM;
import chosun.ciis.ad.dep.ds.AD_DEP_4200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4210_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4220_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4221_UDataSet;
/**
 * 
 */
public class AdDep4200DAO {
	
    public AD_DEP_4200_MDataSet ad_dep_4200_m(AD_DEP_4200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4200_MDataSet ds = (AD_DEP_4200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   

    public AD_DEP_4210_LDataSet ad_dep_4210_l(AD_DEP_4210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4210_LDataSet ds = (AD_DEP_4210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }

    public AD_DEP_4220_ADataSet ad_dep_4220_a(AD_DEP_4220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4220_ADataSet ds = (AD_DEP_4220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
    public AD_DEP_4221_UDataSet ad_dep_4221_u(AD_DEP_4221_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4221_UDataSet ds = (AD_DEP_4221_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
