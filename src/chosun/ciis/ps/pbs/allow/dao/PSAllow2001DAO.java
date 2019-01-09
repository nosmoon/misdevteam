/***************************************************************************************************
 * 함수명   : PSAllow2001DAO.java
 * 처리개요 : 수당-가지급금 화면의 모든 이벤트를 처리
 * 작성일자 : 2004-03-09
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당- 가지급금
 */
public class PSAllow2001DAO {

    /**
     * 가지급금 초기화면
     * @param PS_S_EMP_ALON_BASEDM
     * @return PS_S_EMP_ALON_BASEDataSet
     */
    public PS_S_EMP_ALON_BASEDataSet selectCodeList(PS_S_EMP_ALON_BASEDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_EMP_ALON_BASEDataSet ds = (PS_S_EMP_ALON_BASEDataSet) manager.
            executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 가지급금 조회화면
     * @param PS_L_ALON_RSLTDM
     * @return PS_L_ALON_RSLTDataSet
     */
    public PS_L_ALON_PRSLTDataSet selectRsltList(PS_L_ALON_PRSLTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_ALON_PRSLTDataSet ds = (PS_L_ALON_PRSLTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 가지급금 저장
     * @param PS_A_ALONRSLTDM
     * @return PS_A_ALONRSLTDataSet
     */
    public PS_A_ALONPRSNTDataSet accessAlon(PS_A_ALONPRSNTDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_ALONPRSNTDataSet ds = (PS_A_ALONPRSNTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 가지급금 상세 조회
     * @param PB_S_PAYADVDM
     * @return PB_S_PAYADVDataSet
     */
    public PS_S_PAYADVDataSet select_Payadv_Detail(PS_S_PAYADVDM dm) throws
        AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_PAYADVDataSet ds = (PS_S_PAYADVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

   /* 가지급금 상세 저장/수정
    * @param PB_A_PAYADVDM
    * @return PB_A_PAYADVDataSet
    */
   public PS_A_PAYADVDataSet accessPayadv(PS_A_PAYADVDM dm) throws
       AppException {
       DBManager manager = new DBManager("Oracle");
       PS_A_PAYADVDataSet ds = (PS_A_PAYADVDataSet) manager.executeCall(dm);
       if (!"".equals(ds.errcode)) {
           throw new AppException(ds.errcode, ds.errmsg);
       }
       return ds;
   }
}
