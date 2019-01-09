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
  
public class MT_CLOSE_1000DAO { 
    
    /**
     * 필름기준정보관리 화면 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_1000_LDataSet mt_close_1000_l(MT_CLOSE_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_1000_LDataSet ds = (MT_CLOSE_1000_LDataSet)manager.executeCall(dm);

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
	public MT_CLOSE_1001_LDataSet mt_close_1001_l(MT_CLOSE_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_1001_LDataSet ds = (MT_CLOSE_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    /**
     * 필름기준정보관리 입력 및 삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_1002_ADataSet mt_close_1002_a(MT_CLOSE_1002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_1002_ADataSet ds = (MT_CLOSE_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
