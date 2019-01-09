/***************************************************************************************************
* 파일명   : SSCa1200DAO.java
* 기능     : 사이버센터-사이버수당지급
* 작성일자 : 2005-06-22
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

public class SSCa1200DAO {
    /**
     * 사이버센터-사이버수당지급-조회
     * @param dm SS_L_CYBALON_STAFPAYDM
     * @return SS_L_CYBALON_STAFPAYDataSet
     * @throws AppException
     */
    public SS_L_CYBALON_STAFPAYDataSet selectStafpayList(SS_L_CYBALON_STAFPAYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CYBALON_STAFPAYDataSet ds = (SS_L_CYBALON_STAFPAYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 사이버센터-사이버수당지급-DOWNLOAD
     * @param dm SS_P_CYBALON_STAFPAYDM
     * @return SS_P_CYBALON_STAFPAYDataSet
     * @throws AppException
     */
    public SS_P_CYBALON_STAFPAYDataSet selectDownloadList(SS_P_CYBALON_STAFPAYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_P_CYBALON_STAFPAYDataSet ds = (SS_P_CYBALON_STAFPAYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}