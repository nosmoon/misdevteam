/***************************************************************************************************
* ���ϸ� : MT_PAPORD_3000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-08
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.mt.papord.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

public class MT_PAPORD_3000DAO {
		
	/**
	 * �����纰 ���庰 ���� �������緮 ����, ����, ����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_3001_ADataSet mt_papord_3001_a(MT_PAPORD_3001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_3001_ADataSet ds = (MT_PAPORD_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �����纰 ���庰 ���� �������緮 ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_3003_LDataSet mt_papord_3003_l(MT_PAPORD_3003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_3003_LDataSet ds = (MT_PAPORD_3003_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}