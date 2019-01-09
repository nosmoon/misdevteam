package chosun.ciis.mt.close.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */   
  
public class MT_CLOSE_6100DAO { 
    
    /**
     * 제작비 화면 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_6100_MDataSet mt_close_6100_m(MT_CLOSE_6100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_6100_MDataSet ds = (MT_CLOSE_6100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_6110_LDataSet mt_close_6110_l(MT_CLOSE_6110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_6110_LDataSet ds = (MT_CLOSE_6110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_6120_LDataSet mt_close_6120_l(MT_CLOSE_6120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_6120_LDataSet ds = (MT_CLOSE_6120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_6130_LDataSet mt_close_6130_l(MT_CLOSE_6130_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_6130_LDataSet ds = (MT_CLOSE_6130_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
