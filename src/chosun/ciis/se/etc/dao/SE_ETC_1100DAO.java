/***************************************************************************************************
* 파일명 : SE_ETC_1100DAO.java
* 기능 : 판매-기타관리-확장수당 지급내역 조회
* 작성일자 : 2009-03-04
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.SE_ETC_1100_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1110_LDM;
import chosun.ciis.se.etc.ds.SE_ETC_1100_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1110_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1100DAO {
	
	public SE_ETC_1100_MDataSet se_etc_1100_m(SE_ETC_1100_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1100_MDataSet ds 	= (SE_ETC_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_ETC_1110_LDataSet se_etc_1110_l(SE_ETC_1110_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1110_LDataSet ds 	= (SE_ETC_1110_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
