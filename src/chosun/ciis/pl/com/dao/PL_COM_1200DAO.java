/***************************************************************************************************
 * ���ϸ� : PL_COM_1200DAO.java
 * ��� : �������-�系�Ǹ����ó��
 * �ۼ����� : 2009.04.06
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
public class PL_COM_1200DAO {
	
    /**
     * ��ȸ
     * @param PL_COM_1210_SDM
     * @return PL_COM_1210_SDataSet
     */
	public PL_COM_1210_SDataSet pl_com_1210_s(PL_COM_1210_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1210_SDataSet ds = (PL_COM_1210_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    /**
     * ����/����
     * @param PL_COM_1220_ADM
     * @return PL_COM_1220_ADataSet
     */
	public PL_COM_1220_ADataSet pl_com_1220_a(PL_COM_1220_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1220_ADataSet ds = (PL_COM_1220_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
