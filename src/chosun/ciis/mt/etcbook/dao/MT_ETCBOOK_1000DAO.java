package chosun.ciis.mt.etcbook.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

public class MT_ETCBOOK_1000DAO {
	// 도서청구 조회
	public MT_ETCBOOK_1100_LDataSet mt_etcbook_1100_l(MT_ETCBOOK_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1100_LDataSet ds = (MT_ETCBOOK_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// 도서관리조회
	public MT_ETCBOOK_1300_LDataSet mt_etcbook_1300_l(MT_ETCBOOK_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1300_LDataSet ds = (MT_ETCBOOK_1300_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_ETCBOOK_1101_LDataSet mt_etcbook_1101_l(MT_ETCBOOK_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1101_LDataSet ds = (MT_ETCBOOK_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 통화구분Combo
	public MT_ETCBOOK_1102_MDataSet mt_etcbook_1102_m(MT_ETCBOOK_1102_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1102_MDataSet ds = (MT_ETCBOOK_1102_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//구입처 Combo
	public MT_ETCBOOK_1103_MDataSet mt_etcbook_1103_m(MT_ETCBOOK_1103_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1103_MDataSet ds = (MT_ETCBOOK_1103_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 도서청구 입력/
	public MT_ETCBOOK_1104_ADataSet mt_etcbook_1104_a(MT_ETCBOOK_1104_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1104_ADataSet ds = (MT_ETCBOOK_1104_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		return ds;
	}
	
	// 도서관리 수정/
	public MT_ETCBOOK_1201_ADataSet mt_etcbook_1201_a(MT_ETCBOOK_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_1201_ADataSet ds = (MT_ETCBOOK_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
