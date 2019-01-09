/***************************************************************************************************
* 파일명 : SE_ETC_1300DAO.java
* 기능 : 판매 - 기타관리 - 지국자체유가조회
* 작성일자 : 2009-05-26
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.SE_ETC_1500_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1510_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1520_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1530_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1340_ADM;
//import chosun.ciis.se.etc.ds.SE_ETC_1500_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1510_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1520_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1530_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1340_ADataSet;
import chosun.ciis.se.etc.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1500DAO {
	
	public SE_ETC_1500_MDataSet se_etc_1500_m(SE_ETC_1500_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1500_MDataSet ds 	= (SE_ETC_1500_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1510_LDataSet se_etc_1510_l(SE_ETC_1510_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1510_LDataSet ds 	= (SE_ETC_1510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	public SE_ETC_1520_ADataSet se_etc_1520_a(SE_ETC_1520_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1520_ADataSet ds 	= (SE_ETC_1520_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
		
	public SE_ETC_1530_ADataSet se_etc_1530_a(SE_ETC_1530_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1530_ADataSet ds 	= (SE_ETC_1530_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/*
	public SE_ETC_1340_ADataSet se_etc_1340_a(SE_ETC_1340_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1340_ADataSet ds 	= (SE_ETC_1340_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }*/
}
