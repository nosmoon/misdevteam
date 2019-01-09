/***************************************************************************************************
 * ���ϸ� : AdDep2000DAO.java
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
import chosun.ciis.ad.dep.dm.AD_DEP_2010_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2010_LDataSet;
/**
 * 
 */
public class AdDep2000DAO {

    public AD_DEP_2010_LDataSet ad_dep_2010_l(AD_DEP_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_2010_LDataSet ds = (AD_DEP_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }  
    
}
