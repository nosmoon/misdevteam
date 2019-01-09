/***************************************************************************************************
 * 파일명 : SSBrmgr1200DAO.java
 * 기능 : 지국경영-부수증감 본지신청,신청(담당)을 위한 DAO
 * 작성일자 : 2004-03-18
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 결재를 위한 문서ID, 지역단위 부수현황 가져오기 추가.
* 수정자 :   황성진
* 수정일자 : 2009.4.30
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;

/**
 * 지국경영-부수증감 본지신청,신청(담당)을 위한 DAO
 */
public class SSBrmgr1200DAO {

    /**
     * 지국경영-부수증감 본지신청,신청(담당)을 초기화
     * @param dm SS_L_QTYAPLC_INITDM 객체
     * @return SS_L_QTYAPLC_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_QTYAPLC_INITDataSet selectInitList(SS_L_QTYAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_INITDataSet ds = (SS_L_QTYAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-부수증감 본지신청(담당)을 조회
     * @param dm SS_L_QTYAPLC_MAIN_NWSPDM 객체
     * @return SS_L_QTYAPLC_MAIN_NWSPDataSet 객체
     * @throws AppException
     */
    public SS_L_QTYAPLC_MAIN_NWSPDataSet selectQtyaplcMainNwspList(SS_L_QTYAPLC_MAIN_NWSPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_MAIN_NWSPDataSet ds = (SS_L_QTYAPLC_MAIN_NWSPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
     * 지국경영-부수증감 본지신청(담당) 저장
     * @param dm SS_U_QTYAPLC_MAIN_NWSPDM 객체
     * @return SS_U_QTYAPLC_MAIN_NWSPDataSet 객체
     * @throws AppException
     */
	public boolean updateQtyaplcMainNwsp(SS_U_QTYAPLC_MAIN_NWSPDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_QTYAPLC_MAIN_NWSPDataSet ds = (SS_U_QTYAPLC_MAIN_NWSPDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

    /**
     * 지국경영-부수증감 본지신청(담당) 결재코드 조회
     * @param dm SS_L_QTYAPLC_DOCIDDM 객체
     * @return SS_L_QTYAPLC_DOCIDDataSet 객체
     * @throws AppException
     */
	public SS_L_QTYAPLC_DOCIDDataSet selectQtyaplcDocID(SS_L_QTYAPLC_DOCIDDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_L_QTYAPLC_DOCIDDataSet ds = (SS_L_QTYAPLC_DOCIDDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
     * 지국경영-부수증감 본지신청(담당) 지역단위 부수현황 조회
     * @param dm SS_L_QTYAPLC_ILGYEDM 객체
	 * @return SS_L_QTYAPLC_ILGYEDataSet 객체
     * @throws AppException
     */
	public SS_L_QTYAPLC_ILGYEDataSet selectQtyaplcIlgye(SS_L_QTYAPLC_ILGYEDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_L_QTYAPLC_ILGYEDataSet ds = (SS_L_QTYAPLC_ILGYEDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
    /**
     * 지국경영-부수증감 본지신청(지원)-인쇄
     * @param dm SS_L_QTYAPLC_MAINNWSP_PRINTDM
     * @return SS_L_QTYAPLC_MAINNWSP_PRINTDataSet
     * @throws AppException
     */
     public SS_L_QTYAPLC_MAINNWSP_PRINTDataSet printQtyaplcMainNwspClosList(SS_L_QTYAPLC_MAINNWSP_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_MAINNWSP_PRINTDataSet ds = (SS_L_QTYAPLC_MAINNWSP_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-부수증감 신청(담당)을 조회
     * @param dm SS_L_QTYAPLCDM 객체
     * @return SS_L_QTYAPLCDataSet 객체
     * @throws AppException
     */
    public SS_L_QTYAPLCDataSet selectQtyaplcList(SS_L_QTYAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLCDataSet ds = (SS_L_QTYAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-부수증감 신청(담당) 저장
     * @param dm SS_U_QTYAPLCDM 객체
     * @return SS_U_QTYAPLCDataSet 객체
     * @throws AppException
     */
	public boolean updateQtyaplc(SS_U_QTYAPLCDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_QTYAPLCDataSet ds = (SS_U_QTYAPLCDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}