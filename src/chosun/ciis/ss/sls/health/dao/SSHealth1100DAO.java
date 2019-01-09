/***************************************************************************************************
* 파일명 : SSHealth1100DAO.java
* 기능 : 워크북마감
* 작성일자 : 2015-1-5
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.health.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.dm.*;

public class SSHealth1100DAO {
        
    public SS_L_WORKBOOK_SENDCLSDataSet selectWorkbookSend(SS_L_WORKBOOK_SENDCLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WORKBOOK_SENDCLSDataSet ds = (SS_L_WORKBOOK_SENDCLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_S_WORKBOOK_SENDCLSDataSet detailWorkbookSend(SS_S_WORKBOOK_SENDCLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_WORKBOOK_SENDCLSDataSet ds = (SS_S_WORKBOOK_SENDCLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_WORKBOOK_SENDCLSDataSet saveWorkbookSend(SS_A_WORKBOOK_SENDCLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WORKBOOK_SENDCLSDataSet ds = (SS_A_WORKBOOK_SENDCLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
