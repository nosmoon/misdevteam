/***************************************************************************************************
 * 파일명 : SSBrmgr2000DAO.java
 * 기능 : 지국경영-아파트투입률을 위한 DAO
 * 작성일자 : 2004-11-20
 * 작성자 : 김대섭
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-구독유지 캠페인을을 위한 DAO
 */
public class SSBrmgr2000DAO {

    /**
     * 구독유지 캠페인 리스트
     * @param dm SS_L_CAMPSTATDM
     * @return SS_L_CAMPSTATDataSet
     * @throws AppException
     */
    public SS_L_CAMPSTATDataSet selectlist(SS_L_CAMPSTATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMPSTATDataSet ds = (SS_L_CAMPSTATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 구독유지 캠페인 목록 리스트
     * @param dm CO_L_CAMPINFODM
     * @return CO_L_CAMPINFODataSet
     * @throws AppException
     */
    public CO_L_CAMPINFODataSet campinfolist(CO_L_CAMPINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_CAMPINFODataSet ds = (CO_L_CAMPINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 아파트 투입률 리스트
     * @param dm SS_L_APTDONGUNITTHRWDM
     * @return SS_L_APTDONGUNITTHRWDataSet
     * @throws AppException
     */
    public SS_L_APTDONGUNITTHRWDataSet selectaptlist(SS_L_APTDONGUNITTHRWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDONGUNITTHRWDataSet ds = (SS_L_APTDONGUNITTHRWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 아파트 투입률 등록
     * @param dm SS_U_APTDONGUNITTHRWDM
     * @return SS_U_APTDONGUNITTHRWDataSet
     * @throws AppException
     */
    public SS_U_APTDONGUNITTHRWDataSet updateaptlist(SS_U_APTDONGUNITTHRWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_APTDONGUNITTHRWDataSet ds = (SS_U_APTDONGUNITTHRWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 아파트 투입률 초기조회
     * @param dm SS_L_APTDONGUNITTHRW_INIT1DM
     * @return SS_L_APTDONGUNITTHRW_INIT1DataSet
     * @throws AppException
     */
    public SS_L_APTDONGUNITTHRW_INIT1DataSet aptlistinit1(SS_L_APTDONGUNITTHRW_INIT1DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDONGUNITTHRW_INIT1DataSet ds = (SS_L_APTDONGUNITTHRW_INIT1DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 아파트 투입률 초기조회
     * @param dm SS_L_APTDONGUNITTHRW_INITDM
     * @return SS_L_APTDONGUNITTHRW_INITDataSet
     * @throws AppException
     */
    public SS_L_APTDONGUNITTHRW_INITDataSet aptlistinit(SS_L_APTDONGUNITTHRW_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDONGUNITTHRW_INITDataSet ds = (SS_L_APTDONGUNITTHRW_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국경영-지국부수현황 초기화
     * @param dm SS_L_BOSENDPCOND_INITDM 객체
     * @return SS_L_BOSENDPCOND_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_ABC_INITDataSet selectInitList(SS_L_ABC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ABC_INITDataSet ds = (SS_L_ABC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국경영-지국부수현황 조회
     * @param dm SS_L_BOSENDPCONDDM 객체
     * @return SS_L_BOSENDPCONDDataSet 객체
     * @throws AppException
     */
    public SS_L_ABCDataSet selectBoqtypcondList(SS_L_ABCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ABCDataSet ds = (SS_L_ABCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public ABC_L_AUTHRATIODataSet selectAuthratio(ABC_L_AUTHRATIODM dm) throws AppException {
    	
        DBManager manager = new DBManager("Oracle");
        ABC_L_AUTHRATIODataSet ds = (ABC_L_AUTHRATIODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public ABC_L_ABCWORKCHGDataSet selectAbcworkchg(ABC_L_ABCWORKCHGDM dm) throws AppException {
    	
        DBManager manager = new DBManager("Oracle");
        
        ABC_L_ABCWORKCHGDataSet ds = (ABC_L_ABCWORKCHGDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {        	
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        return ds;
    }
    
    public ABC_L_AUTHRATIODTLDataSet selectAuthratiodtl(ABC_L_AUTHRATIODTLDM dm) throws AppException {
    	
        DBManager manager = new DBManager("Oracle");        
        ABC_L_AUTHRATIODTLDataSet ds = (ABC_L_AUTHRATIODTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
