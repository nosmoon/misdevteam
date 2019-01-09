/***************************************************************************************************
 * 파일명 : SSExtn3000DAO.java
 * 기능 : 중지방어관리 DAO
 * 작성일자 : 2015-02-27
 * 작성자 : 심정보
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
 * 중지방어관리 DAO
 */
public class SSExtn3000DAO {

    /**
     * 중지방어관리-초기화면
     * @param dm SS_L_SUSP_DEF_INITDM
     * @return SS_L_SUSP_DEF_INITDataSet
     * @throws AppException
     */
    public SS_L_SUSP_DEF_INITDataSet selectSuspDefInit(SS_L_SUSP_DEF_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SUSP_DEF_INITDataSet ds = (SS_L_SUSP_DEF_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 중지방어관리-목록
     * @param dm SS_L_SUSP_DEFDM
     * @return SS_L_SUSP_DEFDataSet
     * @throws AppException
     */
    public SS_L_SUSP_DEFDataSet selectSuspDefList(SS_L_SUSP_DEFDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SUSP_DEFDataSet ds = (SS_L_SUSP_DEFDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 중지방어관리-상세화면
     * @param dm SS_S_SUSP_DEFDM
     * @return SS_S_SUSP_DEFDataSet
     * @throws AppException
     */
    public SS_S_SUSP_DEFDataSet selectSuspDefDetail(SS_S_SUSP_DEFDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SUSP_DEFDataSet ds = (SS_S_SUSP_DEFDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_P_SUSP_DEFDataSet selectSuspDefPrint(SS_P_SUSP_DEFDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_SUSP_DEFDataSet ds = (SS_P_SUSP_DEFDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
