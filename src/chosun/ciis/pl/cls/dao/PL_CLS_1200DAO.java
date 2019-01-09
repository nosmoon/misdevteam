/***************************************************************************************************
 * ���ϸ� : PL_CLS_1200DAO.java
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
public class PL_CLS_1200DAO {
	
    /**
     * ����
     * @param PL_CLS_1200_MDM
     * @return PL_CLS_1200_MDataSet
     */
    public PL_CLS_1200_MDataSet pl_cls_1200_m(PL_CLS_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1200_MDataSet ds = (PL_CLS_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_CLS_1210_LDM
     * @return PL_CLS_1210_LDataSet
     */
    public PL_CLS_1210_LDataSet pl_cls_1210_l(PL_CLS_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1210_LDataSet ds = (PL_CLS_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_1220_ADM
     * @return PL_CLS_1220_ADataSet
     */
    public PL_CLS_1220_ADataSet pl_cls_1220_a(PL_CLS_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1220_ADataSet ds = (PL_CLS_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
