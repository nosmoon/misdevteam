/***************************************************************************************************
* 파일명 : SE_ETC_1700DAO.java
* 기능 : 판매-기타관리-무료구독체험배달비
* 작성일자 : 2013-07-15
* 작성자 : 봉은정
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1700DAO {
	
	public SE_ETC_1700_MDataSet se_etc_1700_m(SE_ETC_1700_MDM dm) throws AppException {
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1700_MDataSet ds 	= (SE_ETC_1700_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1710_LDataSet se_etc_1710_l(SE_ETC_1710_LDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1710_LDataSet ds 	= (SE_ETC_1710_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1720_LDataSet se_etc_1720_l(SE_ETC_1720_LDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1720_LDataSet ds 	= (SE_ETC_1720_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1730_LDataSet se_etc_1730_l(SE_ETC_1730_LDM dm) throws AppException {
  
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1730_LDataSet ds 	= (SE_ETC_1730_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1740_ADataSet se_etc_1740_a(SE_ETC_1740_ADM dm) throws AppException {
  
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1740_ADataSet ds 	= (SE_ETC_1740_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1750_UDataSet se_etc_1750_u(SE_ETC_1750_UDM dm) throws AppException {
  
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1750_UDataSet ds 	= (SE_ETC_1750_UDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1760_ADataSet se_etc_1760_a(SE_ETC_1760_ADM dm) throws AppException {
     
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1760_ADataSet ds 	= (SE_ETC_1760_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1770_ADataSet se_etc_1770_a(SE_ETC_1770_ADM dm) throws AppException {
   
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1770_ADataSet ds 	= (SE_ETC_1770_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SE_ETC_1790_ADataSet se_etc_1790_a(SE_ETC_1790_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1790_ADataSet ds 	= (SE_ETC_1790_ADataSet) manager.executeCall(dm);
        System.out.println("bong.dao");
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
