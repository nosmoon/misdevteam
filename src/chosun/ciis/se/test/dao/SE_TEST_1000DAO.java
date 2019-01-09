/***************************************************************************************************
 * 파일명 : SE_TRG_1000DAO.java
 * 기능 : 지역별 목표등록
 * 작성일자 : 2009-03-20
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.test.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.test.dm.*;
import chosun.ciis.se.test.ds.*;
import chosun.ciis.se.test.dm.SE_TEST_1010_LDM;
import chosun.ciis.se.test.ds.SE_TEST_1010_LDataSet;
/**
 * 
 */
public class SE_TEST_1000DAO {	
	
	public SE_TEST_1010_LDataSet se_test_1010_l(SE_TEST_1010_LDM dm) throws AppException {
        DBManager manager 			= new DBManager("MISSEL");
        SE_TEST_1010_LDataSet ds 	= (SE_TEST_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_TEST_1020_LDataSet se_test_1020_l(SE_TEST_1020_LDM dm) throws AppException {
        DBManager manager 			= new DBManager("MISSEL");
        SE_TEST_1020_LDataSet ds 	= (SE_TEST_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_TEST_1000_ADataSet se_test_1000_a(SE_TEST_1000_ADM dm) throws AppException {
        DBManager manager 			= new DBManager("MISSEL");
        SE_TEST_1000_ADataSet ds 	= (SE_TEST_1000_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_TEST_1040_DDataSet se_test_1040_d(SE_TEST_1040_DDM dm) throws AppException {
        DBManager manager 			= new DBManager("MISSEL");
        SE_TEST_1040_DDataSet ds 	= (SE_TEST_1040_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_TEST_1050_LDataSet se_test_1050_l(SE_TEST_1050_LDM dm) throws AppException {
        DBManager manager 			= new DBManager("MISSEL");
        SE_TEST_1050_LDataSet ds 	= (SE_TEST_1050_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
