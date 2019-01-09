/***************************************************************************************************
 * 함수명   : PSBill1701DAO.java
 * 처리개요 : 수금-자동이체신청관리 메뉴의 데이터베이스관련 메소드
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
 * 자동이체신청관리 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSBill1701DAO {

    /**
     * 자동이체신청 목록조회화면 초기화
     * @param dm PS_L_AUTO_SHIFT_APLC_INITDM
     * @return PS_L_AUTO_SHIFT_APLC_INITDataSet
     * @throws AppException
     */
    public PS_L_AUTO_SHIFT_APLC_INITDataSet selectCodeList(PS_L_AUTO_SHIFT_APLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_AUTO_SHIFT_APLC_INITDataSet ds = (PS_L_AUTO_SHIFT_APLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 자동이체신청 목록조회
     * @param dm PS_L_AUTO_SHIFT_APLCDM
     * @return PS_L_AUTO_SHIFT_APLCDataSet
     * @throws AppException
     */
    public PS_L_AUTO_SHIFT_APLCDataSet selectAplcList(PS_L_AUTO_SHIFT_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_AUTO_SHIFT_APLCDataSet ds = (PS_L_AUTO_SHIFT_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 자동이체신청 확인/취소
     * @param dm PS_U_APLCSTATDM
     * @return PS_U_APLCSTATDataSet
     * @throws AppException
     */
    public PS_U_APLCSTATDataSet updateAplc(PS_U_APLCSTATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_APLCSTATDataSet ds = (PS_U_APLCSTATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 자동이체신청 상세보기
     * @param dm PS_S_APLCDM
     * @return PS_S_APLCDataSet
     * @throws AppException
     */
    public PS_S_APLCDataSet selectAplcDetail(PS_S_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_APLCDataSet ds = (PS_S_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자번호로 매체리스트 조회하기
     * @param dm PS_L_MEDIDM
     * @return PS_L_MEDIDataSet
     * @throws AppException
     * /
    public PS_L_MEDIDataSet selectMediList(PS_L_MEDIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MEDIDataSet ds = (PS_L_MEDIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 납부정보 수정하기
     * @param dm PS_U_APLCINFODM
     * @return PS_U_APLCINFODataSet
     * @throws AppException
     */
    public PS_U_APLCINFODataSet updateAplcInfo(PS_U_APLCINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_APLCINFODataSet ds = (PS_U_APLCINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
