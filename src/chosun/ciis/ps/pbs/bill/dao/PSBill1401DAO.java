/***************************************************************************************************
 * 함수명   : PSBill1401DAO.java
 * 처리개요 : 수금-초과입금 화면의 모든 이벤트를 처리
 * 작성일자 : 2003-11-18
 * 작성자   : 김건호
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
 * 수금-초과입금
 */
public class PSBill1401DAO {

    /**
     * 초과입금처리 초기화면 공통코드목록 조회
     * @param dm PS_C_EXCSRCPMPROCDM
     * @return PS_C_EXCSRCPMPROCDataSet
     * @throws AppException
     */
    public PS_C_EXCSRCPMPROCDataSet selectCombolist(PS_C_EXCSRCPMPROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_C_EXCSRCPMPROCDataSet ds = (PS_C_EXCSRCPMPROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 초과입금처리 리스트 조회
     * @param dm PS_L_BILL_EXCSRCPMPROCDM
     * @return PS_L_BILL_EXCSRCPMPROCDataSet
     * @throws AppException
     **/
    public PS_L_BILL_EXCSRCPMPROCDataSet selectList(PS_L_BILL_EXCSRCPMPROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_EXCSRCPMPROCDataSet ds = (PS_L_BILL_EXCSRCPMPROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 초과입금처리 상세정보 등록
     * @param dm PS_A_BILL_EXCSRCPMPROCDM
     * @return boolean
     * @throws AppException
     **/
    public boolean aceessExcsamt(PS_A_BILL_EXCSRCPMPROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BILL_EXCSRCPMPROCDataSet ds = (PS_A_BILL_EXCSRCPMPROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 초과입금처리 단일 독자정보 검색
     * @param dm PB_S_RDRINFO_PARTDM
     * @return PB_S_RDRINFO_PARTDataSet
     * @throws AppException
     */
    public PB_S_RDRINFO_PARTDataSet selectRdrinfoPart(PB_S_RDRINFO_PARTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PB_S_RDRINFO_PARTDataSet ds = (PB_S_RDRINFO_PARTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}