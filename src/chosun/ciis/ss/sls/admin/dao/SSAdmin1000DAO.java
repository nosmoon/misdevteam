/***************************************************************************************************
* 파일명 : SSAdmin1000DAO.java
* 기능 : 관리자-공통코드,우편번호,판촉코드를 위한 DAO
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-공통코드,우편번호,판촉코드를 위한 DAO
 */

public class SSAdmin1000DAO {
    /**
     * 관리자-공통코드-초기화면
     * @param dm CO_L_CDV_INITDM
     * @return CO_L_CDV_INITDataSet
     * @throws AppException
     */
    public CO_L_CDV_INITDataSet initCode(CO_L_CDV_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        
        java.util.Calendar systime = java.util.Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        sb.append(systime.get(java.util.Calendar.YEAR));
        sb.append("-");
        sb.append(systime.get(java.util.Calendar.MONTH));
        sb.append("-");
        sb.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
        sb.append(" ");
        sb.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
        sb.append(":");
        sb.append(systime.get(java.util.Calendar.MINUTE));
        sb.append(":");
        sb.append(systime.get(java.util.Calendar.SECOND));
        sb.append(".");
        sb.append(systime.get(java.util.Calendar.MILLISECOND));
                        
        System.out.println("=====DAO ENTRY1 TIME======: " + sb.toString());              
        String temp1 =  "\nDAO Entry \t : " + sb.toString();
        
        CO_L_CDV_INITDataSet ds = (CO_L_CDV_INITDataSet) manager.executeCall(dm);
        
        systime = java.util.Calendar.getInstance();
        sb = new StringBuffer();
        sb.append(systime.get(java.util.Calendar.YEAR));
        sb.append("-");
        sb.append(systime.get(java.util.Calendar.MONTH));
        sb.append("-");
        sb.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
        sb.append(" ");
        sb.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
        sb.append(":");
        sb.append(systime.get(java.util.Calendar.MINUTE));
        sb.append(":");
        sb.append(systime.get(java.util.Calendar.SECOND));
        sb.append(".");
        sb.append(systime.get(java.util.Calendar.MILLISECOND));
                        
        System.out.println("=====DAO DONE1 TIME======: " + sb.toString());              
        String temp2 =  "\nDAO Done \t : " + sb.toString();
        
        ds.timeCheck = temp1 + temp2;
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-공통코드-코드구분 목록
     * @param dm CO_L_CDV_CICDGBDM
     * @return CO_L_CDV_CICDGBDataSet
     * @throws AppException
     */
    public CO_L_CDV_CICDGBDataSet selectCodeGBList(CO_L_CDV_CICDGBDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_CDV_CICDGBDataSet ds = (CO_L_CDV_CICDGBDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-공통코드-목록
     * @param dm CO_L_CDVDM
     * @return CO_L_CDVDataSet
     * @throws AppException
     */
    public CO_L_CDVDataSet selectCodeList(CO_L_CDVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_CDVDataSet ds = (CO_L_CDVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-공통코드-상세
     * @param dm CO_S_CDVDM
     * @return CO_S_CDVDataSet
     * @throws AppException
     */
    public CO_S_CDVDataSet selectCodeDetail(CO_S_CDVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_S_CDVDataSet ds = (CO_S_CDVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-공통코드-등록
     * @param dm CO_A_CDVDM
     * @return CO_A_CDVDataSet
     * @throws AppException
     */
    public CO_A_CDVDataSet insertCode(CO_A_CDVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_CDVDataSet ds = (CO_A_CDVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-공통코드-수정
     * @param dm CO_A_CDVDM
     * @return CO_A_CDVDataSet
     * @throws AppException
     */
    public CO_A_CDVDataSet updateCode(CO_A_CDVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_CDVDataSet ds = (CO_A_CDVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-공통코드-삭제
     * @param dm CO_A_CDVDM
     * @return CO_A_CDVDataSet
     * @throws AppException
     */
    public CO_A_CDVDataSet deleteCode(CO_A_CDVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_CDVDataSet ds = (CO_A_CDVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-계정코드-초기화면
     * @param dm SS_L_ACCTCD_INITDM
     * @return SS_L_ACCTCD_INITDataSet
     * @throws AppException
     */
    public SS_L_ACCTCD_INITDataSet initAcctcd(SS_L_ACCTCD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ACCTCD_INITDataSet ds = (SS_L_ACCTCD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-계정코드-목록
     * @param dm SS_L_CDVDM
     * @return SS_L_CDVDataSet
     * @throws AppException
     */
    public SS_L_ACCTCDDataSet selectAcctcdList(SS_L_ACCTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ACCTCDDataSet ds = (SS_L_ACCTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-계정코드-상세
     * @param dm SS_S_ACCTCDDM
     * @return SS_S_ACCTCDDataSet
     * @throws AppException
     */
    public SS_S_ACCTCDDataSet selectAcctcdDetail(SS_S_ACCTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ACCTCDDataSet ds = (SS_S_ACCTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-계정코드-등록
     * @param dm SS_A_ACCTCDDM
     * @return SS_A_ACCTCDDataSet
     * @throws AppException
     */
    public SS_A_ACCTCDDataSet insertAcctcd(SS_A_ACCTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_ACCTCDDataSet ds = (SS_A_ACCTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-계정코드-수정
     * @param dm SS_A_ACCTCDDM
     * @return SS_A_ACCTCDDataSet
     * @throws AppException
     */
    public SS_A_ACCTCDDataSet updateAcctcd(SS_A_ACCTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_ACCTCDDataSet ds = (SS_A_ACCTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-계정코드-삭제
     * @param dm SS_A_ACCTCDDM
     * @return SS_A_ACCTCDDataSet
     * @throws AppException
     */
    public SS_A_ACCTCDDataSet deleteAcctcd(SS_A_ACCTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_ACCTCDDataSet ds = (SS_A_ACCTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-우편번호-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initZip(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-우편번호-목록
     * @param dm SS_L_PSTCDDM
     * @return SS_L_PSTCDDataSet
     * @throws AppException
     */
    public SS_L_PSTCDDataSet selectZipList(SS_L_PSTCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PSTCDDataSet ds = (SS_L_PSTCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-우편번호-상세
     * @param dm SS_L_JUSODM
     * @return SS_L_JUSODataSet
     * @throws AppException
     */
    public SS_L_JUSODataSet selectZipDetail(SS_L_JUSODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_JUSODataSet ds = (SS_L_JUSODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-우편번호-저장
     * @param dm SS_A_JUSODM
     * @return SS_A_JUSODataSet
     * @throws AppException
     */
    public SS_A_JUSODataSet accessZip(SS_A_JUSODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_JUSODataSet ds = (SS_A_JUSODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-판촉코드-목록
     * @param dm SL_L_BNSITEMDM
     * @return SL_L_BNSITEMDataSet
     * @throws AppException
     */
    public SL_L_BNSITEMDataSet selectBNSITEMSP(SL_L_BNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-판촉코드-상세
     * @param dm SL_S_BNSITEMDM
     * @return SL_S_BNSITEMDataSet
     * @throws AppException
     */
    public SL_S_BNSITEMDataSet detailBNSITEMSP(SL_S_BNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_S_BNSITEMDataSet ds = (SL_S_BNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-판촉코드-등록,수정,삭제
     * @param dm SL_A_BNSITEMDM
     * @return SL_A_BNSITEMDataSet
     * @throws AppException
     */
    public SL_A_BNSITEMDataSet actionBNSITEMSP(SL_A_BNSITEMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_A_BNSITEMDataSet ds = (SL_A_BNSITEMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}