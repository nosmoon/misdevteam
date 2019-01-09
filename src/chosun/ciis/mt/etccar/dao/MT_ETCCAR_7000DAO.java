package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_7000DAO {
	
	// 차량마감 조회 
	public MT_ETCCAR_7001_LDataSet mt_etccar_7001_l(MT_ETCCAR_7001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_7001_LDataSet ds = (MT_ETCCAR_7001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 차량마감 등록/삭제
	public MT_ETCCAR_7002_ADataSet mt_etccar_7002_a(MT_ETCCAR_7002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_7002_ADataSet ds = (MT_ETCCAR_7002_ADataSet)manager.executeCall(dm);
	    if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}