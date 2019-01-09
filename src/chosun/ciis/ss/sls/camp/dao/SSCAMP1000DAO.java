/***************************************************************************************************
* 파일명 : SSCAMP1000DAO.java
* 기능 : 캠페인확장 DAO
* 작성일자 : 2005-05-27
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.camp.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 캠페인확장등록 DAO
 */

public class SSCAMP1000DAO {

    /**
     * 캠페인확장등록 초기화면
     * @param dm SS_L_CAMP_EXTN_INITDM
     * @return SS_L_CAMP_EXTN_INITDataSet
     * @throws AppException
     */
    public SS_L_CAMP_EXTN_INITDataSet init(SS_L_CAMP_EXTN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMP_EXTN_INITDataSet ds = (SS_L_CAMP_EXTN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인확장등록-등록
     * @param dm SS_I_CAMP_EXTNDM
     * @return SS_I_CAMP_EXTNDataSet
     * @throws AppException
     */
    public SS_I_CAMP_EXTNDataSet saveCampExtn(SS_I_CAMP_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_CAMP_EXTNDataSet ds = (SS_I_CAMP_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 캠페인확장등록-이벤트목록조회
     * @param dm SS_L_CAMP_EVENT_LISTDM
     * @return SS_L_CAMP_EVENT_LISTDataSet
     * @throws AppException
     */
    public SS_L_CAMP_EVENT_LISTDataSet searchCampEventList(SS_L_CAMP_EVENT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMP_EVENT_LISTDataSet ds = (SS_L_CAMP_EVENT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
