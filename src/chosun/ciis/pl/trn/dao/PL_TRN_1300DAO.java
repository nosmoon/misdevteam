/***************************************************************************************************
 * ���ϸ� : PL_TRN_1300DAO.java
 * ��� : ȸ������-���ົ��ü��ȸ��
 * �ۼ����� : 2009.04.01
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.trn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.trn.dm.*;
import chosun.ciis.pl.trn.ds.*;

/**
 * 
 */
public class PL_TRN_1300DAO {
	
    /**
     * ����
     * @param PL_TRN_1300_MDM
     * @return PL_TRN_1300_MDataSet
     */
    public PL_TRN_1300_MDataSet pl_trn_1300_m(PL_TRN_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1300_MDataSet ds = (PL_TRN_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_TRN_1310_LDM
     * @return PL_TRN_1310_LDataSet
     */
    public PL_TRN_1310_LDataSet pl_trn_1310_l(PL_TRN_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1310_LDataSet ds = (PL_TRN_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_TRN_1320_LDM
     * @return PL_TRN_1320_LDataSet
     */
    public PL_TRN_1320_LDataSet pl_trn_1320_l(PL_TRN_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1320_LDataSet ds = (PL_TRN_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_TRN_1330_ADM
     * @return PL_TRN_1330_ADataSet
     */
    public PL_TRN_1330_ADataSet pl_trn_1330_a(PL_TRN_1330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1330_ADataSet ds = (PL_TRN_1330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
