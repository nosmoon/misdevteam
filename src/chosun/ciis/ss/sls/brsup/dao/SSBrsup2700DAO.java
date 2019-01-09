/***************************************************************************************************
* 파일명 : SSBrsup2700DAO.java
* 기능 : 지국지원-빌링-가상계좌 통계
* 작성일자 : 2015-09-30
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국지원-빌링-가상계좌통계
 */

public class SSBrsup2700DAO {
    
    /**
     * 지국지원-빌링-가상계좌통계-초기화면   
     */
    public SS_L_VACT_STAT_INITDataSet initVactStat(SS_L_VACT_STAT_INITDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VACT_STAT_INITDataSet ds = (SS_L_VACT_STAT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    
    public SS_L_VACT_STATDataSet searchVactStat(SS_L_VACT_STATDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VACT_STATDataSet ds = (SS_L_VACT_STATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_S_VACT_STATDataSet detailVactStat(SS_S_VACT_STATDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_VACT_STATDataSet ds = (SS_S_VACT_STATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_P_VACT_STATDataSet printVactStat(SS_P_VACT_STATDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_VACT_STATDataSet ds = (SS_P_VACT_STATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_SLS_BRSUP_2701_LDataSet searchBrsup2701(SS_SLS_BRSUP_2701_LDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_2701_LDataSet ds = (SS_SLS_BRSUP_2701_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}