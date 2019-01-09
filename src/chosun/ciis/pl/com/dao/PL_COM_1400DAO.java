/***************************************************************************************************
 * ���ϸ� : PL_COM_1400DAO.java
 * ��� : �������-�ŷ�ó�߼�ó�˻��˾�
 * �ۼ����� : 2009.03.26
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
public class PL_COM_1400DAO {
	
    /**
     * ����
     * @param PL_COM_1400_MDM
     * @return PL_COM_1400_MDataSet
     */
    public PL_COM_1400_MDataSet pl_com_1400_m(PL_COM_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1400_MDataSet ds = (PL_COM_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_COM_1410_LDM
     * @return PL_COM_1410_LDataSet
     */
	public PL_COM_1410_LDataSet pl_com_1410_l(PL_COM_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1410_LDataSet ds = (PL_COM_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    /**
     * 1����ȸ
     * @param PL_COM_1420_SDM
     * @return PL_COM_1420_SDataSet
     */
	public PL_COM_1420_SDataSet pl_com_1420_s(PL_COM_1420_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1420_SDataSet ds = (PL_COM_1420_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
