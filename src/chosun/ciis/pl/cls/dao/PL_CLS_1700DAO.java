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
public class PL_CLS_1700DAO {
	
    /**
     * ��ȸ
     * @param PL_CLS_1710_LDM
     * @return PL_CLS_1710_LDataSet
     */
    public PL_CLS_1710_LDataSet pl_cls_1710_l(PL_CLS_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1710_LDataSet ds = (PL_CLS_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/�������
     * @param PL_CLS_1720_ADM
     * @return PL_CLS_1720_ADataSet
     */
    public PL_CLS_1720_ADataSet pl_cls_1720_a(PL_CLS_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1720_ADataSet ds = (PL_CLS_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**
     * ����/�������
     * @param PL_CLS_1720_ADM
     * @return PL_CLS_1720_ADataSet
     */
    public PL_CLS_1730_ADataSet pl_cls_1730_a(PL_CLS_1730_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1730_ADataSet ds = (PL_CLS_1730_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    /**
     * �����ȸ
     * @param PL_CLS_1740_LDM
     * @return PL_CLS_1740_LDataSet
     */
    public PL_CLS_1740_LDataSet pl_cls_1740_l(PL_CLS_1740_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1740_LDataSet ds = (PL_CLS_1740_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
