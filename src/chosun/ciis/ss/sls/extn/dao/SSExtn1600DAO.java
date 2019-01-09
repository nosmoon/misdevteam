/***************************************************************************************************
* 파일명 : SSExtn1600DAO.java
* 기능 : 확장현황-사이버확장-요원,수당을 위한 DAO
* 작성일자 : 2004-03-29
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 확장현황-사이버확장-요원,수당을 위한 DAO
 */

public class SSExtn1600DAO {
    /**
     * 확장현황-사이버확장-요원관리-초기화면
     * @param dm SS_L_PROMSTAF_INIT_CYEXTNDM
     * @return SS_L_PROMSTAF_INIT_CYEXTNDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_INIT_CYEXTNDataSet initPromStafCYEXTN(SS_L_PROMSTAF_INIT_CYEXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_INIT_CYEXTNDataSet ds = (SS_L_PROMSTAF_INIT_CYEXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사이버확장-요원관리-목록
     * @param dm SS_L_PROMSTAF_CYEXTNDM
     * @return SS_L_PROMSTAF_CYEXTNDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXTNDataSet selectPromStafCYEXTNList(SS_L_PROMSTAF_CYEXTNDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXTNDataSet ds = (SS_L_PROMSTAF_CYEXTNDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사이버확장-요원관리-상세
     * @param dm  SS_S_PROMSTAF_CYEXTNDM
     * @return  SS_S_PROMSTAF_CYEXTNDataSet
     * @throws AppException
     */
    public SS_S_PROMSTAF_CYEXTNDataSet selectPromStafCYEXTNDetail(SS_S_PROMSTAF_CYEXTNDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_PROMSTAF_CYEXTNDataSet ds = (SS_S_PROMSTAF_CYEXTNDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사이버확장-요원관리-인쇄
     * @param dm SS_L_PROMSTAF_CYEXTN_PRINTDM
     * @return SS_L_PROMSTAF_CYEXTN_PRINTDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXTN_PRINTDataSet printPromStafCYEXTNList(SS_L_PROMSTAF_CYEXTN_PRINTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXTN_PRINTDataSet ds = (SS_L_PROMSTAF_CYEXTN_PRINTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사이버확장-수당-초기화면
     * @param dm SS_L_PROMSTAF_CYEXPAY_INITDM
     * @return SS_L_PROMSTAF_CYEXPAY_INITDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXPAY_INITDataSet initPromStafCYEXPay(SS_L_PROMSTAF_CYEXPAY_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXPAY_INITDataSet ds = (SS_L_PROMSTAF_CYEXPAY_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사이버확장-수당-목록
     * @param dm SS_L_PROMSTAF_CYEXPAYDM
     * @return SS_L_PROMSTAF_CYEXPAYDataSet
     * @throws AppException
     */
    public SS_L_PROMSTAF_CYEXPAYDataSet selectPromStafCYEXPayList(SS_L_PROMSTAF_CYEXPAYDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PROMSTAF_CYEXPAYDataSet ds = (SS_L_PROMSTAF_CYEXPAYDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-사이버확장-수당-저장
     * @param dm  SS_U_CYEXPAYDM
     * @return  SS_U_CYEXPAYDataSet
     * @throws AppException
     */
    public SS_U_CYEXPAYDataSet updatePromStafCYEXpay(SS_U_CYEXPAYDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_CYEXPAYDataSet ds = (SS_U_CYEXPAYDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}