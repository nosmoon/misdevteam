/***************************************************************************************************
 * ���ϸ� : .java
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

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_2510_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2510_LDataSet;
/**
 * 
 */
public class AdBas2500DAO {
	
	public AD_BAS_2510_LDataSet ad_bas_2510_l(AD_BAS_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2510_LDataSet ds = (AD_BAS_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
