/***************************************************************************************************
 * ���ϸ� : PL_BAS_1300DAO.java
 * ��� : ���ʰ���-�ŷ�ó��޸�ü����
 * �ۼ����� : 2009.02.25
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */
public class PL_BAS_1300DAO {
	
    /**
     * ����
     * @param PL_BAS_1300_MDM
     * @return PL_BAS_1300_MDataSet
     */
    public PL_BAS_1300_MDataSet pl_bas_1300_m(PL_BAS_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1300_MDataSet ds = (PL_BAS_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_BAS_1310_LDM
     * @return PL_BAS_1310_LDataSet
     */
    public PL_BAS_1310_LDataSet pl_bas_1310_l(PL_BAS_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1310_LDataSet ds = (PL_BAS_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_BAS_1320_LDM
     * @return PL_BAS_1320_LDataSet
     */
    public PL_BAS_1320_LDataSet pl_bas_1320_l(PL_BAS_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1320_LDataSet ds = (PL_BAS_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����
     * @param PL_BAS_1330_ADM
     * @return PL_BAS_1330_ADataSet
     */
    public PL_BAS_1330_ADataSet pl_bas_1330_a(PL_BAS_1330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1330_ADataSet ds = (PL_BAS_1330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����
     * @param PL_BAS_1340_ADM
     * @return PL_BAS_1340_ADataSet
     */
    public PL_BAS_1340_ADataSet pl_bas_1340_a(PL_BAS_1340_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1340_ADataSet ds = (PL_BAS_1340_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
