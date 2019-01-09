package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_2000DAO {
	
	//차량운행및급유내역 조회 
	public MT_ETCCAR_2000_LDataSet mt_etccar_2000_l(MT_ETCCAR_2000_LDM dm) throws AppException {
			DBManager manager = new DBManager("MISMAT");
			MT_ETCCAR_2000_LDataSet ds = (MT_ETCCAR_2000_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			return ds;
		}
	
}