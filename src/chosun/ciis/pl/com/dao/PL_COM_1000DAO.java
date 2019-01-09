/***************************************************************************************************
 * ���ϸ� : PL_COM_1000DAO.java
 * ��� : �������-�ŷ�ó�˻��˾�
 * �ۼ����� : 2009.03.06
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
public class PL_COM_1000DAO {
	
    /**
     * ����
     * @param PL_COM_1000_MDM
     * @return PL_COM_1000_MDataSet
     */
    public PL_COM_1000_MDataSet pl_com_1000_m(PL_COM_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1000_MDataSet ds = (PL_COM_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_COM_1010_LDM
     * @return PL_COM_1010_LDataSet
     */
	public PL_COM_1010_LDataSet pl_com_1010_l(PL_COM_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1010_LDataSet ds = (PL_COM_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    /**
     * 1����ȸ
     * @param PL_COM_1020_SDM
     * @return PL_COM_1020_SDataSet
     */
	public PL_COM_1020_SDataSet pl_com_1020_s(PL_COM_1020_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1020_SDataSet ds = (PL_COM_1020_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
