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
  
public class MT_CLOSE_2000DAO { 
    
    /**
     * 필름기준정보관리 화면 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_2000_LDataSet mt_close_2000_l(MT_CLOSE_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_2000_LDataSet ds = (MT_CLOSE_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    /**
     * 필름기준정보관리 화면의 콤보 셋팅
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_2001_LDataSet mt_close_2001_l(MT_CLOSE_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_2001_LDataSet ds = (MT_CLOSE_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_CLOSE_2002_LDataSet mt_close_2002_l(MT_CLOSE_2002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_2002_LDataSet ds = (MT_CLOSE_2002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
