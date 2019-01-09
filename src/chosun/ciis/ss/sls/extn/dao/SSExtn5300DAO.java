/***************************************************************************************************
 * 파일명 : SSExtn5300DAO.java
 * 기능 : 기업후원확장-구독배정내역(제휴)
 * 작성일자 : 2017-10-11
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
public class SSExtn5300DAO {
		
	public SS_SLS_EXTN_5300_ADataSet initExtn5300(SS_SLS_EXTN_5300_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5300_ADataSet ds = (SS_SLS_EXTN_5300_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5310_LDataSet selectExtn5310(SS_SLS_EXTN_5310_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5310_LDataSet ds = (SS_SLS_EXTN_5310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5320_UDataSet updateExtn5320(SS_SLS_EXTN_5320_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5320_UDataSet ds = (SS_SLS_EXTN_5320_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public SS_SLS_EXTN_5330_LDataSet selectExtn5330(SS_SLS_EXTN_5330_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5330_LDataSet ds = (SS_SLS_EXTN_5330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_5340_UDataSet updateExtn5340(SS_SLS_EXTN_5340_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5340_UDataSet ds = (SS_SLS_EXTN_5340_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
}    