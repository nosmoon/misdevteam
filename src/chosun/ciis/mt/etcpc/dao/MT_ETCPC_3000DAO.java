package chosun.ciis.mt.etcpc.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

public class MT_ETCPC_3000DAO {
	// S/W 라이센스 팝업 조회
	public MT_ETCPC_3001_MDataSet mt_etcpc_3001_m(MT_ETCPC_3001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3001_MDataSet ds = (MT_ETCPC_3001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//S/W 라이센스 조회
	public MT_ETCPC_3000_LDataSet mt_etcpc_3000_l(MT_ETCPC_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3000_LDataSet ds = (MT_ETCPC_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	 // S/W 라이센스 입력/수정/삭제
	public MT_ETCPC_3002_ADataSet mt_etcpc_3002_a(MT_ETCPC_3002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3002_ADataSet ds = (MT_ETCPC_3002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {			
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//S/W 라이센스 S/W명 콤보 조회
	public MT_ETCPC_3003_MDataSet mt_etcpc_3003_m(MT_ETCPC_3003_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_3003_MDataSet ds = (MT_ETCPC_3003_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}