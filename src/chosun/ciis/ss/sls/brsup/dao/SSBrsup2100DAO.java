/***************************************************************************************************
* 파일명 	: SSBrsup2100DAO.java
* 기능 		: 지국지원-컴퓨터A/S,전단현황을 위한 DAO
* 작성일자 	: 2004-03-12
* 작성자 	: 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국지원-컴퓨터A/S,전단현황을 위한 DAO
 */

public class SSBrsup2100DAO {

    /**
     * 지국지원-컴퓨터A/S-목록
     * @param dm SS_L_ASREQDM
     * @return SS_L_ASREQDataSet
     * @throws AppException
     */
    public SS_L_ASREQDataSet selectAsreqList(SS_L_ASREQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-컴퓨터A/S-상세
     * @param dm SS_S_ASREQDM
     * @return SS_S_ASREQDataSet
     * @throws AppException
     */
    public SS_S_ASREQDataSet selectAsreqDetail(SS_S_ASREQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ASREQDataSet ds = (SS_S_ASREQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-컴퓨터A/S-등록,수정,삭제
     * @param dm SS_A_ASREQDM
     * @return SS_A_ASREQDataSet
     * @throws AppException
     */
    public SS_A_ASREQDataSet accessAsreq(SS_A_ASREQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_ASREQDataSet ds = (SS_A_ASREQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-전단현황-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_COMMDEPTCDDataSet initLeafScat(SS_L_COMMDEPTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_COMMDEPTCDDataSet ds = (SS_L_COMMDEPTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-전단현황-목록
     * @param dm SS_L_ISLEAF_SCATDM
     * @return SS_L_ISLEAF_SCATDataSet
     * @throws AppException
     */
    public SS_L_ISLEAF_SCATDataSet selectLeafScatList(SS_L_ISLEAF_SCATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ISLEAF_SCATDataSet ds = (SS_L_ISLEAF_SCATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}