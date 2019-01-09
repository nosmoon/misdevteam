package chosun.ciis.mt.etcbook.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;


import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

public class MT_ETCBOOK_2000DAO {
	// 도서코드내역 콤보 
	public MT_ETCBOOK_2001_MDataSet mt_etcbook_2001_m(MT_ETCBOOK_2001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_2001_MDataSet ds = (MT_ETCBOOK_2001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 도서코드내역 조회
	public MT_ETCBOOK_2000_LDataSet mt_etcbook_2000_l(MT_ETCBOOK_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_2000_LDataSet ds = (MT_ETCBOOK_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 도서코드내역 등록/수정/삭제
	public MT_ETCBOOK_2002_ADataSet mt_etcbook_2002_a(MT_ETCBOOK_2002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
System.out.println("DAO 1");		
		MT_ETCBOOK_2002_ADataSet ds = (MT_ETCBOOK_2002_ADataSet)manager.executeCall(dm);
System.out.println("DAO 2");
		if(!ds.getErrcode().equals("")) {
System.out.println("DAO error");			
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
