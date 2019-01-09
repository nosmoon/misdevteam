/***************************************************************************************************
 * 파일명 : SSExtn4900DAO.java
 * 기능 : 기업후원확장-기업확장실적입력
 * 작성일자 : 2016-06-15
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
public class SSExtn4900DAO {
	
	public SS_SLS_EXTN_4900_ADataSet initExtn4900(SS_SLS_EXTN_4900_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4900_ADataSet ds = (SS_SLS_EXTN_4900_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SS_SLS_EXTN_4901_LDataSet selectExtn4901(SS_SLS_EXTN_4901_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4901_LDataSet ds = (SS_SLS_EXTN_4901_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SS_SLS_EXTN_4910_LDataSet selectExtn4910(SS_SLS_EXTN_4910_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4910_LDataSet ds = (SS_SLS_EXTN_4910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public SS_SLS_EXTN_4920_IDataSet updateExtn4920(SS_SLS_EXTN_4920_IDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4920_IDataSet ds = (SS_SLS_EXTN_4920_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public SS_SLS_EXTN_4930_LDataSet selectExtn4930(SS_SLS_EXTN_4930_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4930_LDataSet ds = (SS_SLS_EXTN_4930_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
}    