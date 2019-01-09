/***************************************************************************************************
* ���ϸ� : SE_SAL_1400DAO.java
* ��� : �Ǹ� - ������� - ������� - �������
* �ۼ����� : 2009-04-06
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.sal.dm.SE_SAL_1400_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1410_SDM;
import chosun.ciis.se.sal.dm.SE_SAL_1420_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1400_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1410_SDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1420_ADataSet;

/**
 * 
 */
public class SE_SAL_1400DAO {
	
    public SE_SAL_1400_MDataSet se_sal_1400_m(SE_SAL_1400_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1400_MDataSet ds = (SE_SAL_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1410_SDataSet se_sal_1410_s(SE_SAL_1410_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1410_SDataSet ds = (SE_SAL_1410_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    public SE_SAL_1420_ADataSet se_sal_1420_a(SE_SAL_1420_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1420_ADataSet ds = (SE_SAL_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
