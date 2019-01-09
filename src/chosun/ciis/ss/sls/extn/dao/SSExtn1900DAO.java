/***************************************************************************************************
 * 파일명 : SSExtn1900DAO.java
 * 기능 :
 * 작성일자 : 2007-07-12
 * 작성자 : 이혁
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
 * 지국경영-입주아파트현황을 위한 DAO
 */
public class SSExtn1900DAO {

    /**
     * 확장현황-확장제한-초기화면
     * @param dm CO_L_EXTN_RES_INITDM
     * @return CO_L_EXTN_RES_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_RES_INITDataSet selectExtnResInit(SS_L_EXTN_RES_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_RES_INITDataSet ds = (SS_L_EXTN_RES_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장제한-목록
     * @param dm CO_L_EXTN_RESDM
     * @return CO_L_EXTN_RESDataSet
     * @throws AppException
     */
    public SS_L_EXTN_RESDataSet selectExtnResList(SS_L_EXTN_RESDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_RESDataSet ds = (SS_L_EXTN_RESDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 확장현황-확장제한-상세화면
     * @param dm CO_S_EXTN_RESDM
     * @return CO_S_EXTN_RESDataSet
     * @throws AppException
     */
    public CO_S_EXTN_RESDataSet selectExtnResDetail(CO_S_EXTN_RESDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_S_EXTN_RESDataSet ds = (CO_S_EXTN_RESDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-확장제한-상세화면
     * @param dm CO_U_EXTN_RESDM
     * @return CO_U_EXTN_RESDataSet
     * @throws AppException
     */
    public CO_U_EXTN_RESDataSet selectExtnResUpdate(CO_U_EXTN_RESDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_U_EXTN_RESDataSet ds = (CO_U_EXTN_RESDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
