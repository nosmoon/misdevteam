/***************************************************************************************************
 * 파일명 : SSBrmgr1400DAO.java
 * 기능 : 지국경영-부수증감 신청대행(부수담당)을 위한 DAO
 * 작성일자 : 2004-03-18
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;

/**
 * 지국경영-부수증감 신청대행(부수담당)을 위한 DAO
 */
public class SSBrmgr1400DAO {

    /**
     * 지국경영-부수증감 신청대행(부수담당)을 초기화
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
     * 지국경영-부수증감 신청대행(부수담당)을 조회
     * @param dm SS_L_QTYAPLC_VEXCDM 객체
     * @return SS_L_QTYAPLC_VEXCDataSet 객체
     * @throws AppException
     */
    public SS_L_QTYAPLC_VEXCDataSet selectQtyaplcVexcList(SS_L_QTYAPLC_VEXCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_QTYAPLC_VEXCDataSet ds = (SS_L_QTYAPLC_VEXCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-부수증감 신청대행(부수담당) 저장
     * @param dm SS_A_QTYAPLC_VEXCDM 객체
     * @return SS_A_QTYAPLC_VEXCDataSet 객체
     * @throws AppException
     */
	public boolean updateQtyaplcVexc(SS_A_QTYAPLC_VEXCDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_A_QTYAPLC_VEXCDataSet ds = (SS_A_QTYAPLC_VEXCDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}