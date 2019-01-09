/***************************************************************************************************
 * ���ϸ� : PL_COM_1500DAO.java
 * ��� : �������-��������
 * �ۼ����� : 2009.03.24
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
public class PL_COM_1500DAO {
	
    /**
     * ��������
     * @param PL_COM_1510_SDM
     * @return PL_COM_1510_SDataSet
     */
    public PL_COM_1510_SDataSet pl_com_1510_s(PL_COM_1510_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1510_SDataSet ds = (PL_COM_1510_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
