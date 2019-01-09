/***************************************************************************************************
 * ���ϸ� : PL_SAL_3100DAO.java
 * ��� : �躻����-�߼۰�꼭(�߰�)
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
public class PL_SAL_3100DAO {
	
    /**
     * ����
     * @param PL_SAL_3100_MDM
     * @return PL_SAL_3100_MDataSet
     */
    public PL_SAL_3100_MDataSet pl_sal_3100_m(PL_SAL_3100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_3100_MDataSet ds = (PL_SAL_3100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_SAL_3110_LDM
     * @return PL_SAL_3110_LDataSet
     */
    public PL_SAL_3110_LDataSet pl_sal_3110_l(PL_SAL_3110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_3110_LDataSet ds = (PL_SAL_3110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
