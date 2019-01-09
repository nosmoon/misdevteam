/***************************************************************************************************
 * ���ϸ� : PL_SAL_1300DAO.java
 * ��� : �躻����-��ü���躻
 * �ۼ����� : 2009.03.27
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
public class PL_SAL_1300DAO {
	
    /**
     * ����
     * @param PL_SAL_1300_MDM
     * @return PL_SAL_1300_MDataSet
     */
    public PL_SAL_1300_MDataSet pl_sal_1300_m(PL_SAL_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1300_MDataSet ds = (PL_SAL_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_SAL_1310_LDM
     * @return PL_SAL_1310_LDataSet
     */
    public PL_SAL_1310_LDataSet pl_sal_1310_l(PL_SAL_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1310_LDataSet ds = (PL_SAL_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_SAL_1320_LDM
     * @return PL_SAL_1320_LDataSet
     */
    public PL_SAL_1320_LDataSet pl_sal_1320_l(PL_SAL_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1320_LDataSet ds = (PL_SAL_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_SAL_1330_ADM
     * @return PL_SAL_1330_ADataSet
     */
    public PL_SAL_1330_ADataSet pl_sal_1330_a(PL_SAL_1330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1330_ADataSet ds = (PL_SAL_1330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
