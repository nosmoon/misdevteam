/***************************************************************************************************
 * ���ϸ� : PL_ASS_1000DAO.java
 * ��� : ��������-����������
 * �ۼ����� : 2009.03.12
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.ass.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.ass.dm.*;
import chosun.ciis.pl.ass.ds.*;

/**
 * 
 */
public class PL_ASS_1000DAO {
	
    /**
     * ����
     * @param PL_ASS_1000_MDM
     * @return PL_ASS_1000_MDataSet
     */
    public PL_ASS_1000_MDataSet pl_ass_1000_m(PL_ASS_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1000_MDataSet ds = (PL_ASS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������ȹ
     * @param PL_ASS_1010_LDM
     * @return PL_ASS_1010_LDataSet
     */
    public PL_ASS_1010_LDataSet pl_ass_1010_l(PL_ASS_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1010_LDataSet ds = (PL_ASS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������ȸ
     * @param PL_ASS_1020_LDM
     * @return PL_ASS_1020_LDataSet
     */
    public PL_ASS_1020_LDataSet pl_ass_1020_l(PL_ASS_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1020_LDataSet ds = (PL_ASS_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ���/����/����
     * @param PL_ASS_1030_ADM
     * @return PL_ASS_1030_ADataSet
     */
    public PL_ASS_1030_ADataSet pl_ass_1030_a(PL_ASS_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1030_ADataSet ds = (PL_ASS_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ȣ��Get
     * @param PL_ASS_1040_SDM
     * @return PL_ASS_1040_SDataSet
     */
    public PL_ASS_1040_SDataSet pl_ass_1040_s(PL_ASS_1040_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1040_SDataSet ds = (PL_ASS_1040_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
