package chosun.ciis.mt.papmeda.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

public class MT_PAPMEDA_1000DAO {
	/**
	 * ��Źó, ������, ��ü �޺�
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1000_MDataSet mt_papmeda_1000_m(MT_PAPMEDA_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1000_MDataSet ds = (MT_PAPMEDA_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}



	/**
	 * ����ڵ�Ϲ�ȣ ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1100_LDataSet mt_papmeda_1100_l(MT_PAPMEDA_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1100_LDataSet ds = (MT_PAPMEDA_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}



	/**
	 * ��Źó�����ݾ׳��� ����,����,����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1101_ADataSet mt_papmeda_1101_a(MT_PAPMEDA_1101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1101_ADataSet ds = (MT_PAPMEDA_1101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


	/**
	 * ��Źó�����ݾ׳��� ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1102_LDataSet mt_papmeda_1102_l(MT_PAPMEDA_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1102_LDataSet ds = (MT_PAPMEDA_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	/**
	 * ���� �� ��ǥ ���
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1104_MDataSet mt_papmeda_1104_m(MT_PAPMEDA_1104_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1104_MDataSet ds = (MT_PAPMEDA_1104_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


	/**
	 * ��Źó�� ��ȸ - ��Źó(�����׸���)��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1200_LDataSet mt_papmeda_1200_l(MT_PAPMEDA_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1200_LDataSet ds = (MT_PAPMEDA_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	/**
	 * ��Źó�� ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1201_LDataSet mt_papmeda_1201_l(MT_PAPMEDA_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1201_LDataSet ds = (MT_PAPMEDA_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


	/**
	 * �����纰 ��ȸ - ������(�����׸���)��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1300_LDataSet mt_papmeda_1300_l(MT_PAPMEDA_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1300_LDataSet ds = (MT_PAPMEDA_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	/**
	 * �����纰 ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPMEDA_1301_LDataSet mt_papmeda_1301_l(MT_PAPMEDA_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1301_LDataSet ds = (MT_PAPMEDA_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
