/***************************************************************************************************
 * 함수명   : PSAllow1701DAO.java
 * 처리개요 : 수당-캠페인관리 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-03-14
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
 * 수당-캠페인관리
 */
public class PSAllow1701DAO {
    public PSAllow1701DAO() {
    }

    /**
     * 캠페인관리 초기화면
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
     * 캠페인관리 저장
     * @param PS_I_BO_CMPDM
     * @return PS_I_BO_CMPDataSet
     **/
    public PS_I_BO_CMPDataSet insertCampAlon(PS_I_BO_CMPDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_BO_CMPDataSet ds = (PS_I_BO_CMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인관리 검색
     * @param PS_L_CAMP_SEARCHDM
     * @return PS_L_CAMP_SEARCHDataSet
     **/
    public PS_L_CAMP_SEARCHDataSet selectCampAlon(PS_L_CAMP_SEARCHDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_CAMP_SEARCHDataSet ds = (PS_L_CAMP_SEARCHDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인관리 삭제
     * @param PS_D_CAMP_PTCRDM
     * @return PS_D_CAMP_PTCRDataSet
     **/
    public PS_D_CAMP_PTCRDataSet deleteCampAlon(PS_D_CAMP_PTCRDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_CAMP_PTCRDataSet ds = (PS_D_CAMP_PTCRDataSet) manager.executeCall(
            dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인관리 캠페인 상세내역
     * @param PS_S_CAMPAIGNDM
     * @return PS_S_CAMPAIGNDataSet
     **/
    public PS_S_CAMPAIGNDataSet selectCampaign(PS_S_CAMPAIGNDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_CAMPAIGNDataSet ds = (PS_S_CAMPAIGNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인관리 사원캠페인 수당 검색
     * @param PS_L_EMPCAMP_SEARCHDM
     * @return PS_L_EMPCAMP_SEARCHDataSet
     **/
    public PS_L_EMPCAMP_SEARCHDataSet selectEmpCampaign(PS_L_EMPCAMP_SEARCHDM
        dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_EMPCAMP_SEARCHDataSet ds = (PS_L_EMPCAMP_SEARCHDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인관리 사원캠페인 수당 등록
     * @param PS_A_EMPCAMP_ALONDM
     * @return PS_A_EMPCAMP_ALONDataSet
     **/
    public PS_A_EMPCAMP_ALONDataSet insertEmpCampAlon(PS_A_EMPCAMP_ALONDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_EMPCAMP_ALONDataSet ds = (PS_A_EMPCAMP_ALONDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}