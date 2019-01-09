/***************************************************************************************************
 * 파일명 : SSExtn4500DAO.java
 * 기능 : 무료지관리DAO
 * 작성일자 : 2016.01.29
 * 작성자 : 장선희
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
 * 문자점검독자관리 DAO
 */
public class SSExtn4500DAO {

    /**
     * 무료지관리-조회
     * @param  SS_L_FREENWSPDM
     * @return SS_L_FREENWSPDataSet
     * @throws AppException
     */
    public SS_L_FREENWSPDataSet freeNwspList(SS_L_FREENWSPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_FREENWSPDataSet ds = (SS_L_FREENWSPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }







}
