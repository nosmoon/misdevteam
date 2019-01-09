/***************************************************************************************************
 * ���ϸ� : PL_RTN_1100DAO.java
 * ��� : ��ǰ����-��������ü����ǰ
 * �ۼ����� : 2009.03.31
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rtn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.rtn.dm.*;
import chosun.ciis.pl.rtn.ds.*;

/**
 * 
 */
public class PL_RTN_1100DAO {
	
    /**
     * ����
     * @param PL_RTN_1100_MDM
     * @return PL_RTN_1100_MDataSet
     */
    public PL_RTN_1100_MDataSet pl_rtn_1100_m(PL_RTN_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1100_MDataSet ds = (PL_RTN_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_RTN_1110_LDM
     * @return PL_RTN_1110_LDataSet
     */
    public PL_RTN_1110_LDataSet pl_rtn_1110_l(PL_RTN_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1110_LDataSet ds = (PL_RTN_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_RTN_1120_LDM
     * @return PL_RTN_1120_LDataSet
     */
    public PL_RTN_1120_LDataSet pl_rtn_1120_l(PL_RTN_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1120_LDataSet ds = (PL_RTN_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_RTN_1130_ADM
     * @return PL_RTN_1130_ADataSet
     */
    public PL_RTN_1130_ADataSet pl_rtn_1130_a(PL_RTN_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1130_ADataSet ds = (PL_RTN_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
