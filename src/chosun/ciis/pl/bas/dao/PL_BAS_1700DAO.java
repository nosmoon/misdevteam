/***************************************************************************************************
 * ���ϸ� : PL_BAS_1700DAO.java
 * ��� : ���ʰ���-������Ա��ذ���
 * �ۼ����� : 2009.06.15
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
public class PL_BAS_1700DAO {
	
    /**
     * ����
     * @param PL_BAS_1700_MDM
     * @return PL_BAS_1700_MDataSet
     */
    public PL_BAS_1700_MDataSet pl_bas_1700_m(PL_BAS_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1700_MDataSet ds = (PL_BAS_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_BAS_1710_LDM
     * @return PL_BAS_1710_LDataSet
     */
    public PL_BAS_1710_LDataSet pl_bas_1710_l(PL_BAS_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1710_LDataSet ds = (PL_BAS_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_BAS_1720_ADM
     * @return PL_BAS_1720_ADataSet
     */
    public PL_BAS_1720_ADataSet pl_bas_1720_a(PL_BAS_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1720_ADataSet ds = (PL_BAS_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
