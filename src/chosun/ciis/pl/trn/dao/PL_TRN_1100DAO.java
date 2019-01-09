/***************************************************************************************************
 * ���ϸ� : PL_TRN_1100DAO.java
 * ��� : ȸ������-��������ü��ȸ��
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
public class PL_TRN_1100DAO {
	
    /**
     * ����
     * @param PL_TRN_1100_MDM
     * @return PL_TRN_1100_MDataSet
     */
    public PL_TRN_1100_MDataSet pl_trn_1100_m(PL_TRN_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1100_MDataSet ds = (PL_TRN_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_TRN_1110_LDM
     * @return PL_TRN_1110_LDataSet
     */
    public PL_TRN_1110_LDataSet pl_trn_1110_l(PL_TRN_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1110_LDataSet ds = (PL_TRN_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_TRN_1120_LDM
     * @return PL_TRN_1120_LDataSet
     */
    public PL_TRN_1120_LDataSet pl_trn_1120_l(PL_TRN_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1120_LDataSet ds = (PL_TRN_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_TRN_1130_ADM
     * @return PL_TRN_1130_ADataSet
     */
    public PL_TRN_1130_ADataSet pl_trn_1130_a(PL_TRN_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1130_ADataSet ds = (PL_TRN_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
