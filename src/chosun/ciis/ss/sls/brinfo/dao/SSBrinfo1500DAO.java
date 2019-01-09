/***************************************************************************************************
 * 파일명 : SSBrinfo1500DAO.java
 * 기능 : 지국Info-전세지원금 현황을 위한 DAO
 * 작성일자 : 2004-02-09
 * 작성자 : 김성규
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-전세지원금현황을 위한 DAO
 */
public class SSBrinfo1500DAO {

    /**
     * 지국Info-전세지원금현황-초기화면(부서조회)
     * @param dm SS_L_NWBUSEOCDDM 객체
     * @return SS_L_NWBUSEOCDDataSet 객체
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet selectBuseoList(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-전세지원금현황-초기화면(결과조회)
     * @param dm SS_L_LEASAMT_LISTDM 객체
     * @return SS_L_LEASAMT_LISTDataSet 객체
     * @throws AppException
     */

    public SS_L_LEASAMT_LISTDataSet selectLeasamtList(SS_L_LEASAMT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_LEASAMT_LISTDataSet ds = (SS_L_LEASAMT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-전세지원금현황-상세조회
     * @param dm SS_S_LEASAMTDM 객체
     * @return SS_S_LEASAMTDataSet 객체
     * @throws AppException
     */

    public SS_S_LEASAMTDataSet selectDetailView(SS_S_LEASAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_LEASAMTDataSet ds = (SS_S_LEASAMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-전세지원금현황-정보 수정
     * @param dm SS_U_LEASAMTDM 객체
     * @return SS_U_LEASAMTDataSet 객체
     * @throws AppException
     */

    public SS_U_LEASAMTDataSet updateDetailView(SS_U_LEASAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_LEASAMTDataSet ds = (SS_U_LEASAMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


}
