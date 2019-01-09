/***********************************************
 * 함수명   : PSCode1501DAO.java
 * 처리개요 : 코드-출판지사계좌관리
 * 작성일자 : 2006-11-09
 * 작성자   : 전현표
 ***********************************************
 */

package chosun.ciis.ps.pbs.code.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드-지사 통합코드프로그램의 등록, 조회, 수정, 삭제의 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSCode1501DAO {

    /**
     * 출판지사계좌관리 초기화면 공통코드목록 조회
     * @param dm PS_L_BOACCTDM
     * @return PS_L_BOACCTDataSet
     * @throws AppException
     */
    public PS_L_BOACCTDataSet selectCombolist(PS_L_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 출판지사계좌관리 리스트 조회
     * @param dm PS_L_BOACCTDM
     * @return PS_L_BOACCTDataSet
     * @throws AppException
     **/
    public PS_L_BOACCTDataSet selectBoacctlist(PS_L_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 출판지사계좌관리 저장/수정/삭제
     * @param dm PS_A_BOACCTDM
     * @return boolean
     * @throws AppException
     **/
    public boolean accessBoacct(PS_A_BOACCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_A_BOACCTDataSet ds = (PS_A_BOACCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
}
