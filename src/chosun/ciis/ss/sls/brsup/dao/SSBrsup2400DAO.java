/***************************************************************************************************
 * 파일명   : SSBrsup2400DAO.java
 * 기능     : 주간조선관리-배달비정산마감
 * 작성일자 : 2007-04-13
 * 작성자   : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

public class SSBrsup2400DAO {
    /**
     * 주간조선관리-배달비정산마감-마감및취소
     * @param dm CO_A_WEEKCHOSUNCLOSDM
     * @return CO_A_WEEKCHOSUNCLOSDataSet
     * @throws AppException
     */
    public CO_A_WEEKCHOSUNCLOSDataSet ClosandCancel(CO_A_WEEKCHOSUNCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_WEEKCHOSUNCLOSDataSet ds = (CO_A_WEEKCHOSUNCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 주간조선관리-배달비정산마감-초기화면
     * @param dm SS_L_WEEKSND_CLOSPTCRDM
     * @return SS_L_WEEKSND_CLOSPTCRDataSet
     * @throws AppException
     */
    public SS_L_WEEKSND_CLOSPTCRDataSet initClosList(SS_L_WEEKSND_CLOSPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WEEKSND_CLOSPTCRDataSet ds = (SS_L_WEEKSND_CLOSPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-주간조선관리-송금목록 엑셀저장
     * @param dm SS_L_WEEKSND_CLOS_PRINTDM
     * @return SS_L_WEEKSND_CLOS_PRINTDataSet
     * @throws AppException
     */
    public SS_L_WEEKSND_CLOS_PRINTDataSet closListExcel(SS_L_WEEKSND_CLOS_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WEEKSND_CLOS_PRINTDataSet ds = (SS_L_WEEKSND_CLOS_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 주간조선관리-배달비정산마감-초기화면
     * @param dm SS_L_WEEKSND_CLOSPTCR_SERNODM
     * @return SS_L_WEEKSND_CLOSPTCR_SERNODataSet
     * @throws AppException
     */
    public SS_L_WEEKSND_CLOSPTCR_SERNODataSet closSernoList(SS_L_WEEKSND_CLOSPTCR_SERNODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (SS_L_WEEKSND_CLOSPTCR_SERNODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
