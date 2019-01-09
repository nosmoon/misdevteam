/***********************************************
 * 함수명   : PSSend1501DAO.java
 * 처리개요 : 발송-추가발송확인 등록, 조회, 수정
 * 작성일자 : 2004-03-08
 * 작성자   : 장수환
 ***********************************************
 */

package chosun.ciis.ps.pbs.send.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-추가발송확인 처리프로그램의 등록, 조회, 수정의 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSSend1501DAO {

    /**
     * 추가발송확인 코드관리 초기 Combo Box설정
     * @param dm PS_S_SEND_LUMP_CNFMDM
     * @return PS_S_SEND_LUMP_CNFMDataSet
     * @throws AppException
     */
    public PS_S_SEND_LUMP_CNFMDataSet selectCombolist(PS_S_SEND_LUMP_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 추가발송확인 리스트 조회
     * @param dm PS_L_SEND_ADDM_CNFMDM
     * @return PS_L_SEND_ADDM_CNFMDataSet
     * @throws AppException
     */
    public PS_L_SEND_ADDM_CNFMDataSet selectList(PS_L_SEND_ADDM_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_ADDM_CNFMDataSet ds = (PS_L_SEND_ADDM_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 추가발송확인 발송방법별 상세조회
     * @param dm PS_L_SEND_ADDM_MTHD_DTLSDM
     * @return PS_L_SEND_ADDM_MTHD_DTLSDataSet
     * @throws AppException
     */
    public PS_L_SEND_ADDM_MTHD_DTLSDataSet selectMthdList(PS_L_SEND_ADDM_MTHD_DTLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_ADDM_MTHD_DTLSDataSet ds = (PS_L_SEND_ADDM_MTHD_DTLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 추가발송확인 처리
     * @param dm PS_U_SEND_ADDM_CNFMDM
     * @return boolean
     * @throws AppException
     */
    public boolean updateSendcnfm(PS_U_SEND_ADDM_CNFMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_SEND_ADDM_CNFMDataSet ds = (PS_U_SEND_ADDM_CNFMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}