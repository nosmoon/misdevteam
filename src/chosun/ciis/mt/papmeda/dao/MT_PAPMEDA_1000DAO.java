package chosun.ciis.mt.papmeda.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

public class MT_PAPMEDA_1000DAO {
	/**
	 * 위탁처, 제지사, 매체 콤보
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
	 * 사업자등록번호 조회
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
	 * 위탁처조정금액내역 저장,수정,삭제
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
	 * 위탁처조정금액내역 조회
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
	 * 삭제 및 전표 취소
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
	 * 위탁처별 조회 - 위탁처(동적그리드)조회
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
	 * 위탁처별 조회
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
	 * 제지사별 조회 - 제지사(동적그리드)조회
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
	 * 제지사별 조회
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
