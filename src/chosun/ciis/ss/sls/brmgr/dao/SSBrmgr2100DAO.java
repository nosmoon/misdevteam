/***************************************************************************************************
* 파일명 : SSBrmgr2100DAO.java
* 기능 : 지국관리-대행지국관리를 위한 DAO
* 작성일자 : 2013-1-25
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국관리-대행지국관리 위한 DAO
 */

public class SSBrmgr2100DAO {
    /**
     * 지국관리-대행지국관리-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_BO_PROXY_INITDataSet initBoProxy(SS_L_BO_PROXY_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_PROXY_INITDataSet ds = (SS_L_BO_PROXY_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    /**
     * 지국관리-대행지국관리-목록
     * @param dm SS_L_QTY_SPDM
     * @return SS_L_QTY_SPDataSet
     * @throws AppException
     */
    public SS_L_BO_PROXYDataSet selectBoProxyList(SS_L_BO_PROXYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_PROXYDataSet ds = (SS_L_BO_PROXYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}