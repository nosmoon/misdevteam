/***************************************************************************************************
 * 파일명 : SSReader1400DAO.java
 * 기능 : 독자현황-VacationStop 비용을 위한 DAO
 * 작성일자 : 2004-01-17
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-VacationStop 비용를 위한 DAO
 */
public class SSReader1400DAO {

    /**
     * 독자현황-VacationStop 비용 초기화
     * @param dm SS_L_VSCOST_INITDM 객체
     * @return SS_L_VSCOST_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_VSCOST_INITDataSet selectInitList(SS_L_VSCOST_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCOST_INITDataSet ds = (SS_L_VSCOST_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-VacationStop 비용 휴가지코드, 코드명 조회
     * @param dm SS_L_VSCD_AREANMDM 객체
     * @return SS_L_VSCD_AREANMDataSet 객체
     * @throws AppException
     */
    public SS_L_VSCD_AREANMDataSet selectVacaAreaList(SS_L_VSCD_AREANMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCD_AREANMDataSet ds = (SS_L_VSCD_AREANMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    /**
     * 독자현황-VacationStop 비용 조회
     * @param dm SS_L_VSCOST_COSTDM 객체
     * @return SS_L_VSCOST_COSTDataSet 객체
     * @throws AppException
     */
    public SS_L_VSCOST_COSTDataSet selectVscostList(SS_L_VSCOST_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCOST_COSTDataSet ds = (SS_L_VSCOST_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}