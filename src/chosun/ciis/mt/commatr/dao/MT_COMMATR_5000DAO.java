/***************************************************************************************************
* 파일명 : MT_COMMATR_5000DAO.java
* 기능 :  자재-장표-장표환경설정
 * 작성일자 : 2010.04.08
 * 작성자 :   이민효
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.mt.commatr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

//import chosun.ciis.mt.commatr.dm.MT_COMMATR_4003_ADM;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_5000_MDM;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_5010_LDM;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_5020_ADM;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_5030_LDM;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_5040_ADM;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_4003_ADataSet;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_5000_MDataSet;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_5010_LDataSet;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_5020_ADataSet;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_5030_LDataSet;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_5040_ADataSet;

/**
 * 
 */
public class MT_COMMATR_5000DAO {
	
	public MT_COMMATR_5000_MDataSet mt_commatr_5000_m(MT_COMMATR_5000_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_5000_MDataSet ds 	= (MT_COMMATR_5000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
    public MT_COMMATR_5010_LDataSet mt_commatr_5010_l(MT_COMMATR_5010_LDM dm) throws AppException {

         
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_5010_LDataSet ds 	= (MT_COMMATR_5010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public MT_COMMATR_5020_ADataSet mt_commatr_5020_a(MT_COMMATR_5020_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_5020_ADataSet ds 	= (MT_COMMATR_5020_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public MT_COMMATR_5030_LDataSet mt_commatr_5030_l(MT_COMMATR_5030_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_5030_LDataSet ds 	= (MT_COMMATR_5030_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public MT_COMMATR_5040_ADataSet mt_commatr_5040_a(MT_COMMATR_5040_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISMAT");
        MT_COMMATR_5040_ADataSet ds 	= (MT_COMMATR_5040_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
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
