/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_1000DAO
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-03-30 
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.mt.prnpap.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

public class MT_PRNPAP_1000DAO {
	/**
	 * ����ǰ������������ ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_1000_LDataSet mt_prnpap_1000_l(MT_PRNPAP_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_1000_LDataSet ds = (MT_PRNPAP_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ����, ������
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_1001_LDataSet mt_prnpap_1001_l(MT_PRNPAP_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_1001_LDataSet ds = (MT_PRNPAP_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * �����׸�, ����, ����ġ, �ִ�ġ, ����ġ ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_1002_LDataSet mt_prnpap_1002_l(MT_PRNPAP_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_1002_LDataSet ds = (MT_PRNPAP_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ����ǰ������������ ���� �� ����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_1003_ADataSet mt_prnpap_1003_a(MT_PRNPAP_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_1003_ADataSet ds = (MT_PRNPAP_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			System.out.println("###ERROR : " + ds.getErrcode());
			System.out.println("###ERROR : " + ds.getErrmsg());
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * ����ǰ����������ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_1004_LDataSet mt_prnpap_1004_l(MT_PRNPAP_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_1004_LDataSet ds = (MT_PRNPAP_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}