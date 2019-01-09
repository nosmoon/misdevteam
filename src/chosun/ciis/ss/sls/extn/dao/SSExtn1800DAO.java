/***************************************************************************************************
 * ���ϸ� : SSExtn1800DAO.java
 * ��� : �����濵-���־���Ʈ��Ȳ�� ���� DAO
 * �ۼ����� : 2006-06-01
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * �����濵-���־���Ʈ��Ȳ�� ���� DAO
 */
public class SSExtn1800DAO {

    /**
     * �����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-�ʱ�ȭ��
     * @param dm SL_L_MOVEIN_EXTNDM
     * @return SL_L_MOVEIN_EXTNDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_EXTNDataSet selectMoveinExtnList(SL_L_MOVEIN_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_EXTNDataSet ds = (SL_L_MOVEIN_EXTNDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-��������
     * @param dm SL_L_MOVEIN_EXTN_PRINTDM
     * @return SSL_L_MOVEIN_EXTN_PRINTDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_EXTN_PRINTDataSet selectMoveinExtnListPrint(SL_L_MOVEIN_EXTN_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_EXTN_PRINTDataSet ds = (SL_L_MOVEIN_EXTN_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����濵-���־���Ʈ��Ȳ-���־���Ʈ ��ȸ
     * @param dm SL_L_MOVEIN_APTDM
     * @return SL_L_MOVEIN_APTDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_APTDataSet selectMoveinAptList(SL_L_MOVEIN_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_APTDataSet ds = (SL_L_MOVEIN_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * �����濵-���־���Ʈ��Ȳ-���־���Ʈ ��������
     * @param dm SL_L_MOVEIN_APT_PRINTDM
     * @return SL_L_MOVEIN_APT_PRINTDataSet
     * @throws AppException
     */
    public SL_L_MOVEIN_APT_PRINTDataSet selectMoveinAptPrint(SL_L_MOVEIN_APT_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SL_L_MOVEIN_APT_PRINTDataSet ds = (SL_L_MOVEIN_APT_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �ʱ�ȭ��
     * @param dm SS_L_EXTN_APT_INITDM
     * @return SS_L_EXTN_APT_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_APT_INITDataSet selectInitList(SS_L_EXTN_APT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_APT_INITDataSet ds = (SS_L_EXTN_APT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �������ε�
     * @param dm SS_I_EXTN_APT_UPLOADDM
     * @return SS_I_EXTN_APT_UPLOADDataSet
     * @throws AppException
     */
    public SS_I_EXTN_APT_UPLOADDataSet uploadExcel(SS_I_EXTN_APT_UPLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_APT_UPLOADDataSet ds = (SS_I_EXTN_APT_UPLOADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ��ȸ
     * @param dm SS_L_EXTN_APTDM
     * @return SS_L_EXTN_APTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_APTDataSet selectList(SS_L_EXTN_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_APTDataSet ds = (SS_L_EXTN_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ����
     * @param dm SS_U_EXTN_APT_APPRDM
     * @return SS_U_EXTN_APT_APPRDataSet
     * @throws AppException
     */
    public SS_U_EXTN_APT_APPRDataSet apprList(SS_U_EXTN_APT_APPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_APT_APPRDataSet ds = (SS_U_EXTN_APT_APPRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� �������
     * @param dm SS_U_EXTN_APT_CANCELDM
     * @return SS_U_EXTN_APT_CANCELDataSet
     * @throws AppException
     */
    public SS_U_EXTN_APT_CANCELDataSet cancelList(SS_U_EXTN_APT_CANCELDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_APT_CANCELDataSet ds = (SS_U_EXTN_APT_CANCELDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ����(����)
     * @param dm SS_U_EXTN_APTDM
     * @return SS_U_EXTN_APTDataSet
     * @throws AppException
     */
    public SS_U_EXTN_APTDataSet updateList(SS_U_EXTN_APTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_APTDataSet ds = (SS_U_EXTN_APTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
