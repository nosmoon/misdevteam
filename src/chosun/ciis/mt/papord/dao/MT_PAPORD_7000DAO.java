/***************************************************************************************************
* ���ϸ� : MT_PAPORD_7000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-17
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

public class MT_PAPORD_7000DAO {
		
	/**
	 * �����ڵ����ּ� - ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7000_LDataSet mt_papord_7000_l(MT_PAPORD_7000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7000_LDataSet ds = (MT_PAPORD_7000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �����ڵ����ּ� - �׸���Caption
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7001_LDataSet mt_papord_7001_l(MT_PAPORD_7001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7001_LDataSet ds = (MT_PAPORD_7001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���ּ�����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7002_LDataSet mt_papord_7002_l(MT_PAPORD_7002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7002_LDataSet ds = (MT_PAPORD_7002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * ������, ����� �̸��� ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7003_LDataSet mt_papord_7003_l(MT_PAPORD_7003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7003_LDataSet ds = (MT_PAPORD_7003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}