/***************************************************************************************************
 * ���ϸ� : AdDep3100DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.dep.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.dep.dm.AD_DEP_3310_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3310_LDataSet;
/**
 * 
 */
public class AdDep3300DAO {
	
    public AD_DEP_3310_LDataSet ad_dep_3310_l(AD_DEP_3310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3310_LDataSet ds = (AD_DEP_3310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
