/***************************************************************************************************
* 파일명 : SE_ETC_1400DAO.java
* 기능 : 판매 - 기타관리 - 리스트
* 작성일자 : 2009-08-21
* 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.SE_ETC_1400_MDM;
import chosun.ciis.se.etc.ds.SE_ETC_1400_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1400DAO {
	
	public SE_ETC_1400_MDataSet se_etc_1400_m(SE_ETC_1400_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1400_MDataSet ds 	= (SE_ETC_1400_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
