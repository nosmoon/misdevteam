package chosun.ciis.mt.etcpc.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

public class MT_ETCPC_2000DAO {
	
	
	public MT_ETCPC_2001_MDataSet mt_etcpc_2001_m(MT_ETCPC_2001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2001_MDataSet ds = (MT_ETCPC_2001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_ETCPC_2002_MDataSet mt_etcpc_2002_m(MT_ETCPC_2002_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2002_MDataSet ds = (MT_ETCPC_2002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_ETCPC_2003_LDataSet mt_etcpc_2003_l(MT_ETCPC_2003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2003_LDataSet ds = (MT_ETCPC_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 기기등록 조회
	public MT_ETCPC_2000_LDataSet mt_etcpc_2000_l(MT_ETCPC_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2000_LDataSet ds = (MT_ETCPC_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// 기기등록,수정,삭제
	public MT_ETCPC_2103_ADataSet mt_etcpc_2103_a(MT_ETCPC_2103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2103_ADataSet ds = (MT_ETCPC_2103_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			System.out.println("##getErrcode : " + ds.getErrcode());
			System.out.println("##getErrmsg : " + ds.getErrmsg());
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 기기등록 H/W 조회
	public MT_ETCPC_2200_LDataSet mt_etcpc_2200_l(MT_ETCPC_2200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2200_LDataSet ds = (MT_ETCPC_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// 기기등록 H/W 등록/수정/삭제
	public MT_ETCPC_2201_ADataSet mt_etcpc_2201_a(MT_ETCPC_2201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2201_ADataSet ds = (MT_ETCPC_2201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 기기등록 S/W 조회 및 설치라이센스 , 보유라이센스
	public MT_ETCPC_2300_LDataSet mt_etcpc_2300_l(MT_ETCPC_2300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2300_LDataSet ds = (MT_ETCPC_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 기기등록 S/W 저장/삭제
	public MT_ETCPC_2301_ADataSet mt_etcpc_2301_a(MT_ETCPC_2301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCPC_2301_ADataSet ds = (MT_ETCPC_2301_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}