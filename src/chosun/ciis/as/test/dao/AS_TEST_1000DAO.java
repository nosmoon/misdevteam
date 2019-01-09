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

package chosun.ciis.as.test.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

//import chosun.ciis.mt.commatr.dm.MT_COMMATR_4003_ADM;
import chosun.ciis.as.test.dm.*;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_4003_ADataSet;
import chosun.ciis.as.test.ds.*;
/**
 * 
 */
public class AS_TEST_1000DAO {
	
	public AS_TEST_1000_MDataSet as_test_1000_m(AS_TEST_1000_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISAST");
        AS_TEST_1000_MDataSet ds 	= (AS_TEST_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
	public AS_TEST_1001_MDataSet as_test_1001_m(AS_TEST_1001_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISAST");
        AS_TEST_1001_MDataSet ds 	= (AS_TEST_1001_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
    public AS_TEST_1002_LDataSet as_test_1002_l(AS_TEST_1002_LDM dm) throws AppException {

         
        DBManager manager 			= new DBManager("MISAST");
        AS_TEST_1002_LDataSet ds 	= (AS_TEST_1002_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /*
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
