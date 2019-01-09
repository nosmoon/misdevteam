/***************************************************************************************************
* 파일명 : SSExtn1000DAO.java
* 기능 : 확장신청을 위한 DAO
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
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

/**
 * 확장현황-신청현황 을 위한 DAO
 */
public class SSExtn2300DAO {
    /**
     * 확장현황-신청현황 초기화면
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_RDR_STATS_INITDataSet init(SS_L_EXTN_RDR_STATS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_RDR_STATS_INITDataSet ds = (SS_L_EXTN_RDR_STATS_INITDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-신청현황 확장신청 목록
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_EXTN_RDR_STATSDataSet selectRdrExtnStatList(SS_L_EXTN_RDR_STATSDM dm) throws AppException{    	
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_RDR_STATSDataSet ds = (SS_L_EXTN_RDR_STATSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
