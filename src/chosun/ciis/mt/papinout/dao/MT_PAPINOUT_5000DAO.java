package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 *
 */
public class MT_PAPINOUT_5000DAO {
	/**
	 * 파지종류 COMBO 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5000_MDataSet mt_papinout_5000_m(MT_PAPINOUT_5000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5000_MDataSet ds = (MT_PAPINOUT_5000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 파지종류 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5100_LDataSet mt_papinout_5100_l(MT_PAPINOUT_5100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5100_LDataSet ds = (MT_PAPINOUT_5100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지종류별 금액 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5101_LDataSet mt_papinout_5101_l(MT_PAPINOUT_5101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5101_LDataSet ds = (MT_PAPINOUT_5101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지매각대금 저장
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5102_IDataSet mt_papinout_5102_i(MT_PAPINOUT_5102_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5102_IDataSet ds = (MT_PAPINOUT_5102_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지매각 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5103_LDataSet mt_papinout_5103_l(MT_PAPINOUT_5103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5103_LDataSet ds = (MT_PAPINOUT_5103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지매각종류 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5104_LDataSet mt_papinout_5104_l(MT_PAPINOUT_5104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5104_LDataSet ds = (MT_PAPINOUT_5104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지매각대금 수정
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5105_UDataSet mt_papinout_5105_u(MT_PAPINOUT_5105_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5105_UDataSet ds = (MT_PAPINOUT_5105_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 파지매각대금 삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5106_DDataSet mt_papinout_5106_d(MT_PAPINOUT_5106_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5106_DDataSet ds = (MT_PAPINOUT_5106_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지수입결의 신청
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5107_ADataSet mt_papinout_5107_a(MT_PAPINOUT_5107_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5107_ADataSet ds = (MT_PAPINOUT_5107_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지수입결의 취소
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5108_ADataSet mt_papinout_5108_a(MT_PAPINOUT_5108_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5108_ADataSet ds = (MT_PAPINOUT_5108_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지단가관리 저장,수정,삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5200_ADataSet mt_papinout_5200_a(MT_PAPINOUT_5200_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5200_ADataSet ds = (MT_PAPINOUT_5200_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 파지단가관리 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5201_LDataSet mt_papinout_5201_l(MT_PAPINOUT_5201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5201_LDataSet ds = (MT_PAPINOUT_5201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 파율조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5300_LDataSet mt_papinout_5300_l(MT_PAPINOUT_5300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5300_LDataSet ds = (MT_PAPINOUT_5300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 상세조회 - 동적그리드 생성
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5400_LDataSet mt_papinout_5400_l(MT_PAPINOUT_5400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5400_LDataSet ds = (MT_PAPINOUT_5400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 상세조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPINOUT_5401_LDataSet mt_papinout_5401_l(MT_PAPINOUT_5401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPINOUT_5401_LDataSet ds = (MT_PAPINOUT_5401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}