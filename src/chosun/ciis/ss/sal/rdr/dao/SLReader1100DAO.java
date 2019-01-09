/**************************************************************************************************
* ���ϸ�    : SLReader1000DAO.java
* ���      : �Ǹ����� ���� ���� ����
* �ۼ�����  : 2003-11-20
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/

package chosun.ciis.ss.sal.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.dao.*;
import chosun.ciis.ss.sal.rdr.ds.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;

/**
 * ����-������������
 */
public class SLReader1100DAO{

    /**
     * ������������(�������� �ʱ�ȭ)
     * @param dm SL_E_READERINIDM
     * @return SL_E_READERINIDataSet
     * @throws AppException
     */
    public SL_E_READERINIDataSet selectCodeList(SL_E_READERINIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_E_READERINIDataSet ds = (SL_E_READERINIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(����(�����߰�))
     * @param dm SL_I_READERDM
     * @return boolean
     * @throws AppException
     */
    public SL_I_READERDataSet insertReader(SL_I_READERDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_I_READERDataSet ds = (SL_I_READERDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���ڸ�ϰ˻�)
     * @param dm SL_L_READERDM
     * @return SL_L_READERDataSet
     * @throws AppException
     */
    public SL_L_READERDataSet selectReaderList(SL_L_READERDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_READERDataSet ds = (SL_L_READERDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���ڻ󼼺���)
     * @param dm SL_S_RDR_INFODM
     * @return SL_S_RDR_INFODataSet
     * @throws AppException
     */
    public SL_S_RDR_INFODataSet selectReaderDetail(SL_S_RDR_INFODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_RDR_INFODataSet ds = (SL_S_RDR_INFODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(������������)
     * @param dm SL_U_READERINFODM
     * @return boolean
     * @throws AppException
     */
    public boolean updateReaderInfo(SL_U_READERINFODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_U_READERINFODataSet ds = (SL_U_READERINFODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return true;
        }
    }

    /**
     * ������������(���������˾�-�������������ȸ)
     * @param dm SL_L_NWSPSUBSCNTRPTCRDM
     * @return SL_L_NWSPSUBSCNTRPTCRDataSet
     * @throws AppException
     */
    public SL_L_NWSPSUBSCNTRPTCRDataSet selectSubsHistoryList(SL_L_NWSPSUBSCNTRPTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_L_NWSPSUBSCNTRPTCRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���������˾�-�޵����������ȸ)
     * @param dm SL_L_VSPTCRDM
     * @return SL_L_VSPTCRDataSet
     * @throws AppException
     */
    public SL_L_VSPTCRDataSet selectStopsHistoryList(SL_L_VSPTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_VSPTCRDataSet ds = (SL_L_VSPTCRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���������˾�-�̻系�������ȸ)
     * @param dm SL_L_MOVM_RDRPTCRDM
     * @return SL_L_MOVM_RDRPTCRDataSet
     * @throws AppException
     */
    public SL_L_MOVM_RDRPTCRDataSet selectMoveHistoryList(SL_L_MOVM_RDRPTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVM_RDRPTCRDataSet ds = (SL_L_MOVM_RDRPTCRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-�����߰������˾�(�ʱ�ȭ��)
     * @param dm SL_L_NWSPSUBSCNTR_INITDM
     * @return SL_L_NWSPSUBSCNTR_INITDataSet
     * @throws AppException
     */
    public SL_L_NWSPSUBSCNTR_INITDataSet initSubsCntr(SL_L_NWSPSUBSCNTR_INITDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_NWSPSUBSCNTR_INITDataSet ds = (SL_L_NWSPSUBSCNTR_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * ������������-�����߰������˾�(�����������ȸ)
     * @param dm SL_L_NWSPSUBSCNTRDM
     * @return SL_L_NWSPSUBSCNTRDataSet
     * @throws AppException
     */
    public SL_L_NWSPSUBSCNTRDataSet selectSubsCntrList(SL_L_NWSPSUBSCNTRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_NWSPSUBSCNTRDataSet ds = (SL_L_NWSPSUBSCNTRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������-�����߰������˾�(����������ȸ)
     * @param dm SL_S_NWSPSUBSCNTRDM
     * @return SL_S_NWSPSUBSCNTRDataSet
     * @throws AppException
     */
    public SL_S_NWSPSUBSCNTRDataSet selectSubsCntrDetail(SL_S_NWSPSUBSCNTRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_NWSPSUBSCNTRDataSet ds = (SL_S_NWSPSUBSCNTRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(������� ���,����)
     * @param dm SL_A_NWSPSUBSCNTRDM
     * @return SL_A_NWSPSUBSCNTRDataSet
     * @throws AppException
     */
    public SL_A_NWSPSUBSCNTRDataSet accessSubsCntr(SL_A_NWSPSUBSCNTRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_NWSPSUBSCNTRDataSet ds = (SL_A_NWSPSUBSCNTRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�Աݳ��������ȸ)
     * @param dm SL_L_RDRCLAMTHSTYDM
     * @return SL_L_RDRCLAMTHSTYDataSet
     * @throws AppException
     */
    public SL_L_RDRCLAMTHSTYDataSet selectRcpmList(SL_L_RDRCLAMTHSTYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_RDRCLAMTHSTYDataSet ds = (SL_L_RDRCLAMTHSTYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�Աݳ����󼼺���)
     * @param dm SL_S_RDR_NWSPCLAMTDM
     * @return SL_S_RDR_NWSPCLAMTDataSet
     * @throws AppException
     */
    public SL_S_RDR_NWSPCLAMTDataSet selectRcpmDetail(SL_S_RDR_NWSPCLAMTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_RDR_NWSPCLAMTDataSet ds = (SL_S_RDR_NWSPCLAMTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�Ա���������)
     * @param dm SL_A_CLAMTRDRDM
     * @return boolean
     * @throws AppException
     */
    public boolean accessRcpm(SL_A_CLAMTRDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_CLAMTRDRDataSet ds = (SL_A_CLAMTRDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return true;
        }
    }

    /**
     * ������������(���ϸ������޳����˾�-�ʱ�ȭ��)
     * @param dm SL_L_MILGPAY_INITDM
     * @return SL_E_READERINIDataSet
     * @throws AppException
     */
    public SL_L_MILGPAY_INITDataSet initMilgPayHistory(SL_L_MILGPAY_INITDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_MILGPAY_INITDataSet ds = (SL_L_MILGPAY_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * ������������(���ϸ������޳����˾�-�����ȸ)
     * @param dm SL_L_MILGPAYDM
     * @return SL_L_MILGPAYDataSet
     * @throws AppException
     */
    public SL_L_MILGPAYDataSet selectMilgPayHistoryList(SL_L_MILGPAYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_MILGPAYDataSet ds = (SL_L_MILGPAYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    /**
     * ������������(���ϸ������޳����˾�-����ȸ)
     * @param dm SL_S_MILGPAYDM
     * @return SL_S_MILGPAYDataSet
     * @throws AppException
     */
    public SL_S_MILGPAYDataSet selectMilgPayHistoryDetail(SL_S_MILGPAYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_MILGPAYDataSet ds = (SL_S_MILGPAYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���ϸ������޳����˾�-���,����,����)
     * @param dm
     * @return
     * @throws AppException
     */
    public SL_A_MILGPAYDataSet accessMilgPayHistory(SL_A_MILGPAYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_MILGPAYDataSet ds = (SL_A_MILGPAYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���������˾�-�ʱ�ȭ��)
     * @param dm CO_L_TAOCC_CDVDM
     * @return ds CO_L_TAOCC_CDVDataSet
     * @throws AppException
     */
    public CO_L_TAOCC_CDVDataSet initDsct(CO_L_TAOCC_CDVDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�����˾�)(�ʱ�ȭ)
     * @param dm SL_E_SUBS_CNTR_STOP_INIDM
     * @return SL_E_SUBS_CNTR_STOP_INIDataSet
     * @throws AppException
     */
    public SL_E_SUBS_CNTR_STOP_INIDataSet selectStopSubsList(SL_E_SUBS_CNTR_STOP_INIDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_E_SUBS_CNTR_STOP_INIDataSet ds = (SL_E_SUBS_CNTR_STOP_INIDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(����ó��)
     * @param dm SL_A_SUBS_CNTR_STOPDM
     * @return ds SL_A_SUBS_CNTR_STOPDataSet
     * @throws AppException
     */
    public SL_A_SUBS_CNTR_STOPDataSet updateStopSubs(SL_A_SUBS_CNTR_STOPDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_SUBS_CNTR_STOPDataSet ds = (SL_A_SUBS_CNTR_STOPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�̻��ΰ��˾�-�ʱ�ȭ��)
     * @param dm SL_L_MOVM_RDR_INIT_01DM
     * @return ds SL_L_MOVM_RDR_INIT_01DataSet
     * @throws AppException
     */
    public SL_L_MOVM_RDR_INIT_01DataSet initMovmTrsf(SL_L_MOVM_RDR_INIT_01DM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVM_RDR_INIT_01DataSet ds = (SL_L_MOVM_RDR_INIT_01DataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���˹����޳����˾�-�����ȸ)
     * @param dm SL_L_BNS_ITEMPAYDM
     * @return SL_L_BNS_ITEMPAYDataSet
     * @throws AppException
     */
    public SL_L_BNS_ITEMPAYDataSet selectBnsItemPayHistoryList(SL_L_BNS_ITEMPAYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_BNS_ITEMPAYDataSet ds = (SL_L_BNS_ITEMPAYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���˹����޳����˾�-����ȸ)
     * @param dm SL_S_BNS_ITEMPAYDM
     * @return SL_S_BNS_ITEMPAYDataSet
     * @throws AppException
     */
    public SL_S_BNS_ITEMPAYDataSet selectBnsItemPayHistoryDetail(SL_S_BNS_ITEMPAYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_S_BNS_ITEMPAYDataSet ds = (SL_S_BNS_ITEMPAYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���˹����޳����˾�-���,����,����)
     * @param dm SL_A_BNS_ITEMPAYDM
     * @return SL_A_BNS_ITEMPAYDataSet
     * @throws AppException
     */
    public SL_A_BNS_ITEMPAYDataSet accessBnsItemPayHistory(SL_A_BNS_ITEMPAYDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_BNS_ITEMPAYDataSet ds = (SL_A_BNS_ITEMPAYDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(��ü��û�˾�-�űԽ�û �ʱ�ȭ)
     * @param dm SL_L_APLC_NEWDM
     * @return ds SL_L_APLC_NEWDataSet
     * @throws AppException
     */
    public SL_L_APLC_NEWDataSet selectAplcNew(SL_L_APLC_NEWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_APLC_NEWDataSet ds = (SL_L_APLC_NEWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(��ü��û�˾�-������û �ʱ�ȭ)
     * @param dm SL_L_APLC_EXPYDM
     * @return ds SL_L_APLC_EXPYDataSet
     * @throws AppException
     */
    public SL_L_APLC_EXPYDataSet selectAplcExpy(SL_L_APLC_EXPYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_APLC_EXPYDataSet ds = (SL_L_APLC_EXPYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(��ü��û�˾�-������û��� �󼼺���)
     * @param dm SL_S_APLC_EXPYDM
     * @return ds SL_S_APLC_EXPYDataSet
     * @throws AppException
     */
    public SL_S_APLC_EXPYDataSet selectAplcDetail(SL_S_APLC_EXPYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_S_APLC_EXPYDataSet ds = (SL_S_APLC_EXPYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(��ü��û�˾�-�ڵ���ü��û �Է�)
     * @param dm SL_I_SHFTAPLCDM
     * @return ds SL_I_SHFTAPLCDataSet
     * @throws AppException
     */
    public SL_I_SHFTAPLCDataSet insertAutoShiftAplc(SL_I_SHFTAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_I_SHFTAPLCDataSet ds = (SL_I_SHFTAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(��ü��û�˾�-�ڵ���ü��û-��ü�������)
     * @param dm SL_U_SHFTMTHDCHGDM
     * @return ds SL_U_SHFTMTHDCHGDataSet
     * @throws AppException
     */
    public SL_U_SHFTMTHDCHGDataSet updateShftMthd(SL_U_SHFTMTHDCHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_U_SHFTMTHDCHGDataSet ds = (SL_U_SHFTMTHDCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���ڸ޸��˾�-��ȸ,���,����,�ʱ�ȭ)
     * @param dm SL_A_RDRMEMODM
     * @return SL_A_RDRMEMODataSet
     * @throws AppException
     */
    public SL_A_RDRMEMODataSet accessRdrMemo(SL_A_RDRMEMODM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_RDRMEMODataSet ds = (SL_A_RDRMEMODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���������˾�-�����ȸ)
     * @param dm SL_L_SUBS_CNTR_STOP_HISTDM
     * @return ds SL_L_SUBS_CNTR_STOP_HISTDataSet
     * @throws AppException
     */
    public SL_L_SUBS_CNTR_STOP_HISTDataSet selectStopHist(SL_L_SUBS_CNTR_STOP_HISTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(���������˾�-�������ó��)
     * @param dm SL_A_SUBS_CNTR_STOP_CANCDM
     * @return ds SL_A_SUBS_CNTR_STOP_CANCDataSet
     * @throws AppException
     */
    public SL_A_SUBS_CNTR_STOP_CANCDataSet cancelStopMulti(SL_A_SUBS_CNTR_STOP_CANCDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_A_SUBS_CNTR_STOP_CANCDataSet ds = (SL_A_SUBS_CNTR_STOP_CANCDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�������ڸ���˾�-�����ȸ)
     * @param dm SL_L_RDR_DUP_CHKDM
     * @return ds SL_L_RDR_DUP_CHKDataSet
     * @throws AppException
     */
    public SL_L_RDR_DUP_CHKDataSet dupChkRdrList(SL_L_RDR_DUP_CHKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_RDR_DUP_CHKDataSet ds = (SL_L_RDR_DUP_CHKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������������(�������ڸ���˾�-�����ȸ)
     * @param dm SL_L_DSCTDM
     * @return ds SL_L_DSCTDataSet
     * @throws AppException
     */
    public SL_L_DSCTDataSet selectDsctList(SL_L_DSCTDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SL_L_DSCTDataSet ds = (SL_L_DSCTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
