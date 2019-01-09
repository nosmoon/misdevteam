/***************************************************************************************************
 * 파일명 : SSBrinfo1100DAO.java
 * 기능 : 지국Info-지국현황을 위한 DAO
 * 작성일자 : 2004-02-09
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
import chosun.ciis.ss.sls.rdr.dm.SS_L_READER_BOINFO_INITDM;
import chosun.ciis.ss.sls.rdr.ds.SS_L_READER_BOINFO_INITDataSet;

/**
 * 지국Info-지국현황을 위한 DAO
 */
public class SSBrinfo1100DAO {

    /**
     * 지국Info-지국현황 초기화
     * @param dm SS_L_BOINFO_INITDM 객체
     * @return SS_L_BOINFO_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_BOINFO_INITDataSet selectInitList(SS_L_BOINFO_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOINFO_INITDataSet ds = (SS_L_BOINFO_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국현황 조회
     * @param dm SS_L_BOINFODM 객체
     * @return SS_L_BOINFODataSet 객체
     * @throws AppException
     */
    public SS_L_BOINFODataSet selectBoinfoList(SS_L_BOINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOINFODataSet ds = (SS_L_BOINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국현황-상세
     * @param dm SS_S_BOINFODM 객체
     * @return SS_S_BOINFODataSet 객체
     * @throws AppException
     */
    public SS_S_BOINFODataSet selectBoinfoDetail(SS_S_BOINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BOINFODataSet ds = (SS_S_BOINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 초기화면
     * @param dm SS_L_BOACCT_INITDM 객체
     * @return SS_L_BOACCT_INITDataSet 객체
     * @throws AppException
     */  
    public SS_L_BOACCT_INITDataSet selectBoAcctInit(SS_L_BOACCT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOACCT_INITDataSet ds = (SS_L_BOACCT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 조회
     * @param dm SS_L_BOACCTDM 객체
     * @return SS_L_BOACCTDataSet 객체
     * @throws AppException
     */
    public SS_L_BOACCT_LISTDataSet selectBoAcctList(SS_L_BOACCT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 수정
     * @param dm SS_U_BOACCTDM 객체
     * @return SS_U_BOACCTDataSet 객체
     * @throws AppException
     */
    public SS_U_BOACCTDataSet updateBoAcctItem(SS_U_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BOACCTDataSet ds = (SS_U_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 삭제
     * @param dm SS_D_BOACCTDM 객체
     * @return SS_D_BOACCTDataSet 객체
     * @throws AppException
     */
    public SS_D_BOACCTDataSet deleteBoAcctItem(SS_D_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_D_BOACCTDataSet ds = (SS_D_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 등록
     * @param dm SS_I_BOACCTDM 객체
     * @return SS_I_BOACCTDataSet 객체
     * @throws AppException
     */
    public SS_I_BOACCTDataSet insertBoAcctItem(SS_I_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_BOACCTDataSet ds = (SS_I_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 히스토리조회 20150922 장선희
     * @param dm SS_S_BOACCT_LISTDM 객체
     * @return SS_S_BOACCT_LISTDataSet 객체
     * @throws AppException
     */
    public SS_S_BOACCT_LISTDataSet histBoAcctList(SS_S_BOACCT_LISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BOACCT_LISTDataSet ds = (SS_S_BOACCT_LISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국계좌관리(실시간계좌이체) 담당확인 20170919 심정보
     * @param dm SS_U_BOACCT_CNFMDM 객체
     * @return SS_U_BOACCT_CNFMDataSet 객체
     * @throws AppException
     */
    public SS_U_BOACCT_CNFMDataSet cnfmBoAcctItem(SS_U_BOACCT_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_BOACCT_CNFMDataSet ds = (SS_U_BOACCT_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
