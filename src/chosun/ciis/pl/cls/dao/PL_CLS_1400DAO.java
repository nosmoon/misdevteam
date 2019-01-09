/***************************************************************************************************
 * ���ϸ� : PL_CLS_1400DAO.java
 * ��� : ��������-�����������
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
public class PL_CLS_1400DAO {
	
    /**
     * ����
     * @param PL_CLS_1400_MDM
     * @return PL_CLS_1400_MDataSet
     */
    public PL_CLS_1400_MDataSet pl_cls_1400_m(PL_CLS_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1400_MDataSet ds = (PL_CLS_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_CLS_1410_LDM
     * @return PL_CLS_1410_LDataSet
     */
    public PL_CLS_1410_LDataSet pl_cls_1410_l(PL_CLS_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1410_LDataSet ds = (PL_CLS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_1420_ADM
     * @return PL_CLS_1420_ADataSet
     */
    public PL_CLS_1420_ADataSet pl_cls_1420_a(PL_CLS_1420_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1420_ADataSet ds = (PL_CLS_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
