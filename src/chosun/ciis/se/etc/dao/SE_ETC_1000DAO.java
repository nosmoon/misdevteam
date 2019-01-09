/***************************************************************************************************
* 파일명 : SE_ETC_1000DAO.java
* 기능 : 판매-기타관리-확장수당등록
* 작성일자 : 2009-03-02
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.SE_ETC_1000_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1010_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1020_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1030_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1040_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1050_UDM;
import chosun.ciis.se.etc.dm.SE_ETC_1060_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1070_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1090_ADM;
import chosun.ciis.se.etc.ds.SE_ETC_1000_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1010_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1020_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1030_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1040_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1050_UDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1060_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1070_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1090_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1000DAO {
	
	public SE_ETC_1000_MDataSet se_etc_1000_m(SE_ETC_1000_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1000_MDataSet ds 	= (SE_ETC_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1010_LDataSet se_etc_1010_l(SE_ETC_1010_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1010_LDataSet ds 	= (SE_ETC_1010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1020_LDataSet se_etc_1020_l(SE_ETC_1020_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1020_LDataSet ds 	= (SE_ETC_1020_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1030_LDataSet se_etc_1030_l(SE_ETC_1030_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1030_LDataSet ds 	= (SE_ETC_1030_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1040_ADataSet se_etc_1040_a(SE_ETC_1040_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1040_ADataSet ds 	= (SE_ETC_1040_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1050_UDataSet se_etc_1050_u(SE_ETC_1050_UDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1050_UDataSet ds 	= (SE_ETC_1050_UDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1060_ADataSet se_etc_1060_a(SE_ETC_1060_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1060_ADataSet ds 	= (SE_ETC_1060_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1070_ADataSet se_etc_1070_a(SE_ETC_1070_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1070_ADataSet ds 	= (SE_ETC_1070_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SE_ETC_1090_ADataSet se_etc_1090_a(SE_ETC_1090_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1090_ADataSet ds 	= (SE_ETC_1090_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
