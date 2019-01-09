/***************************************************************************************************
 * 함수명   : PSAllow1201DAO.java
 * 처리개요 : 수당-성과수당관리 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-02-24
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-성과수당관리
 */
public class PSAllow1201DAO {
    public PSAllow1201DAO() {
    }

    /**
     * 성과관리 초기화면
     * @param PS_S_EMP_ALONDM
     * @return PS_S_EMP_ALONDataSet
     **/
    public PS_S_EMP_ALONDataSet selectCodeList(PS_S_EMP_ALONDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_EMP_ALONDataSet ds = (PS_S_EMP_ALONDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 수당관리 수당내역 조회
     * @param PS_L_ALON_RSLTDM
     * @return PS_L_ALON_RSLTDataSet
     **/
    public PS_L_ALON_RSLTDataSet selectRsltList(PS_L_ALON_RSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_RSLTDataSet ds = (PS_L_ALON_RSLTDataSet) manager.executeCall(
            dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 성과수당 저장
     * @param PB_A_ALONRSLTDM
     * @return PB_A_ALONRSLTDataSet
     */
    public PS_A_ALONRSLTDataSet accessAlon(PS_A_ALONRSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_ALONRSLTDataSet ds = (PS_A_ALONRSLTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}