/***************************************************************************************************
 * ���ϸ� : PL_CLS_2200DAO.java
 * ��� : ��������-���������
 * �ۼ����� : 2009.05.11
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
public class PL_CLS_2200DAO {
	
    /**
     * ��ȸ
     * @param PL_CLS_2210_LDM
     * @return PL_CLS_2210_LDataSet
     */
    public PL_CLS_2210_LDataSet pl_cls_2210_l(PL_CLS_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_2210_LDataSet ds = (PL_CLS_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_2220_ADM
     * @return PL_CLS_2220_ADataSet
     */
    public PL_CLS_2220_ADataSet pl_cls_2220_a(PL_CLS_2220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_2220_ADataSet ds = (PL_CLS_2220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
