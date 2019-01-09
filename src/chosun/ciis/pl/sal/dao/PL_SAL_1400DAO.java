/***************************************************************************************************
 * ���ϸ� : PL_SAL_1400DAO.java
 * ��� : �躻����-�系�Ǹ�
 * �ۼ����� : 2009.04.02
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
public class PL_SAL_1400DAO {
	
    /**
     * ����
     * @param PL_SAL_1400_MDM
     * @return PL_SAL_1400_MDataSet
     */
    public PL_SAL_1400_MDataSet pl_sal_1400_m(PL_SAL_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1400_MDataSet ds = (PL_SAL_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_SAL_1410_LDM
     * @return PL_SAL_1410_LDataSet
     */
    public PL_SAL_1410_LDataSet pl_sal_1410_l(PL_SAL_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1410_LDataSet ds = (PL_SAL_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_SAL_1420_LDM
     * @return PL_SAL_1420_LDataSet
     */
    public PL_SAL_1420_LDataSet pl_sal_1420_l(PL_SAL_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1420_LDataSet ds = (PL_SAL_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_SAL_1430_ADM
     * @return PL_SAL_1430_ADataSet
     */
    public PL_SAL_1430_ADataSet pl_sal_1430_a(PL_SAL_1430_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1430_ADataSet ds = (PL_SAL_1430_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
