/***************************************************************************************************
 * ���ϸ� : PL_SAL_1200DAO.java
 * ��� : �躻����-�ŷ�ó���躻
 * �ۼ����� : 2009.03.24
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
public class PL_SAL_1200DAO {
	
    /**
     * ����
     * @param PL_SAL_1200_MDM
     * @return PL_SAL_1200_MDataSet
     */
    public PL_SAL_1200_MDataSet pl_sal_1200_m(PL_SAL_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1200_MDataSet ds = (PL_SAL_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_SAL_1210_LDM
     * @return PL_SAL_1210_LDataSet
     */
    public PL_SAL_1210_LDataSet pl_sal_1210_l(PL_SAL_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1210_LDataSet ds = (PL_SAL_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_SAL_1220_LDM
     * @return PL_SAL_1220_LDataSet
     */
    public PL_SAL_1220_LDataSet pl_sal_1220_l(PL_SAL_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1220_LDataSet ds = (PL_SAL_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_SAL_1230_ADM
     * @return PL_SAL_1230_ADataSet
     */
    public PL_SAL_1230_ADataSet pl_sal_1230_a(PL_SAL_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1230_ADataSet ds = (PL_SAL_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
