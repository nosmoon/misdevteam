/***************************************************************************************************
 * 파일명 : SSExtn1800DAO.java
 * 기능 : 지국경영-입주아파트현황을 위한 DAO
 * 작성일자 : 2006-06-01
 * 작성자 : 이혁
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
 * 지국경영-입주아파트현황을 위한 DAO
 */
public class SSExtn1800DAO {

    /**
     * 지국경영-입주아파트현황-입주팀확장현황-초기화면
     * @param dm SL_L_MOVEIN_EXTNDM
     * @return SL_L_MOVEIN_EXTNDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_EXTNDataSet selectMoveinExtnList(SL_L_MOVEIN_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_EXTNDataSet ds = (SL_L_MOVEIN_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-입주아파트현황-입주팀확장현황-엑셀저장
     * @param dm SL_L_MOVEIN_EXTN_PRINTDM
     * @return SSL_L_MOVEIN_EXTN_PRINTDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_EXTN_PRINTDataSet selectMoveinExtnListPrint(SL_L_MOVEIN_EXTN_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_EXTN_PRINTDataSet ds = (SL_L_MOVEIN_EXTN_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-입주아파트현황-입주아파트 조회
     * @param dm SL_L_MOVEIN_APTDM
     * @return SL_L_MOVEIN_APTDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_APTDataSet selectMoveinAptList(SL_L_MOVEIN_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_APTDataSet ds = (SL_L_MOVEIN_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 지국경영-입주아파트현황-입주아파트 엑셀저장
     * @param dm SL_L_MOVEIN_APT_PRINTDM
     * @return SL_L_MOVEIN_APT_PRINTDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_APT_PRINTDataSet selectMoveinAptPrint(SL_L_MOVEIN_APT_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_APT_PRINTDataSet ds = (SL_L_MOVEIN_APT_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-입주아파트관리-입주아파트관리 초기화면
     * @param dm SS_L_EXTN_APT_INITDM
     * @return SS_L_EXTN_APT_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_APT_INITDataSet selectInitList(SS_L_EXTN_APT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_APT_INITDataSet ds = (SS_L_EXTN_APT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-입주아파트관리-입주아파트관리 엑셀업로드
     * @param dm SS_I_EXTN_APT_UPLOADDM
     * @return SS_I_EXTN_APT_UPLOADDataSet
     * @throws AppException
     */
    public SS_I_EXTN_APT_UPLOADDataSet uploadExcel(SS_I_EXTN_APT_UPLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_APT_UPLOADDataSet ds = (SS_I_EXTN_APT_UPLOADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-입주아파트관리-입주아파트관리 조회
     * @param dm SS_L_EXTN_APTDM
     * @return SS_L_EXTN_APTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_APTDataSet selectList(SS_L_EXTN_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_APTDataSet ds = (SS_L_EXTN_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-입주아파트관리-입주아파트관리 승인
     * @param dm SS_U_EXTN_APT_APPRDM
     * @return SS_U_EXTN_APT_APPRDataSet
     * @throws AppException
     */
    public SS_U_EXTN_APT_APPRDataSet apprList(SS_U_EXTN_APT_APPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_APT_APPRDataSet ds = (SS_U_EXTN_APT_APPRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-입주아파트관리-입주아파트관리 승인취소
     * @param dm SS_U_EXTN_APT_CANCELDM
     * @return SS_U_EXTN_APT_CANCELDataSet
     * @throws AppException
     */
    public SS_U_EXTN_APT_CANCELDataSet cancelList(SS_U_EXTN_APT_CANCELDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_APT_CANCELDataSet ds = (SS_U_EXTN_APT_CANCELDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-입주아파트관리-입주아파트관리 저장(수정)
     * @param dm SS_U_EXTN_APTDM
     * @return SS_U_EXTN_APTDataSet
     * @throws AppException
     */
    public SS_U_EXTN_APTDataSet updateList(SS_U_EXTN_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_APTDataSet ds = (SS_U_EXTN_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
