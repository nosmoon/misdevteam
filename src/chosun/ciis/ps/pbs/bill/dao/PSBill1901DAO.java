/***************************************************************************************************
 * 함수명   : PSBill1901DAO.java
 * 처리개요 : 수금-자동이체청구결과요약 메뉴의 데이터베이스관련 메소드
 * 작성일자 : 2006-04-14
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/
package chosun.ciis.ps.pbs.bill.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.dao.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * 자동이체청구결과요약 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSBill1901DAO {

    /**
     * 자동이체청구결과요약
     * @param dm PS_L_SHFT_CLAM_SSUMDM
     * @return PS_L_SHFT_CLAM_SSUMDataSet
     * @throws AppException
     */
    public PS_L_SHFT_CLAM_SSUMDataSet selectClamSsum(PS_L_SHFT_CLAM_SSUMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SHFT_CLAM_SSUMDataSet ds = (PS_L_SHFT_CLAM_SSUMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 자동이체청구결과
     * @param dm PS_L_SHFT_CLAM_OCOMDM
     * @return PS_L_SHFT_CLAM_OCOMDataSet
     * @throws AppException
     */
    public PS_L_SHFT_CLAM_OCOMDataSet selectClamOcomList(PS_L_SHFT_CLAM_OCOMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SHFT_CLAM_OCOMDataSet ds = (PS_L_SHFT_CLAM_OCOMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
