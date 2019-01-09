package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_4000DAO {
	/**
	 * 공장, 현상, 매체, 관련부서, 원인(대), 원인(중) COMBO 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4000_MDataSet mt_papinout_4000_m(MT_PAPINOUT_4000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4000_MDataSet ds = (MT_PAPINOUT_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 공장, 제지회사, 지절시점, 지절원인(대), 지절원인(중) COMBO 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4001_MDataSet mt_papinout_4001_m(MT_PAPINOUT_4001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4001_MDataSet ds = (MT_PAPINOUT_4001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 제작이상건 저장, 수정, 삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4100_ADataSet mt_papinout_4100_a(MT_PAPINOUT_4100_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4100_ADataSet ds = (MT_PAPINOUT_4100_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 제작이상건 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4101_LDataSet mt_papinout_4101_l(MT_PAPINOUT_4101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4101_LDataSet ds = (MT_PAPINOUT_4101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 제작이상건 조회 - 상세조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4200_LDataSet mt_papinout_4200_l(MT_PAPINOUT_4200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4200_LDataSet ds = (MT_PAPINOUT_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 지절입력 저장, 수정, 삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4300_ADataSet mt_papinout_4300_a(MT_PAPINOUT_4300_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4300_ADataSet ds = (MT_PAPINOUT_4300_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 지절입력 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4301_LDataSet mt_papinout_4301_l(MT_PAPINOUT_4301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4301_LDataSet ds = (MT_PAPINOUT_4301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 지절조회1 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4400_LDataSet mt_papinout_4400_l(MT_PAPINOUT_4400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4400_LDataSet ds = (MT_PAPINOUT_4400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 지절조회2 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_4500_LDataSet mt_papinout_4500_l(MT_PAPINOUT_4500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_4500_LDataSet ds = (MT_PAPINOUT_4500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}