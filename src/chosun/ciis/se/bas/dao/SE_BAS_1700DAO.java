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

package chosun.ciis.se.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */
public class SE_BAS_1700DAO {
	
	public SE_BAS_1700_MDataSet se_bas_1700_m(SE_BAS_1700_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1700_MDataSet ds 	= (SE_BAS_1700_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_BAS_1710_LDataSet se_bas_1710_l(SE_BAS_1710_LDM dm) throws AppException {

        
    	DBManager manager 			= new DBManager("MISSEL");
    	SE_BAS_1710_LDataSet ds 	= (SE_BAS_1710_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SE_BAS_1720_ADataSet se_bas_1720_a(SE_BAS_1720_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1720_ADataSet ds 	= (SE_BAS_1720_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode=" + ds.getErrcode());
        	System.out.println("errorMsg=" + ds.getErrmsg());
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
