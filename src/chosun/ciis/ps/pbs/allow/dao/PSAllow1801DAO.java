/***************************************************************************************************
 * 함수명   : PSAllow1801DAO.java
 * 처리개요 : 수당-수당월마감
 * 작성일자 : 2004-03-12
 * 작성자   : 김상옥
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-수당월마감
 */
public class PSAllow1801DAO {

    /**
     * 수당월마감-초기
     * @param PS_L_DEPTEMP_ALON_PTCRDM
     * @return PS_L_DEPTEMP_ALON_PTCRDataSet
     */
    public PS_L_DEPTEMP_ALON_PTCRDataSet selectAlonClos(PS_L_DEPTEMP_ALON_PTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DEPTEMP_ALON_PTCRDataSet ds = (PS_L_DEPTEMP_ALON_PTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 수당월마감-마감
     * @param PS_A_BO_ALON_COLSDM
     * @return PS_A_BO_ALON_COLSDataSet
     */
    public PS_A_BO_ALON_COLSDataSet accessAlonClos(PS_A_BO_ALON_COLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BO_ALON_COLSDataSet ds = (PS_A_BO_ALON_COLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 수당월마감-마감취소
     * @param PS_D_BO_ALON_CANCDM
     * @return PS_D_BO_ALON_CANCDataSet
     */
    public PS_D_BO_ALON_CANCDataSet deleteAlonClos(PS_D_BO_ALON_CANCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_BO_ALON_CANCDataSet ds = (PS_D_BO_ALON_CANCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}