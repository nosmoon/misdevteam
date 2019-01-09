/***************************************************************************************************
 * 파일명 : SSBrinfo1600DAO.java
 * 기능 : 지국Info-발송노선을 위한 DAO
 * 작성일자 : 2004-04-01
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sls.brinfo.rec.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-발송노선을 위한 DAO
 */
public class SSBrinfo11600DAO {

    /**
     * 지국Info-발송노선(발차노선조회)
     * @param dm SS_MO_L_BSNSDM 객체
     * @return SS_MO_L_BSNSDataSet 객체
     * @throws AppException
     */
    public SS_MO_L_BSNSDataSet mo_selectBsnsList(SS_MO_L_BSNSDM dm) throws AppException { //모바일용_NEW
    	DBManager manager = new DBManager("Oracle");
    	SS_MO_L_BSNSDataSet ds = (SS_MO_L_BSNSDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * 지국Info-발송노선(발차노선조회)-센터상세
     * @param dm SS_MO_S_BSNSDM
     * @return SS_MO_S_BSNSDataSet
     * @throws AppException
     */
    public SS_MO_S_BSNSDataSet mo_selectBsnsDetail(SS_MO_S_BSNSDM dm) throws AppException { //모바일_NEW
        DBManager manager = new DBManager("Oracle");
        SS_MO_S_BSNSDataSet ds = (SS_MO_S_BSNSDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

}
