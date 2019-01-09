/***************************************************************************************************
 * 파일명 : SSBrinfo1400DAO.java
 * 기능 : 지국Info-지국비품현황-현황을 위한 DAO
 * 작성일자 : 2004-01-27
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-지국비품현황-현황을 위한 DAO
 */
public class SSBrinfo1400DAO {

    /**
     * 지국Info-지국비품현황-현황 초기화
     * @param dm SS_L_ASET_INITDM 객체
     * @return SS_L_ASET_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_ASET_INITDataSet selectInitList(SS_L_ASET_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASET_INITDataSet ds = (SS_L_ASET_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국Info-지국비품현황-현황 조회
     * @param dm SS_L_ASETDM 객체
     * @return SS_L_ASETDataSet 객체
     * @throws AppException
     */
    public SS_L_ASETDataSet selectAsetList(SS_L_ASETDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASETDataSet ds = (SS_L_ASETDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국Info-지국비품현황-상세 조회
     * @param dm SS_L_ASET_DTLDM 객체
     * @return SS_L_ASET_DTLDataSet 객체
     * @throws AppException
     */
    public SS_L_ASET_DTLDataSet selectAsetDetailList(SS_L_ASET_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASET_DTLDataSet ds = (SS_L_ASET_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    /**
     * 지국Info-지국비품현황-상세 상세
     * @param dm SS_S_ASET_DTLDM 객체
     * @return SS_S_ASET_DTLDataSet 객체
     * @throws AppException
     */
    public SS_S_ASET_DTLDataSet selectAsetDetail(SS_S_ASET_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ASET_DTLDataSet ds = (SS_S_ASET_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}