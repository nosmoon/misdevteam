/***************************************************************************************************
* ���ϸ� : MT_PAPORD_1000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-03
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

public class MT_PAPORD_1000DAO {
	/**
	 * ����combo
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1000_MDataSet mt_papord_1000_m(MT_PAPORD_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1000_MDataSet ds = (MT_PAPORD_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���庰 ���� �������뷮 ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1001_LDataSet mt_papord_1001_l(MT_PAPORD_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1001_LDataSet ds = (MT_PAPORD_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ����Roll���߷� table Data ���� Ȯ��
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1002_LDataSet mt_papord_1002_l(MT_PAPORD_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1002_LDataSet ds = (MT_PAPORD_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���庰 ���� �������뷮 ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1003_LDataSet mt_papord_1003_l(MT_PAPORD_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1003_LDataSet ds = (MT_PAPORD_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���庰 ���� �������뷮 ����,����,����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1004_ADataSet mt_papord_1004_a(MT_PAPORD_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1004_ADataSet ds = (MT_PAPORD_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���庰 ���� �������뷮 ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1005_LDataSet mt_papord_1005_l(MT_PAPORD_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1005_LDataSet ds = (MT_PAPORD_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���庰 ���� �������뷮 ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1006_LDataSet mt_papord_1006_l(MT_PAPORD_1006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1006_LDataSet ds = (MT_PAPORD_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ���庰 ���� �������뷮 ����,����,����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1007_ADataSet mt_papord_1007_a(MT_PAPORD_1007_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1007_ADataSet ds = (MT_PAPORD_1007_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}