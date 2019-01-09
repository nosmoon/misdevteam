/***************************************************************************************************
 * 파일명 : AdDep1200DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_1200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1210_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1220_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1230_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1210_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1220_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1230_ADataSet;

/**
 * 
 */
public class AdDep1200DAO {
	
	public AD_DEP_1200_MDataSet ad_dep_1200_m(AD_DEP_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1200_MDataSet ds = (AD_DEP_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    public AD_DEP_1210_LDataSet ad_dep_1210_l(AD_DEP_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1210_LDataSet ds = (AD_DEP_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      

    public AD_DEP_1220_ADataSet ad_dep_1220_a(AD_DEP_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1220_ADataSet ds = (AD_DEP_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_DEP_1230_ADataSet ad_dep_1230_a(AD_DEP_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_1230_ADataSet ds = (AD_DEP_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

}
