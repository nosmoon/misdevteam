/***************************************************************************************************
 * 함수명   : PSBill1201DAO.java
 * 처리개요 : 수금-일괄입금 화면의 모든 이벤트를 처리
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
 * 수금-일괄입금
 */
public class PSBill1201DAO {


    /**
     * 지로수납결과 조회
     * @param PS_L_BILL_TACOM_GRRCPCMDM
     * @return PS_L_BILL_TACOM_GRRCPCMDataSet
     **/
    public PS_L_BILL_TACOM_GRRCPCMDataSet selectLumprcpmList(PS_L_BILL_TACOM_GRRCPCMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_TACOM_GRRCPCMDataSet ds = (PS_L_BILL_TACOM_GRRCPCMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

    /**
     * 지로수납결과 상세 조회
     * @param PS_L_TACOD_GRRCPCMDM
     * @return PS_L_TACOD_GRRCPCMDataSet
     **/
    public PS_L_BILL_TACOD_GRRCPCMDataSet selectLumprcpmDetail(PS_L_BILL_TACOD_GRRCPCMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BILL_TACOD_GRRCPCMDataSet ds = (PS_L_BILL_TACOD_GRRCPCMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }

}