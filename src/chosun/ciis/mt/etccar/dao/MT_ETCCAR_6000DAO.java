package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_6000DAO {
	
	// 유뷰비단가 조회 
	public MT_ETCCAR_6000_LDataSet mt_etccar_6000_l(MT_ETCCAR_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_6000_LDataSet ds = (MT_ETCCAR_6000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 유류비단가 등록/삭제
	public MT_ETCCAR_6001_ADataSet mt_etccar_6001_a(MT_ETCCAR_6001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
System.out.println(" DAO call ");		
		MT_ETCCAR_6001_ADataSet ds = (MT_ETCCAR_6001_ADataSet)manager.executeCall(dm);
System.out.println(" DAO call end ");	
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}