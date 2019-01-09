/***************************************************************************************************
 * ���ϸ� : PL_SAL_3000DAO.java
 * ��� : �躻����-�߼۰�꼭(�ϰ�)
 * �ۼ����� : 2009.04.08
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.ds.*;

/**
 * 
 */
public class PL_SAL_3000DAO {
	
    /**
     * ����
     * @param PL_SAL_3000_MDM
     * @return PL_SAL_3000_MDataSet
     */
    public PL_SAL_3000_MDataSet pl_sal_3000_m(PL_SAL_3000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_3000_MDataSet ds = (PL_SAL_3000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_SAL_3010_LDM
     * @return PL_SAL_3010_LDataSet
     */
    public PL_SAL_3010_LDataSet pl_sal_3010_l(PL_SAL_3010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_3010_LDataSet ds = (PL_SAL_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
