/***************************************************************************************************
 * 파일명 : AdDep3600DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_3610_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3620_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3610_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3620_ADataSet;
/**
 * 
 */
public class AdDep3600DAO {
	
    public AD_DEP_3610_SDataSet ad_dep_3610_s(AD_DEP_3610_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3610_SDataSet ds = (AD_DEP_3610_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    public AD_DEP_3620_ADataSet ad_dep_3620_a(AD_DEP_3620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3620_ADataSet ds = (AD_DEP_3620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   

}
