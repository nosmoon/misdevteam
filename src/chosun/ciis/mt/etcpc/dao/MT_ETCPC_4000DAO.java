package chosun.ciis.mt.etcpc.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

public class MT_ETCPC_4000DAO {
	// 전산기기 사용내역
	public MT_ETCPC_4100_LDataSet mt_etcpc_4100_l(MT_ETCPC_4100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_4100_LDataSet ds = (MT_ETCPC_4100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 설치 s/w 팝업
	public MT_ETCPC_4201_MDataSet mt_etcpc_4201_m(MT_ETCPC_4201_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_4201_MDataSet ds = (MT_ETCPC_4201_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 소프트웨어 사용내역 조회
	public MT_ETCPC_4200_LDataSet mt_etcpc_4200_l(MT_ETCPC_4200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_4200_LDataSet ds = (MT_ETCPC_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}