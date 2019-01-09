/***************************************************************************************************
 * ���ϸ� : PL_RTN_1000DAO.java
 * ��� : ��ǰ����-�������ŷ�ó����ǰ
 * �ۼ����� : 2009.03.30
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
public class PL_RTN_1000DAO {
	
    /**
     * ����
     * @param PL_RTN_1000_MDM
     * @return PL_RTN_1000_MDataSet
     */
    public PL_RTN_1000_MDataSet pl_rtn_1000_m(PL_RTN_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1000_MDataSet ds = (PL_RTN_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_RTN_1010_LDM
     * @return PL_RTN_1010_LDataSet
     */
    public PL_RTN_1010_LDataSet pl_rtn_1010_l(PL_RTN_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1010_LDataSet ds = (PL_RTN_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_RTN_1020_LDM
     * @return PL_RTN_1020_LDataSet
     */
    public PL_RTN_1020_LDataSet pl_rtn_1020_l(PL_RTN_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1020_LDataSet ds = (PL_RTN_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ȸ
     * @param PL_RTN_1030_LDM
     * @return PL_RTN_1030_LDataSet
     */
    public PL_RTN_1030_LDataSet pl_rtn_1030_l(PL_RTN_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1030_LDataSet ds = (PL_RTN_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_RTN_1040_ADM
     * @return PL_RTN_1040_ADataSet
     */
    public PL_RTN_1040_ADataSet pl_rtn_1040_a(PL_RTN_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1040_ADataSet ds = (PL_RTN_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
