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

public class MT_PRNPAP_2000DAO {
	/**
	 * ����,�����԰�,�μ�������� ��ȸ 
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_2000_LDataSet mt_prnpap_2000_l(MT_PRNPAP_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2000_LDataSet ds = (MT_PRNPAP_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/**
	 * �μ��Ƿ����� ��ȸ 
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_2010_LDataSet mt_prnpap_2010_l(MT_PRNPAP_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2010_LDataSet ds = (MT_PRNPAP_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/**
	 * �μ��Ƿ����� �Է�,����,����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PRNPAP_2020_ADataSet mt_prnpap_2020_a(MT_PRNPAP_2020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2020_ADataSet ds = (MT_PRNPAP_2020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_2030_LDataSet mt_prnpap_2030_l(MT_PRNPAP_2030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_2030_LDataSet ds = (MT_PRNPAP_2030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}