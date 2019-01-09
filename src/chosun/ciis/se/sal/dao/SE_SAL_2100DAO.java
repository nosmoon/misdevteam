/***************************************************************************************************
* ���ϸ� : SE_SAL_2100DAO.java
* ��� : �Ǹ� - ������� - ������� - ������׻�����Ȳ
* �ۼ����� : 2009-04-07
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_2100_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2110_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_2100_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2110_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_2100DAO {
	
    public SE_SAL_2100_MDataSet se_sal_2100_m(SE_SAL_2100_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2100_MDataSet ds = (SE_SAL_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    public SE_SAL_2110_LDataSet se_sal_2110_l(SE_SAL_2110_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2110_LDataSet ds = (SE_SAL_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
