/***********************************************
 * 함수명   : PSSend1401DAO.java
 * 처리개요 : 발송-일일발송처리 등록, 조회, 수정
 * 작성일자 : 2004-03-04
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
 * 발송-일일발송처리 처리프로그램의 등록, 조회, 수정의 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSSend1401DAO {

    /**
     * 일일발송처리 코드관리 초기 Combo Box설정
     * @param dm PS_S_SEND_LUMP_PROCDM
     * @return PS_S_SEND_LUMP_PROCDataSet
     * @throws AppException
     */
    public PS_S_SEND_LUMP_PROCDataSet selectCombolist(PS_S_SEND_LUMP_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 일일발송처리 리스트 조회
     * @param dm PS_L_SEND_DD_PROCDM
     * @return PS_L_SEND_DD_PROCDataSet
     * @throws AppException
     */
    public PS_L_SEND_DD_PROCDataSet selectList(PS_L_SEND_DD_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_DD_PROCDataSet ds = (PS_L_SEND_DD_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 일일발송처리 발송방법별 상세조회
     * @param dm PS_L_SEND_DD_PROC_DTLSDM
     * @return PS_L_SEND_DD_PROC_DTLSDataSet
     * @throws AppException
     */
    public PS_L_SEND_DD_PROC_DTLSDataSet selectMthdList(PS_L_SEND_DD_PROC_DTLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_DD_PROC_DTLSDataSet ds = (PS_L_SEND_DD_PROC_DTLSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 일일발송처리 발송방법별 상세조회
     * @param dm PS_P_SEND_DD_STICKERDM
     * @return PS_P_SEND_DD_STICKERDataSet
     * @throws AppException
     */
    public PS_P_SEND_DD_STICKERDataSet printDdSticker(PS_P_SEND_DD_STICKERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_P_SEND_DD_STICKERDataSet ds = (PS_P_SEND_DD_STICKERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 }