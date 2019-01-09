/***************************************************************************************************
* ���ϸ� : MT_PAPORD_6000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-16
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

public class MT_PAPORD_6000DAO {
		
	/**
	 * �����纰 ���� ���ֺ��� ��ȸ(���Ϲ��ֺ���)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_6000_LDataSet mt_papord_6000_l(MT_PAPORD_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6000_LDataSet ds = (MT_PAPORD_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �����纰 ���� ���ֺ��� ��ȸ(�������ֺ���)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_6001_LDataSet mt_papord_6001_l(MT_PAPORD_6001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6001_LDataSet ds = (MT_PAPORD_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �����纰 ���� ���ֺ��� ��ȸ(�������ֺ���)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_6002_LDataSet mt_papord_6002_l(MT_PAPORD_6002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6002_LDataSet ds = (MT_PAPORD_6002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}