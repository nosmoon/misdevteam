/***************************************************************************************************
 * ���ϸ� : AdDep2600DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2810_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2810_LDataSet;
/**
 * 
 */
public class AdDep2800DAO {
	
    public AD_DEP_2810_LDataSet ad_dep_2810_l(AD_DEP_2810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2810_LDataSet ds = (AD_DEP_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
