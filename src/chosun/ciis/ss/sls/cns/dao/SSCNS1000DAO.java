/***************************************************************************************************
* 파일명 : SSCNS1000DAO.java
* 기능 : 상담원-등록,수정,삭제를 위한 DAO
* 작성일자 : 2004-07-14
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.cns.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 상담원-등록,수정,삭제를 위한 DAO
 */

public class SSCNS1000DAO {


    /**
     * 상담원-등록,수정,삭제
     * @param dm SS_A_TMDM
     * @return SS_A_TMDataSet
     * @throws AppException
     */
    public SS_A_TMDataSet accessCNS(SS_A_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_TMDataSet ds = (SS_A_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상담원-출판독자검색-목록
     * @param dm SS_L_RDR_TMDM
     * @return SS_L_RDR_TMDataSet
     * @throws AppException
     */
    public SS_L_RDR_TMDataSet selectRdrSrchList(SS_L_RDR_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_TMDataSet ds = (SS_L_RDR_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 상담원-자동이체관련-초기화면
     * @param dm SS_L_SHFTAPLC_INIT_TMDM
     * @return SS_L_SHFTAPLC_INIT_TMDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLC_INIT_TMDataSet initCNSShftAplc(SS_L_SHFTAPLC_INIT_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLC_INIT_TMDataSet ds = (SS_L_SHFTAPLC_INIT_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상담원-자동이체관련-등록
     * @param dm SS_I_SHFTAPLC_TMDM
     * @return SS_I_SHFTAPLC_TMDataSet
     * @throws AppException
     */
    public SS_I_SHFTAPLC_TMDataSet insertCNSShftAplc(SS_I_SHFTAPLC_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_SHFTAPLC_TMDataSet ds = (SS_I_SHFTAPLC_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상담원-불편 통계-목록
     * @param dm SS_L_DSCTSTAT_TMDM
     * @return SS_L_DSCTSTAT_TMDataSet
     * @throws AppException
     */
    public SS_L_DSCTSTAT_TMDataSet selectDsctStatDetail(SS_L_DSCTSTAT_TMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_DSCTSTAT_TMDataSet ds = (SS_L_DSCTSTAT_TMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}