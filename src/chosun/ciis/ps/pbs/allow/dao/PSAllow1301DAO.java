/***************************************************************************************************
 * 함수명   : PSAllow1301DAO.java
 * 처리개요 : 수당-직수수당 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-03-09
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
 * 수당- 직수수당
 */
public class PSAllow1301DAO {

    /**
     * 직수수당관련 초기화면
     * @param PS_S_EMP_ALON_BASEDM
     * @return PS_S_EMP_ALON_BASEDataSet
     */
    public PS_S_EMP_ALON_BASEDataSet selectCodeList(PS_S_EMP_ALON_BASEDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_EMP_ALON_BASEDataSet ds = (PS_S_EMP_ALON_BASEDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 직수수당 조회화면
     * @param PS_L_ALON_RSLT_BASEDM
     * @return PS_L_ALON_RSLT_BASEDataSet
     */
    public PS_L_ALON_RSLT_BASEDataSet selectRsltList(PS_L_ALON_RSLT_BASEDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_RSLT_BASEDataSet ds = (PS_L_ALON_RSLT_BASEDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 직수수당 저장
     * @param PS_A_ALONRSLTDM
     * @return PS_A_ALONRSLTDataSet
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