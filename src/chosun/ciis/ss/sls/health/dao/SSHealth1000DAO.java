/***************************************************************************************************
* 파일명 : SSExtn1000DAO.java
* 기능 : 확장신청을 위한 DAO
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.health.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.dm.*;

/**
 * 확장현황-신청현황 을 위한 DAO
 */
public class SSHealth1000DAO {
    /**
     * 워크북 관리 초기화면     
     */
    public SS_L_WORKBOOK_APLC_INITDataSet init(SS_L_WORKBOOK_APLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WORKBOOK_APLC_INITDataSet ds = (SS_L_WORKBOOK_APLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_WORKBOOK_APLCDataSet selectWorkbook(SS_L_WORKBOOK_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WORKBOOK_APLCDataSet ds = (SS_L_WORKBOOK_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_S_WORKBOOK_APLCDataSet detailWorkbook(SS_S_WORKBOOK_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_WORKBOOK_APLCDataSet ds = (SS_S_WORKBOOK_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_WORKBOOK_APLCDataSet saveWorkbook(SS_A_WORKBOOK_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WORKBOOK_APLCDataSet ds = (SS_A_WORKBOOK_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
