/***************************************************************************************************
 * ���ϸ� : PL_CLS_1000DAO.java
 * ��� : ��������-�Ա��ϸ���
 * �ۼ����� : 2009.05.13
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
public class PL_CLS_1600DAO {
	
    /**
     * ��ȸ
     * @param PL_CLS_1010_LDM
     * @return PL_CLS_1010_LDataSet
     */
    public PL_CLS_1610_LDataSet pl_cls_1610_l(PL_CLS_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1610_LDataSet ds = (PL_CLS_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_1020_ADM
     * @return PL_CLS_1020_ADataSet
     */
    public PL_CLS_1620_ADataSet pl_cls_1620_a(PL_CLS_1620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1620_ADataSet ds = (PL_CLS_1620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
