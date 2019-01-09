/***************************************************************************************************
* ���ϸ� : SSBrsup1700DAO.java
* ��� : ��������-����-����EDI ���������� DAO
* �ۼ����� : 2004-03-06
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-����-����EDI ���������� ���� DAO
 */

public class SSBrsup1700DAO {
    /**
     * ������������-Billing�ڵ���ü-���γ��� �ʱ�ȭ
     * @param dm SS_L_PYMT_INITDM
     * @return SS_L_PYMT_INITDataSet
     * @throws AppException
     */
    public SS_L_PYMT_INITDataSet selectPymtInit(SS_L_PYMT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PYMT_INITDataSet ds = (SS_L_PYMT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڸ��
     * @param dm SS_L_PYMTDM
     * @return SS_L_PYMTDataSet
     * @throws AppException
     */
    public SS_L_PYMTDataSet selectPymtList(SS_L_PYMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PYMTDataSet ds = (SS_L_PYMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-���ΰ����
     * @param dm SS_L_PYMT_CNTRDM
     * @return SS_L_PYMT_CNTRDataSet
     * @throws AppException
     */
    public SS_L_PYMT_CNTRDataSet selectPymtCntrList(SS_L_PYMT_CNTRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PYMT_CNTRDataSet ds = (SS_L_PYMT_CNTRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-���γ������
     * @param dm SS_L_PYMT_PTCRDM
     * @return SS_L_PYMT_INITDataSet
     * @throws AppException
     */
    public SS_L_PYMT_PTCRDataSet selectPymtPtcrList(SS_L_PYMT_PTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PYMT_PTCRDataSet ds = (SS_L_PYMT_PTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
     * @param dm SS_L_APLC_MANG_INITDM
     * @return SS_L_APLC_MANG_INITDataSet
     * @throws AppException
     */
    public SS_L_APLC_MANG_INITDataSet selectAplcMangInit(SS_L_APLC_MANG_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-��û���
     * @param dm SS_L_APLC_SSUMDM
     * @return SS_L_APLC_SSUMDataSet
     * @throws AppException
     */
    public SS_L_APLC_SSUMDataSet selectAplcSsumList(SS_L_APLC_SSUMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APLC_SSUMDataSet ds = (SS_L_APLC_SSUMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-��û���
     * @param dm SS_L_APLCDM
     * @return SS_L_APLCDataSet
     * @throws AppException
     */
    public SS_L_APLCDataSet selectAplcList(SS_L_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APLCDataSet ds = (SS_L_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ������������-Billing�ڵ���ü-��û����-������(����)����
     * @param dm SS_S_APLCDM
     * @return SS_S_APLCDataSet
     * @throws AppException
     */
    public SS_S_APLCDataSet selectAplcDetail(SS_S_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_APLCDataSet ds = (SS_S_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-������(����)��������
     * @param dm SS_U_APLCINFODM
     * @return SS_U_APLCINFODataSet
     * @throws AppException
     */
    public SS_U_APLCINFODataSet updateAplcInfo(SS_U_APLCINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_APLCINFODataSet ds = (SS_U_APLCINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-���ں� ��ü����Ʈ
     * @param dm SS_L_MEDIDM
     * @return SS_L_MEDIDataSet
     * @throws AppException
     */
    public SS_L_MEDIDataSet selectMediList(SS_L_MEDIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MEDIDataSet ds = (SS_L_MEDIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-��ûȮ��
     * @param dm SS_U_APLCSTATDM
     * @return SS_U_APLCSTATDataSet
     * @throws AppException
     */
    public SS_U_APLCSTATDataSet updateAplc(SS_U_APLCSTATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_APLCSTATDataSet ds = (SS_U_APLCSTATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
     * @param dm SS_L_APLC_NEWDM
     * @return SS_L_APLC_NEWDataSet
     * @throws AppException
     */
    public SS_L_APLC_NEWDataSet selectAplcNew(SS_L_APLC_NEWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APLC_NEWDataSet ds = (SS_L_APLC_NEWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-��û�Է�
     * @param dm SS_I_SHFTAPLCDM
     * @return SS_I_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_I_SHFTAPLCDataSet insertAutoShiftAplc(SS_I_SHFTAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_SHFTAPLCDataSet ds = (SS_I_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�ڵ���ü������û �ʱ�ȭ
     * @param dm SS_L_APLC_EXPYDM
     * @return SS_L_APLC_EXPYDataSet
     * @throws AppException
     */
    public SS_L_APLC_EXPYDataSet selectAplcExpy(SS_L_APLC_EXPYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APLC_EXPYDataSet ds = (SS_L_APLC_EXPYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�ڵ���ü ������û����� �󼼺���
     * @param dm SS_S_APLC_EXPYDM
     * @return SS_S_APLC_EXPYDataSet
     * @throws AppException
     */
    public SS_S_APLC_EXPYDataSet selectAplcDetail2(SS_S_APLC_EXPYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_APLC_EXPYDataSet ds = (SS_S_APLC_EXPYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�ڵ���ü��û �۽�
     * @param dm SS_A_SHFTAPLC_TMSGDM
     * @return SS_A_SHFTAPLC_TMSGDataSet
     * @throws AppException
     */
    public SS_A_SHFTAPLC_TMSGDataSet insertShftAplc(SS_A_SHFTAPLC_TMSGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SHFTAPLC_TMSGDataSet ds = (SS_A_SHFTAPLC_TMSGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�ڵ���ü��û ����
     * @param dm SS_A_SHFTAPLC_RMSGDM
     * @return SS_A_SHFTAPLC_RMSGDataSet
     * @throws AppException
     */
    public SS_A_SHFTAPLC_RMSGDataSet updateShftAplc(SS_A_SHFTAPLC_RMSGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SHFTAPLC_RMSGDataSet ds = (SS_A_SHFTAPLC_RMSGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-��ü�����ȯ
     * @param dm SS_U_SHFTMTHDCHGDM
     * @return SS_U_SHFTMTHDCHGDataSet
     * @throws AppException
     */
    public SS_U_SHFTMTHDCHGDataSet updateShftMthd(SS_U_SHFTMTHDCHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_SHFTMTHDCHGDataSet ds = (SS_U_SHFTMTHDCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û����-�Աݹݿ�
     * @param dm SS_A_AUTOSHFT_RCPMRFLDM
     * @return SS_A_AUTOSHFT_RCPMRFLDataSet
     * @throws AppException
     */
    public SS_A_AUTOSHFT_RCPMRFLDataSet updateRcpmrfl(SS_A_AUTOSHFT_RCPMRFLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_AUTOSHFT_RCPMRFLDataSet ds = (SS_A_AUTOSHFT_RCPMRFLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-�ʱ�ȭ��
     * @param dm SS_L_SHFT_PYMT_INITDM
     * @return SS_L_SHFT_PYMT_INITDataSet
     * @throws AppException
     */
    public SS_L_SHFT_PYMT_INITDataSet selectShftPymtInit(SS_L_SHFT_PYMT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_PYMT_INITDataSet ds = (SS_L_SHFT_PYMT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-�����ڸ��
     * @param dm SS_L_SHFT_PYMTDM
     * @return SS_L_SHFT_PYMTDataSet
     * @throws AppException
     */
    public SS_L_SHFT_PYMTDataSet selectShftPymtList(SS_L_SHFT_PYMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_PYMTDataSet ds = (SS_L_SHFT_PYMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-�����ڻ�
     * @param dm SS_S_SHFT_PYMTDM
     * @return SS_L_SHFT_PYMT_INITDataSet
     * @throws AppException
     */
    public SS_S_SHFT_PYMTDataSet selectShftPymtDetail(SS_S_SHFT_PYMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SHFT_PYMTDataSet ds = (SS_S_SHFT_PYMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-��������������
     * @param dm CO_A_PYMTDM
     * @return CO_A_PYMTDataSet
     * @throws AppException
     */
    public CO_A_PYMTDataSet updatePymtInfo(CO_A_PYMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_A_PYMTDataSet ds = (CO_A_PYMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-��������������(��ü��û ��Ȯ�ΰ�)
     * @param dm SS_U_SHFTAPLCDM
     * @return SS_U_SHFTAPLCDataSet
     * @throws AppException
     */
    public SS_U_SHFTAPLCDataSet updatePymtInfo2(SS_U_SHFTAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_SHFTAPLCDataSet ds = (SS_U_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-�ڵ���ü�ű�/������û
     * @param dm SS_I_SHFTAPLC2DM
     * @return SS_I_SHFTAPLC2DataSet
     * @throws AppException
     */
    public SS_I_SHFTAPLC2DataSet insertPymtShftAplc(SS_I_SHFTAPLC2DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_SHFTAPLC2DataSet ds = (SS_I_SHFTAPLC2DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-���ݳ�����ȸ
     * @param dm SS_L_PYMT_CLAMTDM
     * @return SS_L_PYMT_CLAMTDataSet
     * @throws AppException
     */
    public SS_L_PYMT_CLAMTDataSet selectPymtClamtList(SS_L_PYMT_CLAMTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_PYMT_CLAMTDataSet ds = (SS_L_PYMT_CLAMTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-û��������ȸ
     * @param dm SS_L_SHFT_CLAM_OCOMDM
     * @return SS_L_SHFT_CLAM_OCOMDataSet
     * @throws AppException
     */
    public SS_L_SHFT_CLAM_OCOMDataSet selectPymtClamOcomList(SS_L_SHFT_CLAM_OCOMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_CLAM_OCOMDataSet ds = (SS_L_SHFT_CLAM_OCOMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-���������� �α׳���
     * @param dm SS_L_SHFT_PYMT_LOGDM
     * @return SS_L_SHFT_PYMT_LOGDataSet
     * @throws AppException
     */
    public SS_L_SHFT_PYMT_LOGDataSet selectPymtLogList(SS_L_SHFT_PYMT_LOGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_PYMT_LOGDataSet ds = (SS_L_SHFT_PYMT_LOGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-���ΰ�� �α׳���
     * @param dm SS_L_SHFT_PYMT_CNTR_LOGDM
     * @return SS_L_SHFT_PYMT_CNTR_LOGDataSet
     * @throws AppException
     */
    public SS_L_SHFT_PYMT_CNTR_LOGDataSet selectPymtCntrLogList(SS_L_SHFT_PYMT_CNTR_LOGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_PYMT_CNTR_LOGDataSet ds = (SS_L_SHFT_PYMT_CNTR_LOGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-�����ڰ���-�ű�/�������� �����ȸ
     * @param dm SS_L_APLCDM
     * @return SS_L_APLCDataSet
     * @throws AppException
     */
    public SS_L_APLCDataSet selectPymtShftAplcList(SS_L_APLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APLCDataSet ds = (SS_L_APLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-û���������-������û��������
     * @param dm SS_L_CLAM_SSUMDM
     * @return SS_L_CLAM_SSUMDataSet
     * @throws AppException
     */
    public SS_L_CLAM_SSUMDataSet selectClamList(SS_L_CLAM_SSUMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CLAM_SSUMDataSet ds = (SS_L_CLAM_SSUMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-û���������-�ڵ���üû�������ϰ˻�
     * @param dm SS_L_SHFT_CLAM_OCOM2DM
     * @return SS_L_SHFT_CLAM_OCOM2DataSet
     * @throws AppException
     */
    public SS_L_SHFT_CLAM_OCOM2DataSet selectClamOcomList(SS_L_SHFT_CLAM_OCOM2DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_CLAM_OCOM2DataSet ds = (SS_L_SHFT_CLAM_OCOM2DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
     * @param dm SS_L_APLC_MANG_INITDM
     * @return SS_L_APLC_MANG_INITDataSet
     * @throws AppException
     */
    public SS_S_SHFT_CLAM_INITDataSet selectAplcClamInit(SS_S_SHFT_CLAM_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SHFT_CLAM_INITDataSet ds = (SS_S_SHFT_CLAM_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    

    /**
     * ������������-Billing�ڵ���ü-û������-��ü���к� û�����
     * @param dm SS_S_SHFT_CLAM_SSUMDM
     * @return SS_S_SHFT_CLAM_SSUMDataSet
     * @throws AppException
     */
    public SS_S_SHFT_CLAM_SSUMDataSet selectShftClamSsum(SS_S_SHFT_CLAM_SSUMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_SHFT_CLAM_SSUMDataSet ds = (SS_S_SHFT_CLAM_SSUMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-û������-������ û�����
     * @param dm SS_L_SHFT_CLAMDM
     * @return SS_L_SHFT_CLAMDataSet
     * @throws AppException
     */
    public SS_L_SHFT_CLAMDataSet selectShftClamList(SS_L_SHFT_CLAMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFT_CLAMDataSet ds = (SS_L_SHFT_CLAMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-û������-û������
     * @param dm SS_A_CLAM_CRTEDM
     * @return SS_A_CLAM_CRTEDataSet
     * @throws AppException
     */
    public SS_A_CLAM_CRTEDataSet insertShftClam(SS_A_CLAM_CRTEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_CLAM_CRTEDataSet ds = (SS_A_CLAM_CRTEDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-û������-û���۽�
     * @param dm SS_A_SHFT_CLAM_TMSGDM
     * @return SS_A_SHFT_CLAM_TMSGDataSet
     * @throws AppException
     */
    public SS_A_SHFT_CLAM_TMSGDataSet sendShftClam(SS_A_SHFT_CLAM_TMSGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SHFT_CLAM_TMSGDataSet ds = (SS_A_SHFT_CLAM_TMSGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-û������-û������
     * @param dm SS_A_SHFT_CLAM_RMSGDM
     * @return SS_A_SHFT_CLAM_RMSGDataSet
     * @throws AppException
     */
    public SS_A_SHFT_CLAM_RMSGDataSet receiveShftClam(SS_A_SHFT_CLAM_RMSGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_SHFT_CLAM_RMSGDataSet ds = (SS_A_SHFT_CLAM_RMSGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û���
     * @param dm SS_L_SHFTAPLC_STCSDM
     * @return SS_L_SHFTAPLC_STCSDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLC_STCSDataSet selectAplcStcsList(SS_L_SHFTAPLC_STCSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLC_STCSDataSet ds = (SS_L_SHFTAPLC_STCSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��ûȮ�����
     * @param dm SS_L_SHFTAPLC_CNFM_STCSDM
     * @return SS_L_SHFTAPLC_CNFM_STCSDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLC_CNFM_STCSDataSet selectAplcCnfmStcsList(SS_L_SHFTAPLC_CNFM_STCSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLC_CNFM_STCSDataSet ds = (SS_L_SHFTAPLC_CNFM_STCSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û/�������-�ʱ�ȭ��
     * @param dm SS_L_SHFTAPLCEXPY_STCS_INITDM
     * @return SS_L_SHFTAPLCEXPY_STCS_INITDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLCEXPY_STCS_INITDataSet selectAplcExpyStcsInit(SS_L_SHFTAPLCEXPY_STCS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLCEXPY_STCS_INITDataSet ds = (SS_L_SHFTAPLCEXPY_STCS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��û/�������-�����ȸ
     * @param dm SS_L_SHFTAPLCEXPY_STCSDM
     * @return SS_L_SHFTAPLCEXPY_STCSDataSet
     * @throws AppException
     */
    public SS_L_SHFTAPLCEXPY_STCSDataSet selectAplcExpyStcsList(SS_L_SHFTAPLCEXPY_STCSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTAPLCEXPY_STCSDataSet ds = (SS_L_SHFTAPLCEXPY_STCSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��������-�ʱ�ȭ��
     * @param dm SS_L_SHFTEXPYRDR_INITDM
     * @return SS_L_SHFTEXPYRDR_INITDataSet
     * @throws AppException
     * @throws RemoteException
     */
    public SS_L_SHFTEXPYRDR_INITDataSet selectExpyRdrInit(SS_L_SHFTEXPYRDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTEXPYRDR_INITDataSet ds = (SS_L_SHFTEXPYRDR_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-Billing�ڵ���ü-��������-�����ȸ
     * @param dm SS_L_SHFTEXPYRDRDM
     * @return SS_L_SHFTEXPYRDRDataSet
     * @throws AppException
     * @throws RemoteException
     */
    public SS_L_SHFTEXPYRDRDataSet selectExpyRdrList(SS_L_SHFTEXPYRDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_SHFTEXPYRDRDataSet ds = (SS_L_SHFTEXPYRDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������������-Billing�ڵ���ü-
     * @param dm SS_U_PROCAUTOTRASDM
     * @return SS_U_PROCAUTOTRASDataSet
     * @throws AppException
     * @throws RemoteException
     */
    public SS_U_PROCAUTOTRASDataSet procAutoTrans(SS_U_PROCAUTOTRASDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_PROCAUTOTRASDataSet ds = (SS_U_PROCAUTOTRASDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_BRSUP_1799_LDataSet createBrsup1799(SS_SLS_BRSUP_1799_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_BRSUP_1799_LDataSet ds = (SS_SLS_BRSUP_1799_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
