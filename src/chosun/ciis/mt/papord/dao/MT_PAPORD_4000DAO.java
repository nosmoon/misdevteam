/***************************************************************************************************
* ���ϸ� : MT_PAPORD_4000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-09
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

public class MT_PAPORD_4000DAO {
		
	/**
	 * �ְ������μⷮ����(����, ��ü �޺�)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_4000_MDataSet mt_papord_4000_m(MT_PAPORD_4000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4000_MDataSet ds = (MT_PAPORD_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ������μⷮ����(���� �޺�)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_4001_MDataSet mt_papord_4001_m(MT_PAPORD_4001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4001_MDataSet ds = (MT_PAPORD_4001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ������μⷮ����(�߷�/1�� �޺�)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_4002_MDataSet mt_papord_4002_m(MT_PAPORD_4002_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4002_MDataSet ds = (MT_PAPORD_4002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ������, ����μ�, ���⿩��
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_4003_LDataSet mt_papord_4003_l(MT_PAPORD_4003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4003_LDataSet ds = (MT_PAPORD_4003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * �ְ������μⷮ���� ����,����,����
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4004_ADataSet mt_papord_4004_a(MT_PAPORD_4004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4004_ADataSet ds = (MT_PAPORD_4004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4005_LDataSet mt_papord_4005_l(MT_PAPORD_4005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4005_LDataSet ds = (MT_PAPORD_4005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4006_LDataSet mt_papord_4006_l(MT_PAPORD_4006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4006_LDataSet ds = (MT_PAPORD_4006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4007_LDataSet mt_papord_4007_l(MT_PAPORD_4007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4007_LDataSet ds = (MT_PAPORD_4007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4008_LDataSet mt_papord_4008_l(MT_PAPORD_4008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4008_LDataSet ds = (MT_PAPORD_4008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �ְ�������ȸ �˾�
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4100_LDataSet mt_papord_4100_l(MT_PAPORD_4100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4100_LDataSet ds = (MT_PAPORD_4100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}