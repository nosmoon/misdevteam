/***************************************************************************************************
 * 파일명 : SSReader1200DAO.java
 * 기능 : 독자현황-VacationStop 신청을 위한 DAO
 * 작성일자 : 2004-01-12
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
 * 독자현황-VacationStop 신청를 위한 DAO
 */
public class SSReader1200DAO {

    /**
     * 독자현황-VacationStop 신청 초기화
     * @param dm SS_L_VS_INITDM 객체
     * @return SS_L_VS_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_VS_INITDataSet selectInitList(SS_L_VS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VS_INITDataSet ds = (SS_L_VS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop 신청 조회
     * @param dm SS_L_VSDM 객체
     * @return SS_L_VSDataSet 객체
     * @throws AppException
     */
    public SS_L_VSDataSet selectVsList(SS_L_VSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSDataSet ds = (SS_L_VSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-VacationStop 신청 상세
     * @param dm SS_S_VSDM 객체
     * @return SS_S_VSDataSet 객체
     * @throws AppException
     */
    public SS_S_VSDataSet selectVsDetail(SS_S_VSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_VSDataSet ds = (SS_S_VSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}