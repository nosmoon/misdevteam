/***************************************************************************************************
* 파일명 : SSAdmin1600EJB.java
* 기능 : 관리자-담당별 우편번호 변경처리를 위한 DAO
* 작성일자 : 2009-04-28
* 작성자 : 권정윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dao;

import java.io.*;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-담당별 우편번호 변경처리를 위한 DAO
 */

public class SSAdmin1600DAO {
    /**
     * 관리자-담당별 우편번호 변경처리-초기화면
     * @param dm SS_L_CHGZIPCODE_INITDM
     * @return SS_L_CHGZIPCODE_INITDataSet
     * @throws AppException
     */
    public SS_L_CHGZIPCODE_INITDataSet initZipCode(SS_L_CHGZIPCODE_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CHGZIPCODE_INITDataSet ds = (SS_L_CHGZIPCODE_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-조회
     * @param dm SS_L_CHGZIPCODEDM
     * @return SS_L_CHGZIPCODEDataSet
     * @throws AppException
     */
    public SS_L_CHGZIPCODEDataSet selectZipCode(SS_L_CHGZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CHGZIPCODEDataSet ds = (SS_L_CHGZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-상세조회
     * @param dm SS_S_CHGZIPCODEDM
     * @return SS_S_CHGZIPCODEDataSet
     * @throws AppException
     */
    public SS_S_CHGZIPCODEDataSet detailZipCode(SS_S_CHGZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_CHGZIPCODEDataSet ds = (SS_S_CHGZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-복수조회
     * @param dm SS_S_UNIONCHGZIPCODEDM
     * @return SS_S_UNIONCHGZIPCODEDataSet
     * @throws AppException
     */
    public SS_S_UNIONCHGZIPCODEDataSet unionZipCode(SS_S_UNIONCHGZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_UNIONCHGZIPCODEDataSet ds = (SS_S_UNIONCHGZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-판매국 복사
     * @param dm SS_I_COPYZIPCODEDM
     * @return SS_I_COPYZIPCODEDataSet
     * @throws AppException
     */
    public SS_I_COPYZIPCODEDataSet copyZipCode(SS_I_COPYZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_COPYZIPCODEDataSet ds = (SS_I_COPYZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-삭제
     * @param dm SS_D_CHGZIPCODEDM
     * @return SS_D_CHGZIPCODEDataSet
     * @throws AppException
     */
    public SS_D_CHGZIPCODEDataSet deleteZipCode(SS_D_CHGZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_D_CHGZIPCODEDataSet ds = (SS_D_CHGZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-승인요청
     * @param dm SS_U_CHGZIPCODEDM
     * @return SS_U_CHGZIPCODEDataSet
     * @throws AppException
     */
    public SS_U_CHGZIPCODEDataSet reqZipCode(SS_U_CHGZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_CHGZIPCODEDataSet ds = (SS_U_CHGZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 일괄등록
     * @param dm SS_L_UPLOADZIPCODEDM
     * @return SS_L_UPLOADZIPCODEDataSet
     * @throws AppException
     */
    public SS_L_UPLOADZIPCODEDataSet uploadZipCode(SS_L_UPLOADZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_UPLOADZIPCODEDataSet ds = (SS_L_UPLOADZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-담당별 우편번호 변경처리-하단저장
     * @param dm SS_I_CHGZIPCODEDM
     * @return SS_I_CHGZIPCODEDataSet
     * @throws AppException
     */
    public SS_I_CHGZIPCODEDataSet updateZipCode(SS_I_CHGZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_CHGZIPCODEDataSet ds = (SS_I_CHGZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-마스터 담당별 우편번호 변경처리-초기화면
     * @param dm SS_L_CHGZIPCODE_INITDM
     * @return SS_L_CHGZIPCODE_INITDataSet
     * @throws AppException
     */
    public SS_L_CHGZIPCODE_INITDataSet initMstZip(SS_L_CHGZIPCODE_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CHGZIPCODE_INITDataSet ds = (SS_L_CHGZIPCODE_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    /**
     * 관리자-마스터 담당별 우편번호 변경처리-조회
     * @param dm SS_L_CHGZIPCODE_INITDM
     * @return SS_L_CHGZIPCODE_INITDataSet
     * @throws AppException
     */
    public SS_L_MSTZIPCODEDataSet selectMstZip(SS_L_MSTZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MSTZIPCODEDataSet ds = (SS_L_MSTZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-마스터 담당별 우편번호 변경처리-저장
     * @param dm SS_U_MSTZIPCODEDM
     * @return SS_U_MSTZIPCODEDataSet
     * @throws AppException
     */
    public SS_U_MSTZIPCODEDataSet updateMstZip(SS_U_MSTZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_MSTZIPCODEDataSet ds = (SS_U_MSTZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-마스터 담당별 우편번호 변경처리-승인
     * @param dm SS_U_MSTAPPRZIPCODEDM
     * @return SS_U_MSTAPPRZIPCODEDataSet
     * @throws AppException
     */
    public SS_U_MSTAPPRZIPCODEDataSet apprMstZip(SS_U_MSTAPPRZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_MSTAPPRZIPCODEDataSet ds = (SS_U_MSTAPPRZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-일괄 우편번호 변경처리-조회
     * @param dm SS_L_BATZIPCODEDM
     * @return SS_L_BATZIPCODEDataSet
     * @throws AppException
     */
    public SS_L_BATZIPCODEDataSet selectBatZip(SS_L_BATZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BATZIPCODEDataSet ds = (SS_L_BATZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 관리자-일괄 우편번호 변경처리-일괄적용
     * @param dm SS_U_BATZIPCODEDM
     * @return SS_U_BATZIPCODEDataSet
     * @throws AppException
     */
    public SS_U_BATZIPCODEDataSet updateBatZip(SS_U_BATZIPCODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BATZIPCODEDataSet ds = (SS_U_BATZIPCODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}