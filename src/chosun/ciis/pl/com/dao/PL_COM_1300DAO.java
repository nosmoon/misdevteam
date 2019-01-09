/***************************************************************************************************
 * ���ϸ� : PL_COM_1300DAO.java
 * ��� : �������-�系�Ǹ��Ա�ó��
 * �ۼ����� : 2009.04.22
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */
public class PL_COM_1300DAO {
	
    /**
     * ����
     * @param PL_COM_1300_MDM
     * @return PL_COM_1300_MDataSet
     */
    public PL_COM_1300_MDataSet pl_com_1300_m(PL_COM_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1300_MDataSet ds = (PL_COM_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_COM_1310_LDM
     * @return PL_COM_1310_LDataSet
     */
    public PL_COM_1310_LDataSet pl_com_1310_l(PL_COM_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1310_LDataSet ds = (PL_COM_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_COM_1320_ADM
     * @return PL_COM_1320_ADataSet
     */
    public PL_COM_1320_ADataSet pl_com_1320_a(PL_COM_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1320_ADataSet ds = (PL_COM_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
