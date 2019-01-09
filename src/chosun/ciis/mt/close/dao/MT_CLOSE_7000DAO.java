package chosun.ciis.mt.close.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */   
  
public class MT_CLOSE_7000DAO { 
    
    /**
     * 월마감기준관리 조회
     * @param dm
     * @return
     * @throws AppException
     */

	public MT_CLOSE_7000_LDataSet mt_close_7000_l(MT_CLOSE_7000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_7000_LDataSet ds = (MT_CLOSE_7000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    /**
     * 월마감기준관리 입력,수정,삭제
     * @param dm
     * @return
     * @throws AppException
     */
	
	public MT_CLOSE_7001_LDataSet mt_close_7001_l(MT_CLOSE_7001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_7001_LDataSet ds = (MT_CLOSE_7001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_7002_LDataSet mt_close_7002_l(MT_CLOSE_7002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_7002_LDataSet ds = (MT_CLOSE_7002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_7003_LDataSet mt_close_7003_l(MT_CLOSE_7003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_7003_LDataSet ds = (MT_CLOSE_7003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_7004_LDataSet mt_close_7004_l(MT_CLOSE_7004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_7004_LDataSet ds = (MT_CLOSE_7004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_7005_LDataSet mt_close_7005_l(MT_CLOSE_7005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_7005_LDataSet ds = (MT_CLOSE_7005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
