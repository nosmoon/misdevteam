/***************************************************************************************************
* 파일명 : SSExtn2280EJB.java
* 기능 : 일괄확장등록을 위한 EJB Remote Interface
* 작성일자 : 2011-03-30
* 작성자 : 김태희
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
 * 확장현황-일괄확장등록 을 위한 DAO
 */

public class SSExtn2280DAO {
    
    /**
     * 확장현황-일괄확장-등록
     * @param dm SS_A_BATCH_EXTNDM
     * @return SS_A_BATCH_EXTNDataSet
     * @throws AppException
     */
    public SS_A_BATCH_EXTNDataSet batchExtnJob(SS_A_BATCH_EXTNDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_A_BATCH_EXTNDataSet ds = (SS_A_BATCH_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("appexception occured : "+ds.errcode+" "+ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-일괄확장-조회
     * @param dm SS_A_BATCH_EXTNDM
     * @return SS_A_BATCH_EXTNDataSet
     * @throws AppException
     */
    public SS_L_BATCH_EXTNDataSet listBatchExtnJob(SS_L_BATCH_EXTNDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_BATCH_EXTNDataSet ds = (SS_L_BATCH_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("appexception occured : "+ds.errcode+" "+ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_IMTMDataSet IMTM(SS_L_IMTMDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_IMTMDataSet ds = (SS_L_IMTMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("appexception occured : "+ds.errcode+" "+ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
