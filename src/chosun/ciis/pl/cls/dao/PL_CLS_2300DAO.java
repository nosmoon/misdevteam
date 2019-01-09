/***************************************************************************************************
 * ���ϸ� : PL_CLS_2300DAO.java
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
public class PL_CLS_2300DAO {
	
    /**
     * ��ȸ
     * @param PL_CLS_2310_LDM
     * @return PL_CLS_2310_LDataSet
     */
    public PL_CLS_2310_LDataSet pl_cls_2310_l(PL_CLS_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_2310_LDataSet ds = (PL_CLS_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_2320_ADM
     * @return PL_CLS_2320_ADataSet
     */
    public PL_CLS_2320_ADataSet pl_cls_2320_a(PL_CLS_2320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_2320_ADataSet ds = (PL_CLS_2320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
