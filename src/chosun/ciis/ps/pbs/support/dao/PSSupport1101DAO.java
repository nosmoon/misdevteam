/***************************************************************************************************
 * 파일명   : PSSupport1101DAO.java
 * 기능     : 불편접수-불편등록
 * 작성일자 : 2003-11-24
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편접수-불편등록
 */
public class PSSupport1101DAO {

    /**
     * 불편접수 초기
     * @param PS_L_DSCT_SPPTDM
     * @return PS_L_DSCT_SPPTDataSet
     */
    public PS_L_DSCT_SPPTDataSet selectCodeList(PS_L_DSCT_SPPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 불편접수 독자검색
     * @param PS_L_DSCTINFODM
     * @return PS_L_DSCTINFODataSet
     */
    public PS_L_DSCTINFODataSet selectRdrList(PS_L_DSCTINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DSCTINFODataSet ds = (PS_L_DSCTINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 불편접수 등록
     * @param PS_I_DSCTDM
     * @return PS_I_DSCTDataSet
     */
    public PS_I_DSCTDataSet insertDsct(PS_I_DSCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_DSCTDataSet ds = (PS_I_DSCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}