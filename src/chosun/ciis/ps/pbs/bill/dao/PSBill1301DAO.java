/***************************************************************************************************
 * 함수명   : PSBill1301DAO.java
 * 처리개요 : 수금-비정상입금 화면의 모든 이벤트를 처리
 * 작성일자 : 2003-12-12
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

import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * 수금-비정상입금
 */
public class PSBill1301DAO {

    /**
     * 출판 비정상 입금 초기화면
     * @param PS_S_ABNOR_SEPBKDM
     * @return PS_S_ABNOR_SEPBKDataSet
     */

    public PS_S_ABNOR_SEPBKDataSet selectCodeList(PS_S_ABNOR_SEPBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_ABNOR_SEPBKDataSet ds = (PS_S_ABNOR_SEPBKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * 출판 비정상 입금 조회화면
     * @param PS_L_BILL_NONRCPMDM
     * @return PS_L_BILL_NONRCPMDataSet
     **/

    public PS_L_BILL_NONRCPMDataSet selectNonrcpmList(PS_L_BILL_NONRCPMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_NONRCPMDataSet ds = (PS_L_BILL_NONRCPMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * 지로수납결과 저장처리
     * @param PS_A_BILL_NONRCPMDM
     * @return boolean
     **/
    public boolean accessNonrcpm(PS_A_BILL_NONRCPMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BILL_NONRCPMDataSet ds = (PS_A_BILL_NONRCPMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException (ds.errcode,ds.errmsg);
        }
        return true;
    }

}
