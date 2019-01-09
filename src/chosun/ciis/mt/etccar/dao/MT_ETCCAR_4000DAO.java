package chosun.ciis.mt.etccar.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

public class MT_ETCCAR_4000DAO {
	// 차량소모품 관리 콤보
	public MT_ETCCAR_4101_MDataSet mt_etccar_4101_m(MT_ETCCAR_4101_MDM dm) throws AppException {
		
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4101_MDataSet ds = (MT_ETCCAR_4101_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 차량소모품 관리 조회 
	public MT_ETCCAR_4100_LDataSet mt_etccar_4100_l(MT_ETCCAR_4100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4100_LDataSet ds = (MT_ETCCAR_4100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 차량소모품 관리 등록/수정/삭제
	public MT_ETCCAR_4102_ADataSet mt_etccar_4102_a(MT_ETCCAR_4102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4102_ADataSet ds = (MT_ETCCAR_4102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// 차량소모품 관리 콤보
	public MT_ETCCAR_4103_MDataSet mt_etccar_4103_m(MT_ETCCAR_4103_MDM dm) throws AppException {
		
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4103_MDataSet ds = (MT_ETCCAR_4103_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 차량소모품 관리 조회
	public MT_ETCCAR_4200_LDataSet mt_etccar_4200_l(MT_ETCCAR_4200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4200_LDataSet ds = (MT_ETCCAR_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}