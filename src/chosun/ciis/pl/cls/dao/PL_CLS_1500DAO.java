/***************************************************************************************************
 * ���ϸ� : PL_CLS_1500DAO.java
 * ��� : ��������-�Աݿ�������
 * �ۼ����� : 2009.08.26
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */
public class PL_CLS_1500DAO {
	
    /**
     * ����
     * @param PL_CLS_1500_MDM
     * @return PL_CLS_1500_MDataSet
     */
    public PL_CLS_1500_MDataSet pl_cls_1500_m(PL_CLS_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1500_MDataSet ds = (PL_CLS_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_CLS_1510_LDM
     * @return PL_CLS_1510_LDataSet
     */
    public PL_CLS_1510_LDataSet pl_cls_1510_l(PL_CLS_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1510_LDataSet ds = (PL_CLS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_1520_ADM
     * @return PL_CLS_1520_ADataSet
     */
    public PL_CLS_1520_ADataSet pl_cls_1520_a(PL_CLS_1520_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1520_ADataSet ds = (PL_CLS_1520_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
