package chosun.ciis.mt.etcpc.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

public class MT_ETCPC_1000DAO {
	public MT_ETCPC_1101_MDataSet mt_etcpc_1101_m(MT_ETCPC_1101_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1101_MDataSet ds = (MT_ETCPC_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public MT_ETCPC_1100_LDataSet mt_etcpc_1100_l(MT_ETCPC_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1100_LDataSet ds = (MT_ETCPC_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCPC_1105_ADataSet mt_etcpc_1105_a(MT_ETCPC_1105_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
	
		MT_ETCPC_1105_ADataSet ds = (MT_ETCPC_1105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public MT_ETCPC_1201_MDataSet mt_etcpc_1201_m(MT_ETCPC_1201_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1201_MDataSet ds = (MT_ETCPC_1201_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_ETCPC_1200_LDataSet mt_etcpc_1200_l(MT_ETCPC_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1200_LDataSet ds = (MT_ETCPC_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_ETCPC_1202_ADataSet mt_etcpc_1202_a(MT_ETCPC_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		
		MT_ETCPC_1202_ADataSet ds = (MT_ETCPC_1202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_ETCPC_1203_MDataSet mt_etcpc_1203_m(MT_ETCPC_1203_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1203_MDataSet ds = (MT_ETCPC_1203_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 모델별 구매등록 품목종류 콤보
	public MT_ETCPC_1301_MDataSet mt_etcpc_1301_m(MT_ETCPC_1301_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		
		MT_ETCPC_1301_MDataSet ds = (MT_ETCPC_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	//모델별 구매등록 사용처 콤보
	public MT_ETCPC_1302_MDataSet mt_etcpc_1302_m(MT_ETCPC_1302_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1302_MDataSet ds = (MT_ETCPC_1302_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 모델별 구매등록 조회
	public MT_ETCPC_1303_LDataSet mt_etcpc_1303_l(MT_ETCPC_1303_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1303_LDataSet ds = (MT_ETCPC_1303_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 모델별 구매등록 저장/수정/삭제
	public MT_ETCPC_1304_ADataSet mt_etcpc_1304_a(MT_ETCPC_1304_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1304_ADataSet ds = (MT_ETCPC_1304_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 부서코드입력시 부서명 조회
	public MT_ETCPC_1305_MDataSet mt_etcpc_1305_m(MT_ETCPC_1305_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_1305_MDataSet ds = (MT_ETCPC_1305_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}