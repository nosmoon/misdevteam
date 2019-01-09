/***************************************************************************************************
 * 함수명   : PSAllow1601DAO.java
 * 처리개요 : 수당-출근수당 화면의 모든 이벤트를 처리
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
 * 수당- 출근수당
 */
public class PSAllow1601DAO {

    /**
     * 출근수당 초기화면
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
     * 출근수당 조회화면
     * @param PS_L_ALON_PRSLTDM
     * @return PS_L_ALON_PRSLTDataSet
     */
    public PS_L_ALON_PRSLTDataSet selectRsltList(PS_L_ALON_PRSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_PRSLTDataSet ds = (PS_L_ALON_PRSLTDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 출근수당 저장
     * @param PS_A_ALONPRSNTDM
     * @return PS_A_ALONPRSNTDataSet
     */
    public PS_A_ALONPRSNTDataSet accessAlon(PS_A_ALONPRSNTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_ALONPRSNTDataSet ds = (PS_A_ALONPRSNTDataSet) manager.executeCall(
            dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}