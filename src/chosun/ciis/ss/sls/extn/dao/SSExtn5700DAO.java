/***************************************************************************************************
 * 파일명 : SSExtn5700DAO.java
 * 기능 : 확장관리-정기구독권
 * 작성일자 : 2018-01-10
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
public class SSExtn5700DAO {
	
	public SS_SLS_EXTN_5700_ADataSet initExtn5700(SS_SLS_EXTN_5700_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5700_ADataSet ds = (SS_SLS_EXTN_5700_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_SLS_EXTN_5710_LDataSet selectExtn5710(SS_SLS_EXTN_5710_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5710_LDataSet ds = (SS_SLS_EXTN_5710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_5720_IDataSet insertExtn5720(SS_SLS_EXTN_5720_IDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5720_IDataSet ds = (SS_SLS_EXTN_5720_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_SLS_EXTN_5730_LDataSet selectExtn5730(SS_SLS_EXTN_5730_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5730_LDataSet ds = (SS_SLS_EXTN_5730_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}    