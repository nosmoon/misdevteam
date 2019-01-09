/***************************************************************************************************
 * 파일명 : SSExtn5200DAO.java
 * 기능 : 기업후원확장-직원수당 지급처리
 * 작성일자 : 2016-10-05
 * 작성자 : 심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;



/**
 * DAO
 */
public class SSExtn5200DAO {
		
    public SS_SLS_EXTN_5210_LDataSet selectExtn5210(SS_SLS_EXTN_5210_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5210_LDataSet ds = (SS_SLS_EXTN_5210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5220_UDataSet updateExtn5220(SS_SLS_EXTN_5220_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5220_UDataSet ds = (SS_SLS_EXTN_5220_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_5230_UDataSet updateExtn5230(SS_SLS_EXTN_5230_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5230_UDataSet ds = (SS_SLS_EXTN_5230_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}    