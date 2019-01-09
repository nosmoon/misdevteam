/***************************************************************************************************
 * 파일명 : SSExtn5000DAO.java
 * 기능 : 기업후원확장-확장자 배정
 * 작성일자 : 2016-06-20
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
public class SSExtn5000DAO {
	
	public SS_SLS_EXTN_5000_ADataSet initExtn5000(SS_SLS_EXTN_5000_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5000_ADataSet ds = (SS_SLS_EXTN_5000_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SS_SLS_EXTN_5010_LDataSet selectExtn5010(SS_SLS_EXTN_5010_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5010_LDataSet ds = (SS_SLS_EXTN_5010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_5020_LDataSet selectExtn5020(SS_SLS_EXTN_5020_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5020_LDataSet ds = (SS_SLS_EXTN_5020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public SS_SLS_EXTN_5030_IDataSet updateExtn5030(SS_SLS_EXTN_5030_IDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5030_IDataSet ds = (SS_SLS_EXTN_5030_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    
    public SS_SLS_EXTN_5040_LDataSet excelExtn5040(SS_SLS_EXTN_5040_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5040_LDataSet ds = (SS_SLS_EXTN_5040_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
}    