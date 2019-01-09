/***************************************************************************************************
 * 파일명 : AdDep4100DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_4110_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_4110_ADataSet;
/**
 * 
 */
public class AdDep4100DAO {
	
    public AD_DEP_4110_ADataSet ad_dep_4110_a(AD_DEP_4110_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_4110_ADataSet ds = (AD_DEP_4110_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
}
