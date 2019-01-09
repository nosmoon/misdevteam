/***************************************************************************************************
 * 파일명 : SSExtn4700DAO.java
 * 기능 : 기업후원확장-기업배정내역
 * 작성일자 : 2016-03-28
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * DAO
 */
public class SSExtn4800DAO {
		
	public SS_SLS_EXTN_4800_ADataSet initExtn4800(SS_SLS_EXTN_4800_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4800_ADataSet ds = (SS_SLS_EXTN_4800_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_4810_LDataSet selectExtn4810(SS_SLS_EXTN_4810_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4810_LDataSet ds = (SS_SLS_EXTN_4810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_4820_UDataSet updateExtn4820(SS_SLS_EXTN_4820_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4820_UDataSet ds = (SS_SLS_EXTN_4820_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public SS_SLS_EXTN_4830_LDataSet selectExtn4830(SS_SLS_EXTN_4830_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4830_LDataSet ds = (SS_SLS_EXTN_4830_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4840_UDataSet updateExtn4840(SS_SLS_EXTN_4840_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4840_UDataSet ds = (SS_SLS_EXTN_4840_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public SS_SLS_EXTN_4850_UDataSet updateExtn4850(SS_SLS_EXTN_4850_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4850_UDataSet ds = (SS_SLS_EXTN_4850_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
}    