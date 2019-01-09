/***************************************************************************************************
 * ���ϸ� : PL_LST_1000DAO.java
 * ��� : ��°���-�ŷ�����
 * �ۼ����� : 2009.05.25
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.lst.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.ds.*;

/**
 * 
 */
public class PL_LST_1000DAO {
	
    /**
     * �ʱ�
     * @param PL_LST_1000_MDM
     * @return PL_LST_1000_MDataSet
     */
    public PL_LST_1000_MDataSet pl_lst_1000_m(PL_LST_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_LST_1000_MDataSet ds = (PL_LST_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����� UPLOAD�� ���� DOWNLOAD
     * @param PL_LST_1710_PDM
     * @return PL_LST_1710_PDataSet
     */
    public PL_LST_1710_PDataSet pl_lst_1710_p(PL_LST_1710_PDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_LST_1710_PDataSet ds = (PL_LST_1710_PDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
