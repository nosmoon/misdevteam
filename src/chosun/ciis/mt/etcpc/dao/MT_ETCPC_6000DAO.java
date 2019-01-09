package chosun.ciis.mt.etcpc.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

public class MT_ETCPC_6000DAO {
	// ��/���ó �����Ȳ ��ȸ
	public MT_ETCPC_6000_LDataSet mt_etcpc_6000_l(MT_ETCPC_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
System.out.println("DAO a");		
		MT_ETCPC_6000_LDataSet ds = (MT_ETCPC_6000_LDataSet)manager.executeCall(dm);
		System.out.println("DAO b");
		if(!ds.getErrcode().equals("")) {
			System.out.println("DAO error");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}