/***********************************************
 * �Լ���   : PSCode1201DAO.java
 * ó������ : �ڵ�-��ü�ܰ� ���, ��ȸ, ����, ����
 * �ۼ����� : 2004-02-20
 * �ۼ���   : ���ȯ
 ***********************************************
 */

package chosun.ciis.ps.pbs.code.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.dao.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * �ڵ�-��ü�ܰ�ó�����α׷��� ���, ��ȸ, ����, ������ ���������� ���ν����� ȣ���Ͽ� ó���Ѵ�.
 */
public class PSCode1201DAO {

    /**
     * ��ü�ܰ����� �ʱ�ȭ�� �����ڵ��� ��ȸ
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
     * ��ü�ܰ����� ����Ʈ ��ȸ
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
     * ��ü�ܰ����� ���
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
     * ��ü�ܰ����� ����
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
     * ��ü�ܰ����� ����
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