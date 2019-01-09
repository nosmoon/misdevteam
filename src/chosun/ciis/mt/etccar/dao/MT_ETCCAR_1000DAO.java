package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_1000DAO {
	// 차량운행내역등록 조회
	public MT_ETCCAR_1000_LDataSet mt_etccar_1000_l(MT_ETCCAR_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1000_LDataSet ds = (MT_ETCCAR_1000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 차량운행내역등록 입력/삭제
	public MT_ETCCAR_1001_ADataSet mt_etccar_1001_a(MT_ETCCAR_1001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
	
		MT_ETCCAR_1001_ADataSet ds = (MT_ETCCAR_1001_ADataSet)manager.executeCall(dm);
	
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// 차량운행내역등록 차량번호명 가져오기
	public MT_ETCCAR_1002_MDataSet mt_etccar_1002_m(MT_ETCCAR_1002_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1002_MDataSet ds = (MT_ETCCAR_1002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public MT_ETCCAR_1003_LDataSet mt_etccar_1003_l(MT_ETCCAR_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1003_LDataSet ds = (MT_ETCCAR_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCCAR_1004_ADataSet mt_etccar_1004_a(MT_ETCCAR_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1004_ADataSet ds = (MT_ETCCAR_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_ETCCAR_1005_LDataSet mt_etccar_1005_l(MT_ETCCAR_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1005_LDataSet ds = (MT_ETCCAR_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	// 차량관리 콤보세팅 
	public MT_ETCCAR_1100_MDataSet mt_etccar_1100_m(MT_ETCCAR_1100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1100_MDataSet ds = (MT_ETCCAR_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}