/***************************************************************************************************
* 파일명 : SSExtn2700DAO.java
* 기능 : 사원구독을 위한 DAO
* 작성일자 : 2013-3-5
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

/**
 * 확장현황-사원구독 을 위한 DAO
 */
public class SSExtn2700DAO {
    /**
     * 확장현황-사원구독 초기화면
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
    public SS_L_EMP_NWSPRDR_INITDataSet init(SS_L_EMP_NWSPRDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EMP_NWSPRDR_INITDataSet ds = (SS_L_EMP_NWSPRDR_INITDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_EMP_NWSPRDRDataSet selectEmpNwsprdrList(SS_L_EMP_NWSPRDRDM dm) throws AppException{    	
        DBManager manager = new DBManager("Oracle");
        SS_L_EMP_NWSPRDRDataSet ds = (SS_L_EMP_NWSPRDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_EMP_NWSPRDR_RDRDataSet selectEmpNwsprdrListRdr(SS_L_EMP_NWSPRDR_RDRDM dm) throws AppException{    	
        DBManager manager = new DBManager("Oracle");
        SS_L_EMP_NWSPRDR_RDRDataSet ds = (SS_L_EMP_NWSPRDR_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_EMP_NWSPRDRDataSet updateEmpNwsprdr(SS_A_EMP_NWSPRDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_EMP_NWSPRDRDataSet ds = (SS_A_EMP_NWSPRDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
