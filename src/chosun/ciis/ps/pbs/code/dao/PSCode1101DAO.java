/***********************************************
 * 함수명   : PSCode1101DAO.java
 * 처리개요 : 코드-단행본코드 등록, 조회, 수정, 삭제
 * 작성일자 : 2004-02-20
 * 작성자   : 장수환
 ***********************************************
 */

package chosun.ciis.ps.pbs.code.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드-단행본코드 처리프로그램의 등록, 조회, 수정, 삭제의 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSCode1101DAO {

    /**
      * 단행본 코드관리 초기 Combo Box설정
      * @param dm PS_S_SEPBK_CODEDM
      * @return PS_S_SEPBK_CODEDataSet
      * @throws AppException
      */
     public PS_S_SEPBK_CODEDataSet selectCombolist(PS_S_SEPBK_CODEDM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         PS_S_SEPBK_CODEDataSet ds = (PS_S_SEPBK_CODEDataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }


    /**
      * 단행본 상세내역 조회
      * @param dm PS_S_SEPBK_INFODM
      * @return PS_S_SEPBK_INFODataSet
      * @throws AppException
      */
     public PS_S_SEPBK_INFODataSet selectSepbkDtl(PS_S_SEPBK_INFODM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         PS_S_SEPBK_INFODataSet ds = (PS_S_SEPBK_INFODataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }


    /**
      * 단행본 코드관리 리스트 조회
      * @param dm PS_L_SEPBK_CODEDM
      * @return PS_L_SEPBK_CODEDataSet
      * @throws AppException
      */
     public PS_L_SEPBK_CODEDataSet selectList(PS_L_SEPBK_CODEDM dm) throws AppException {
         DBManager manager = new DBManager("Oracle");
         PS_L_SEPBK_CODEDataSet ds = (PS_L_SEPBK_CODEDataSet) manager.executeCall(dm);
         if (!"".equals(ds.errcode)) {
             throw new AppException(ds.errcode, ds.errmsg);
         }
         return ds;
     }

    /**
     * 단행본 코드관리 등록
     * @param dm PS_I_SEPBK_CODEDM
     * @return boolean
     * @throws AppException
     */
    public boolean insertSepbkCode(PS_I_SEPBK_CODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_SEPBK_CODEDataSet ds = (PS_I_SEPBK_CODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 단행본 코드관리 수정
     * @param dm PS_U_SEPBK_CODEDM
     * @return boolean
     * @throws AppException
     */
    public boolean updateSepbkCode(PS_U_SEPBK_CODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_SEPBK_CODEDataSet ds = (PS_U_SEPBK_CODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 단행본 코드관리 삭제
     * @param dm PS_D_SEPBK_CODEDM
     * @return boolean
     * @throws AppException
     */
    public boolean deleteSepbkCode(PS_D_SEPBK_CODEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_SEPBK_CODEDataSet ds = (PS_D_SEPBK_CODEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}