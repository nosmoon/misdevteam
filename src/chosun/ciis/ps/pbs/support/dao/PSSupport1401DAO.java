/***************************************************************************************************
 * 파일명   : PSSupport1401DAO.java
 * 기능     : 현금영수증 신청
 * 작성일자 : 2005-02-15
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편관리-현금영수증 신청
 */
public class PSSupport1401DAO {

    /**
     * 현금영수증 초기
     * @param PS_L_DSCT_SPPTDM
     * @return PS_L_DSCT_SPPTDataSet
     */
    public PS_L_DSCT_SPPTDataSet selectCodeList(PS_L_DSCT_SPPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 현금영수증 내역검색
     * @param PS_L_CASHRCPTDM
     * @return PS_L_CASHRCPTDataSet
     */
    public PS_L_CASHRCPTDataSet selectCashrcptList(PS_L_CASHRCPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_CASHRCPTDataSet ds = (PS_L_CASHRCPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사처리 상세내역보기
     * @param PS_S_CASHRCPTDM
     * @return PS_S_CASHRCPTDataSet
     **/
    public PS_S_CASHRCPTDataSet selectCashrcptDetail(PS_S_CASHRCPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_CASHRCPTDataSet ds = (PS_S_CASHRCPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 현금영수증 신청/취소
     * @param CO_A_CASHRCPTRDM
     * @return CO_A_CASHRCPTDataSet
     **/

    public CO_A_CASHRCPTDataSet accessCashrcpt(CO_A_CASHRCPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_CASHRCPTDataSet ds = (CO_A_CASHRCPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}