/***************************************************************************************************
 * ���ϸ� : AdDep2100DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2110_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2110_LDataSet;
/**
 * 
 */
public class AdDep2100DAO {

    public AD_DEP_2110_LDataSet ad_dep_2110_l(AD_DEP_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2110_LDataSet ds = (AD_DEP_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }  
    
}
