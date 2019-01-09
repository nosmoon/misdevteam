/***************************************************************************************************
* ���ϸ� : SE_SAL_2200DAO.java
* ��� : �Ǹ� - ������� - ������� - ��ü��������Ȳ
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

import chosun.ciis.se.sal.dm.SE_SAL_2200_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2210_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_2200_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2210_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_2200DAO {
	
    public SE_SAL_2200_MDataSet se_sal_2200_m(SE_SAL_2200_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2200_MDataSet ds = (SE_SAL_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_2210_LDataSet se_sal_2210_l(SE_SAL_2210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2210_LDataSet ds = (SE_SAL_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
