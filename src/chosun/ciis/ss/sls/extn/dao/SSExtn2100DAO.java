/***************************************************************************************************
 * 파일명 : SSExtn2100DAO.java
 * 기능 :
 * 작성일자 : 2009-05-20
 * 작성자 : 권정윤
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * 확장현황-본사확장을 위한 DAO
 */
public class SSExtn2100DAO {

    /**
     * 확장현황-중지현황-초기화면
     * @param dm SS_L_EXTN_HDQT_INITDM
     * @return SS_L_EXTN_HDQT_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_HDQT_INITDataSet hdqtInit(SS_L_EXTN_HDQT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_HDQT_INITDataSet ds = (SS_L_EXTN_HDQT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    
    /**
     * 확장현황-중지현황-조회
     * @param dm SS_L_EXTN_HDQTDM
     * @return SS_L_EXTN_HDQTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_HDQTDataSet selecthdqt(SS_L_EXTN_HDQTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_HDQTDataSet ds = (SS_L_EXTN_HDQTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-중지현황-상세조회
     * @param dm SS_S_EXTN_HDQTDM
     * @return SS_S_EXTN_HDQTDataSet
     * @throws AppException
     */
    public SS_S_EXTN_HDQTDataSet detailhdqt(SS_S_EXTN_HDQTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_EXTN_HDQTDataSet ds = (SS_S_EXTN_HDQTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-본사확장-사원확장 계좌정보 업데이트
     * @param dm SS_U_EXTN_HDQTDM
     * @return SS_U_EXTN_HDQTDataSet
     * @throws AppException
     */
    public SS_U_EXTN_HDQTDataSet updatehdqt(SS_U_EXTN_HDQTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_HDQTDataSet ds = (SS_U_EXTN_HDQTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-본사확장- 지역담당자 공지
     * @param dm SS_I_EXTN_HDQT_ALERTDM
     * @return SS_I_EXTN_HDQT_ALERTDataSet
     * @throws AppException
     */
    public SS_I_EXTN_HDQT_ALERTDataSet alerthdqt(SS_I_EXTN_HDQT_ALERTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_HDQT_ALERTDataSet ds = (SS_I_EXTN_HDQT_ALERTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-본사확장- 지역담당자 공지내용
     * @param dm SS_L_EXTN_HDQT_ALERTDM
     * @return SS_L_EXTN_HDQT_ALERTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_HDQT_ALERTDataSet showAlert(SS_L_EXTN_HDQT_ALERTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_HDQT_ALERTDataSet ds = (SS_L_EXTN_HDQT_ALERTDataSet) manager.executeCall(dm);       
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-초기화면
     * @param dm SS_L_EXTN_EDU_INITDM
     * @return SS_L_EXTN_EDU_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_EDU_INITDataSet eduInit(SS_L_EXTN_EDU_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_EDU_INITDataSet ds = (SS_L_EXTN_EDU_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-목록조회
     * @param dm SS_L_EXTN_EDUINSTDM
     * @return SS_L_EXTN_EDUINSTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_EDUINSTDataSet selectEdu(SS_L_EXTN_EDUINSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_EDUINSTDataSet ds = (SS_L_EXTN_EDUINSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-상세조회
     * @param dm SS_S_EXTN_EDURDRDM
     * @return SS_S_EXTN_EDURDRDataSet
     * @throws AppException
     */
    public SS_S_EXTN_EDURDRDataSet detailEdu(SS_S_EXTN_EDURDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_EXTN_EDURDRDataSet ds = (SS_S_EXTN_EDURDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-상세저장
     * @param dm SS_U_EXTN_EDURDRDM
     * @return SS_U_EXTN_EDURDRDataSet
     * @throws AppException
     */
    public SS_U_EXTN_EDURDRDataSet updateEdu(SS_U_EXTN_EDURDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_EDURDRDataSet ds = (SS_U_EXTN_EDURDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-독자등록초기화면
     * @param dm SS_L_EXTN_EDURDR_INITDM
     * @return SS_L_EXTN_EDURDR_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_EDURDR_INITDataSet eduRdrInit(SS_L_EXTN_EDURDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_EDURDR_INITDataSet ds = (SS_L_EXTN_EDURDR_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-독자등록
     * @param dm SS_I_EXTN_EDURDRDM
     * @return SS_I_EXTN_EDURDRDataSet
     * @throws AppException
     */
    public SS_I_EXTN_EDURDRDataSet insertRdr(SS_I_EXTN_EDURDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_EDURDRDataSet ds = (SS_I_EXTN_EDURDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-에듀/제휴현황-기관신규등록
     * @param dm SS_I_EXTN_EDUINSTDM
     * @return SS_I_EXTN_EDUINSTDataSet
     * @throws AppException
     */
    public SS_I_EXTN_EDUINSTDataSet insertInst(SS_I_EXTN_EDUINSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_EDUINSTDataSet ds = (SS_I_EXTN_EDUINSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-사원확장비 관리 초기화면
     * @param dm SS_L_EXTN_COST_INITDM
     * @return SS_L_EXTN_COST_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_COST_INITDataSet costInit(SS_L_EXTN_COST_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_COST_INITDataSet ds = (SS_L_EXTN_COST_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-사원확장비 관리 조회
     * @param dm SS_L_EXTN_COSTDM
     * @return SS_L_EXTN_COSTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_COSTDataSet selectCost(SS_L_EXTN_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_COSTDataSet ds = (SS_L_EXTN_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-사원확장비 관리 신규입력
     * @param dm SS_I_EXTN_COSTDM
     * @return SS_I_EXTN_COSTDataSet
     * @throws AppException
     */
    public SS_I_EXTN_COSTDataSet insertCost(SS_I_EXTN_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_COSTDataSet ds = (SS_I_EXTN_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-단체확장-확장자 업로드
     * @param dm SS_I_EXTN_PATYRDRDM
     * @return SS_I_EXTN_PATYRDRDataSet
     * @throws AppException
     */
    public SS_I_EXTN_PATYRDRDataSet uploadExtn(SS_I_EXTN_PATYRDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_PATYRDRDataSet ds = (SS_I_EXTN_PATYRDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-단체확장-확장자 조회
     * @param dm SS_L_EXTN_PATYDM
     * @return SS_L_EXTN_PATYDataSet
     * @throws AppException
     */
    public SS_L_EXTN_PATYDataSet getUserInfo(SS_L_EXTN_PATYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_PATYDataSet ds = (SS_L_EXTN_PATYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
