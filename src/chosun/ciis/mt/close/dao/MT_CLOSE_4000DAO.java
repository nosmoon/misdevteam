package chosun.ciis.mt.close.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */   
  
public class MT_CLOSE_4000DAO { 
    
    /**
     * 월마감기준관리 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_4000_LDataSet getMt_Close_4000(MT_CLOSE_4000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_CLOSE_4000_LDataSet ds = (MT_CLOSE_4000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("MT_CLOSE_4000_DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    /**
     * 월마감기준관리 입력,수정,삭제
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_CLOSE_4001_ADataSet getMt_Close_4001(MT_CLOSE_4001_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_CLOSE_4001_ADataSet ds = (MT_CLOSE_4001_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("MT_CLOSE_4001_DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

}
