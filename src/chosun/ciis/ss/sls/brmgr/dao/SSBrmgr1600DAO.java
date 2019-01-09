/***************************************************************************************************
* 파일명 : SSBrmgr1600DAO.java
* 기능 : 지국경영-스포츠부수현황을 위한 DAO
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
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
 * 지국경영-스포츠부수현황을 위한 DAO
 */

public class SSBrmgr1600DAO {
    /**
     * 지국경영-스포츠부수현황-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_QTY_SP_INITDataSet initSpQty(SS_L_QTY_SP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTY_SP_INITDataSet ds = (SS_L_QTY_SP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    /**
     * 지국경영-스포츠부수현황-목록
     * @param dm SS_L_QTY_SPDM
     * @return SS_L_QTY_SPDataSet
     * @throws AppException
     */
    public SS_L_QTY_SPDataSet selectSpQtyList(SS_L_QTY_SPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTY_SPDataSet ds = (SS_L_QTY_SPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-스포츠부수현황-인쇄
     * @param dm SS_L_QTY_SP_EXCELDM
     * @return SS_L_QTY_SP_EXCELDataSet
     * @throws AppException
     */
    public SS_L_QTY_SP_EXCELDataSet printSpQtyExcel(SS_L_QTY_SP_EXCELDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTY_SP_EXCELDataSet ds = (SS_L_QTY_SP_EXCELDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}