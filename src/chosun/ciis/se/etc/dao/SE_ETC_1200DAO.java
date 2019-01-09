/***************************************************************************************************
* 파일명 : SE_ETC_1200DAO.java
* 기능 : 판매-기타관리-구독료 지급등록
* 작성일자 : 2009-03-05
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.SE_ETC_1200_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1210_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1220_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1230_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1240_UDM;
import chosun.ciis.se.etc.ds.SE_ETC_1200_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1210_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1220_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1230_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1240_UDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1200DAO {
	
	public SE_ETC_1200_MDataSet se_etc_1200_m(SE_ETC_1200_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1200_MDataSet ds 	= (SE_ETC_1200_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1210_LDataSet se_etc_1210_l(SE_ETC_1210_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1210_LDataSet ds 	= (SE_ETC_1210_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1220_LDataSet se_etc_1220_l(SE_ETC_1220_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1220_LDataSet ds 	= (SE_ETC_1220_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1230_ADataSet se_etc_1230_a(SE_ETC_1230_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1230_ADataSet ds 	= (SE_ETC_1230_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1240_UDataSet se_etc_1240_u(SE_ETC_1240_UDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1240_UDataSet ds 	= (SE_ETC_1240_UDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
