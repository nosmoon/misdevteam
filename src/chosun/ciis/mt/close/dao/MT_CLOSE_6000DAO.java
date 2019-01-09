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
  
public class MT_CLOSE_6000DAO { 
    
    /**
     * 제작비 화면 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_6010_LDataSet mt_close_6010_l(MT_CLOSE_6010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_6010_LDataSet ds = (MT_CLOSE_6010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    public MT_CLOSE_6020_ADataSet mt_close_6020_a(MT_CLOSE_6020_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_CLOSE_6020_ADataSet ds 	= (MT_CLOSE_6020_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 필름기준정보관리 입력 및 삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_8002_LDataSet mt_close_8002_l(MT_CLOSE_8002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_8002_LDataSet ds = (MT_CLOSE_8002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
/*	
	public MT_CLOSE_8002_ADataSet getMt_Close_8002(MT_CLOSE_8002_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_CLOSE_8002_ADataSet ds = (MT_CLOSE_8002_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("MT_CLOSE_8002_DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
*/
	public MT_CLOSE_8003_LDataSet mt_close_8003_l(MT_CLOSE_8003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_8003_LDataSet ds = (MT_CLOSE_8003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_8004_LDataSet mt_close_8004_l(MT_CLOSE_8004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_8004_LDataSet ds = (MT_CLOSE_8004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_CLOSE_8005_LDataSet mt_close_8005_l(MT_CLOSE_8005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_CLOSE_8005_LDataSet ds = (MT_CLOSE_8005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
