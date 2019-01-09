/***************************************************************************************************
 * 파일명 : SSExtn5100DAO.java
 * 기능 : 기업후원확장-직원수당 지급준비
 * 작성일자 : 2016-10-04
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
public class SSExtn5100DAO {
		
    public SS_SLS_EXTN_5110_LDataSet selectExtn5110(SS_SLS_EXTN_5110_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5110_LDataSet ds = (SS_SLS_EXTN_5110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5120_LDataSet selectExtn5120(SS_SLS_EXTN_5120_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5120_LDataSet ds = (SS_SLS_EXTN_5120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
   
    public SS_SLS_EXTN_5130_UDataSet updateExtn5130(SS_SLS_EXTN_5130_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5130_UDataSet ds = (SS_SLS_EXTN_5130_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }          
}    