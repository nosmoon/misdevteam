/***************************************************************************************************
 * 함수명   : PSBill1101DAO.java
 * 처리개요 : 수금-개별입금 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-03-30
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
 * 수금-개별입금
 */
public class PSBill1101DAO {

    /**
     * 공통코드 조회
     * @param PS_S_BILL_SEPRDM
     * @return PS_S_BILL_SEPRDataSet
     */
    public PS_S_BILL_SEPRDataSet selectCodeList(PS_S_BILL_SEPRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_BILL_SEPRDataSet ds = (PS_S_BILL_SEPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 개별입금내역 조회
     * @param PS_L_BILL_SEPRDM
     * @return PS_L_BILL_SEPRDataSet
     **/
    public PS_L_BILL_SEPRDataSet selectSeprrecpList(PS_L_BILL_SEPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_SEPRDataSet ds = (PS_L_BILL_SEPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * 개별입금내역 처리
     * @param PS_A_BILL_SEPRDM
     * @return PS_A_BILL_SEPRDataSet
     **/
    public boolean accessSeprrcpm(PS_A_BILL_SEPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BILL_SEPRDataSet ds = (PS_A_BILL_SEPRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return true;
    }

}