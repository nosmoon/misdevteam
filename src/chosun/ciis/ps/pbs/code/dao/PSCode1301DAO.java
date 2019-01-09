/***********************************************
 * 함수명   : PSCode1301DAO.java
 * 처리개요 : 코드-보너스북 등록, 조회, 수정, 삭제
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
 * 코드-보너스북처리프로그램의 등록, 조회, 수정, 삭제의 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSCode1301DAO {

    /**
     * 보너스북 초기화면 공통코드목록 조회
     * @param dm PS_C_EXCSRCPMPROCDM
     * @return PS_C_EXCSRCPMPROCDataSet
     * @throws AppException
     */
    public PS_S_BNSBK_CDDataSet selectCodelist(PS_S_BNSBK_CDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_BNSBK_CDDataSet ds = (PS_S_BNSBK_CDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보너스북 리스트 조회
     * @param dm PS_L_BNSBKDM
     * @return PS_L_BNSBKDataSet
     * @throws AppException
     **/
    public PS_L_BNSBKDataSet selectBnsbklist(PS_L_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_BNSBKDataSet ds = (PS_L_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보너스북 등록
     * @param dm PS_I_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean insertBnsbk(PS_I_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_BNSBKDataSet ds = (PS_I_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 보너스북 수정
     * @param dm PS_U_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean updateBnsbk(PS_U_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_BNSBKDataSet ds = (PS_U_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 보너스북 삭제
     * @param dm PS_D_BNSBKDM
     * @return boolean
     * @throws AppException
     **/
    public boolean deleteBnsbk(PS_D_BNSBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_BNSBKDataSet ds = (PS_D_BNSBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}
