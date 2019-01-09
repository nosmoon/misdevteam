/***********************************************
 * 함수명   : PSCode1401DAO.java
 * 처리개요 : 코드-지사통합코드 등록, 조회, 수정, 삭제
 * 작성일자 : 2004-02-20
 * 작성자   : 김건호
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
public class PSCode1401DAO {

    /**
     * 지사통합코드관리 초기화면 공통코드목록 조회
     * @param dm PS_S_CMPYBO_INTGDM
     * @return PS_S_CMPYBO_INTGDataSet
     * @throws AppException
     */
    public PS_S_CMPYBO_INTGDataSet selectCombolist(PS_S_CMPYBO_INTGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_CMPYBO_INTGDataSet ds = (PS_S_CMPYBO_INTGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지사통합코드 리스트 조회
     * @param dm PS_L_CMPYBO_INTGDM
     * @return PS_L_CMPYBO_INTGDataSet
     * @throws AppException
     **/
    public PS_L_CMPYBO_INTGDataSet selectCmpybolist(PS_L_CMPYBO_INTGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_CMPYBO_INTGDataSet ds = (PS_L_CMPYBO_INTGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지사통합코드 저장
     * @param dm PS_I_CMPYBO_INTGDM
     * @return boolean
     * @throws AppException
     **/
    public boolean insertCmpybo(PS_I_CMPYBO_INTGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_CMPYBO_INTGDataSet ds = (PS_I_CMPYBO_INTGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }


}
