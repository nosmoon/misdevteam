/***************************************************************************************************
 * ���ϸ� : PL_BAS_1000DAO.java
 * ��� : ���ʰ���-��������ü����
 * �ۼ����� : 2009.02.11
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
public class PL_BAS_1000DAO {
	
    /**
     * ����
     * @param PL_BAS_1000_MDM
     * @return PL_BAS_1000_MDataSet
     */
    public PL_BAS_1000_MDataSet pl_bas_1000_m(PL_BAS_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1000_MDataSet ds = (PL_BAS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_BAS_1010_LDM
     * @return PL_BAS_1010_LDataSet
     */
    public PL_BAS_1010_LDataSet pl_bas_1010_l(PL_BAS_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1010_LDataSet ds = (PL_BAS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_BAS_1020_LDM
     * @return PL_BAS_1020_LDataSet
     */
    public PL_BAS_1020_LDataSet pl_bas_1020_l(PL_BAS_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1020_LDataSet ds = (PL_BAS_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���/����/����
     * @param PL_BAS_1030_ADM
     * @return PL_BAS_1030_ADataSet
     */
    public PL_BAS_1030_ADataSet pl_bas_1030_a(PL_BAS_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1030_ADataSet ds = (PL_BAS_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���೻��
     * @param PL_BAS_1040_ADM
     * @return PL_BAS_1040_ADataSet
     */
    public PL_BAS_1040_ADataSet pl_bas_1040_a(PL_BAS_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1040_ADataSet ds = (PL_BAS_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �Ǽ�����
     * @param PL_BAS_1050_ADM
     * @return PL_BAS_1050_ADataSet
     */
    public PL_BAS_1050_ADataSet pl_bas_1050_a(PL_BAS_1050_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1050_ADataSet ds = (PL_BAS_1050_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �ηϳ���
     * @param PL_BAS_1060_ADM
     * @return PL_BAS_1060_ADataSet
     */
    public PL_BAS_1060_ADataSet pl_bas_1060_a(PL_BAS_1060_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1060_ADataSet ds = (PL_BAS_1060_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
