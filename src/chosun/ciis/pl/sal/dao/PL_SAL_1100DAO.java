/***************************************************************************************************
 * ���ϸ� : PL_SAL_1100DAO.java
 * ��� : �躻����-���ົ����ǥ�躻
 * �ۼ����� : 2009.03.19
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
public class PL_SAL_1100DAO {
	
    /**
     * ����
     * @param PL_SAL_1100_MDM
     * @return PL_SAL_1100_MDataSet
     */
    public PL_SAL_1100_MDataSet pl_sal_1100_m(PL_SAL_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1100_MDataSet ds = (PL_SAL_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������ȸ
     * @param PL_SAL_1110_LDM
     * @return PL_SAL_1110_LDataSet
     */
    public PL_SAL_1110_LDataSet pl_sal_1110_l(PL_SAL_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1110_LDataSet ds = (PL_SAL_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �躻��ȸ
     * @param PL_SAL_1120_LDM
     * @return PL_SAL_1120_LDataSet
     */
    public PL_SAL_1120_LDataSet pl_sal_1120_l(PL_SAL_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1120_LDataSet ds = (PL_SAL_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���/����/����
     * @param PL_SAL_1130_ADM
     * @return PL_SAL_1130_ADataSet
     */
    public PL_SAL_1130_ADataSet pl_sal_1130_a(PL_SAL_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1130_ADataSet ds = (PL_SAL_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
