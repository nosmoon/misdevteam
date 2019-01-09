/***************************************************************************************************
* ���ϸ� : SE_SAL_2400DAO.java
* ��� : �Ǹ� - ������� - ������ù���
* �ۼ����� : 2009-05-12
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_2400_MDM;
import chosun.ciis.se.sal.ds.SE_SAL_2400_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_2400DAO {
	
    public SE_SAL_2400_MDataSet se_sal_2400_m(SE_SAL_2400_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2400_MDataSet ds = (SE_SAL_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
}
