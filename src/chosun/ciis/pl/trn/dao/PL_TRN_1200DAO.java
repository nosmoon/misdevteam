/***************************************************************************************************
 * ���ϸ� : PL_TRN_1200DAO.java
 * ��� : ȸ������-���ົ�ŷ�ó��ȸ��
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
public class PL_TRN_1200DAO {
	
    /**
     * ����
     * @param PL_TRN_1200_MDM
     * @return PL_TRN_1200_MDataSet
     */
    public PL_TRN_1200_MDataSet pl_trn_1200_m(PL_TRN_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1200_MDataSet ds = (PL_TRN_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_TRN_1210_LDM
     * @return PL_TRN_1210_LDataSet
     */
    public PL_TRN_1210_LDataSet pl_trn_1210_l(PL_TRN_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1210_LDataSet ds = (PL_TRN_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_TRN_1220_LDM
     * @return PL_TRN_1220_LDataSet
     */
    public PL_TRN_1220_LDataSet pl_trn_1220_l(PL_TRN_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1220_LDataSet ds = (PL_TRN_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_TRN_1230_ADM
     * @return PL_TRN_1230_ADataSet
     */
    public PL_TRN_1230_ADataSet pl_trn_1230_a(PL_TRN_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1230_ADataSet ds = (PL_TRN_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
