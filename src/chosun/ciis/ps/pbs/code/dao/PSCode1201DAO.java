/***********************************************
 * 함수명   : PSCode1201DAO.java
 * 처리개요 : 코드-매체단가 등록, 조회, 수정, 삭제
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
 * 코드-매체단가처리프로그램의 등록, 조회, 수정, 삭제의 업무로직을 프로시저를 호출하여 처리한다.
 */
public class PSCode1201DAO {

    /**
     * 매체단가관리 초기화면 공통코드목록 조회
     * @param dm PS_C_EXCSRCPMPROCDM
     * @return PS_C_EXCSRCPMPROCDataSet
     * @throws AppException
     */
    public PS_S_MEDI_UPRCDataSet selectCombolist(PS_S_MEDI_UPRCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_MEDI_UPRCDataSet ds = (PS_S_MEDI_UPRCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 매체단가관리 리스트 조회
     * @param dm PB_L_EXCSRCPMPROCDM
     * @return PB_L_EXCSRCPMPROCDataSet
     * @throws AppException
     **/
    public PS_L_MIDI_UPRCDataSet selectList(PS_L_MIDI_UPRCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MIDI_UPRCDataSet ds = (PS_L_MIDI_UPRCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 매체단가관리 등록
     * @param dm PS_A_EXCSRCPMPROCDM
     * @return boolean
     * @throws AppException
     **/
    public boolean insertMedipri(PS_I_MIDI_UPRCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_MIDI_UPRCDataSet ds = (PS_I_MIDI_UPRCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 매체단가관리 수정
     * @param dm PS_U_MIDI_UPRCDM
     * @return boolean
     * @throws AppException
     **/
    public boolean updateMedipri(PS_U_MIDI_UPRCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_MIDI_UPRCDataSet ds = (PS_U_MIDI_UPRCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * 매체단가관리 삭제
     * @param dm PS_D_MIDI_UPRCDM
     * @return boolean
     * @throws AppException
     **/
    public boolean deleteMedipri(PS_D_MIDI_UPRCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_MIDI_UPRCDataSet ds = (PS_D_MIDI_UPRCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

}