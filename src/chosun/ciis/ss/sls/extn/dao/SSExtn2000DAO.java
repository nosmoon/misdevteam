/***************************************************************************************************
 * 파일명 : SSExtn2000DAO.java
 * 기능 :
 * 작성일자 : 2009-05-14
 * 작성자 : 권정윤
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
 * 확장현황-중지현황을 위한 DAO
 */
public class SSExtn2000DAO {

    /**
     * 확장현황-중지현황-초기화면
     * @param dm SS_L_EXTN_SUSP_INITDM
     * @return SS_L_EXTN_SUSP_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_SUSP_INITDataSet suspInit(SS_L_EXTN_SUSP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_SUSP_INITDataSet ds = (SS_L_EXTN_SUSP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-중지현황-조회(지국별)
     * @param dm SS_L_EXTN_SUSPDM
     * @return SS_L_EXTN_SUSPDataSet
     * @throws AppException
     */
    public SS_L_EXTN_SUSPDataSet selectSuspList(SS_L_EXTN_SUSPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_SUSPDataSet ds = (SS_L_EXTN_SUSPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-중지현황-조회(중지건별)
     * @param dm SS_L_EXTN_SUSP_PERDM
     * @return SS_L_EXTN_SUSP_PERDataSet
     * @throws AppException
     */
    public SS_L_EXTN_SUSP_PERDataSet selectSuspPerList(SS_L_EXTN_SUSP_PERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_SUSP_PERDataSet ds = (SS_L_EXTN_SUSP_PERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
