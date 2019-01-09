package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_3000DAO {
	
	// 차량정비내역 등록  조
	public MT_ETCCAR_3000_LDataSet mt_etccar_3000_l(MT_ETCCAR_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_3000_LDataSet ds = (MT_ETCCAR_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 차량정비내역 등록 
	public MT_ETCCAR_3001_ADataSet mt_etccar_3001_a(MT_ETCCAR_3001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_3001_ADataSet ds = (MT_ETCCAR_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}