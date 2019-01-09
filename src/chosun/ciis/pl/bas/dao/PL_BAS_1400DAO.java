/***************************************************************************************************
 * ���ϸ� : PL_BAS_1400DAO.java
 * ��� : ���ʰ���-�����ܾװ���
 * �ۼ����� : 2009.03.05
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
public class PL_BAS_1400DAO {
	
    /**
     * ����
     * @param PL_BAS_1400_MDM
     * @return PL_BAS_1400_MDataSet
     */
    public PL_BAS_1400_MDataSet pl_bas_1400_m(PL_BAS_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1400_MDataSet ds = (PL_BAS_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_BAS_1410_LDM
     * @return PL_BAS_1410_LDataSet
     */
    public PL_BAS_1410_LDataSet pl_bas_1410_l(PL_BAS_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1410_LDataSet ds = (PL_BAS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_BAS_1420_LDM
     * @return PL_BAS_1420_LDataSet
     */
    public PL_BAS_1420_LDataSet pl_bas_1420_l(PL_BAS_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1420_LDataSet ds = (PL_BAS_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_BAS_1430_ADM
     * @return PL_BAS_1430_ADataSet
     */
    public PL_BAS_1430_ADataSet pl_bas_1430_a(PL_BAS_1430_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1430_ADataSet ds = (PL_BAS_1430_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
