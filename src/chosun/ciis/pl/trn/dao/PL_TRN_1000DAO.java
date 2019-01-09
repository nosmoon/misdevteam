/***************************************************************************************************
 * ���ϸ� : PL_TRN_1000DAO.java
 * ��� : ȸ������-�������ŷ�ó��ȸ��
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
public class PL_TRN_1000DAO {
	
    /**
     * ����
     * @param PL_TRN_1000_MDM
     * @return PL_TRN_1000_MDataSet
     */
    public PL_TRN_1000_MDataSet pl_trn_1000_m(PL_TRN_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1000_MDataSet ds = (PL_TRN_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_TRN_1010_LDM
     * @return PL_TRN_1010_LDataSet
     */
    public PL_TRN_1010_LDataSet pl_trn_1010_l(PL_TRN_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1010_LDataSet ds = (PL_TRN_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_TRN_1020_LDM
     * @return PL_TRN_1020_LDataSet
     */
    public PL_TRN_1020_LDataSet pl_trn_1020_l(PL_TRN_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1020_LDataSet ds = (PL_TRN_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_TRN_1030_ADM
     * @return PL_TRN_1030_ADataSet
     */
    public PL_TRN_1030_ADataSet pl_trn_1030_a(PL_TRN_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1030_ADataSet ds = (PL_TRN_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
