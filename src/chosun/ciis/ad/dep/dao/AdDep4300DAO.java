/***************************************************************************************************
 * 파일명 : AdDep4300DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_4300_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4310_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4350_ADM;

import chosun.ciis.ad.dep.ds.AD_DEP_4300_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4310_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4350_ADataSet;

/**
 * 
 */
public class AdDep4300DAO {

    public AD_DEP_4300_MDataSet ad_dep_4300_m(AD_DEP_4300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4300_MDataSet ds = (AD_DEP_4300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_DEP_4310_LDataSet ad_dep_4310_l(AD_DEP_4310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4310_LDataSet ds = (AD_DEP_4310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_DEP_4350_ADataSet ad_dep_4350_a(AD_DEP_4350_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4350_ADataSet ds = (AD_DEP_4350_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}
