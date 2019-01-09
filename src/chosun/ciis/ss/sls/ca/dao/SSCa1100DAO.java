/***************************************************************************************************
* 파일명   : SSCa1100DAO.java
* 기능     : 사이버센터-사이버수당청구
* 작성일자 : 2005-06-20
* 작성자   : 김상옥
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

package chosun.ciis.ss.sls.ca.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;

public class SSCa1100DAO {
    /**
     * 사이버센터-사이버수당청구-조회
     * @param dm SS_L_CYBALON_BOCLAMDM
     * @return SS_L_CYBALON_BOCLAMDataSet
     * @throws AppException
     */
    public SS_L_CYBALON_BOCLAMDataSet selectClamList(SS_L_CYBALON_BOCLAMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CYBALON_BOCLAMDataSet ds = (SS_L_CYBALON_BOCLAMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 사이버센터-사이버수당청구-저장
     * @param dm SS_A_CYBALON_BOCLAMCNFMDM
     * @return SS_A_CYBALON_BOCLAMCNFMDataSet
     * @throws AppException
     */
    public SS_A_CYBALON_BOCLAMCNFMDataSet updateCybalon(SS_A_CYBALON_BOCLAMCNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_CYBALON_BOCLAMCNFMDataSet ds = (SS_A_CYBALON_BOCLAMCNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}