/***************************************************************************************************
* 파일명 : SE_BAS_1200DAO.java
* 기능 :  판매 - 기준정보 - 매체단가관리
 * 작성일자 : 2009.02.21
 * 작성자 :   이민효
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.mt.papinout.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1100_MDM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1110_LDM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1120_ADM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1130_LDM;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1100_MDataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1110_LDataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1120_ADataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1130_LDataSet;

/**
 * 
 */
public class MT_PAPINOUT_1100DAO {
	
	public MT_PAPINOUT_1100_MDataSet mt_papinout_1100_m(MT_PAPINOUT_1100_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_PAPINOUT_1100_MDataSet ds 	= (MT_PAPINOUT_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public MT_PAPINOUT_1110_LDataSet mt_papinout_1110_l(MT_PAPINOUT_1110_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_PAPINOUT_1110_LDataSet ds 	= (MT_PAPINOUT_1110_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public MT_PAPINOUT_1120_ADataSet mt_papinout_1120_a(MT_PAPINOUT_1120_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_PAPINOUT_1120_ADataSet ds 	= (MT_PAPINOUT_1120_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public MT_PAPINOUT_1130_LDataSet mt_papinout_1130_l(MT_PAPINOUT_1130_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_PAPINOUT_1130_LDataSet ds 	= (MT_PAPINOUT_1130_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /*
    public SE_BAS_1002DataSet getCodeList(SE_BAS_1002DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1002DataSet ds = (SE_BAS_1002DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1010DataSet insUpdDel(SE_BAS_1010DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1010DataSet ds = (SE_BAS_1010DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1020DataSet multiUpdate(SE_BAS_1020DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1020DataSet ds = (SE_BAS_1020DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    */
    
}
