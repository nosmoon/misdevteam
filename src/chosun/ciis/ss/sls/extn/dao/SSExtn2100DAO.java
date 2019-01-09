/***************************************************************************************************
 * ���ϸ� : SSExtn2100DAO.java
 * ��� :
 * �ۼ����� : 2009-05-20
 * �ۼ��� : ������
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
 * Ȯ����Ȳ-����Ȯ���� ���� DAO
 */
public class SSExtn2100DAO {

    /**
     * Ȯ����Ȳ-������Ȳ-�ʱ�ȭ��
     * @param dm SS_L_EXTN_HDQT_INITDM
     * @return SS_L_EXTN_HDQT_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_HDQT_INITDataSet hdqtInit(SS_L_EXTN_HDQT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_HDQT_INITDataSet ds = (SS_L_EXTN_HDQT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    
    /**
     * Ȯ����Ȳ-������Ȳ-��ȸ
     * @param dm SS_L_EXTN_HDQTDM
     * @return SS_L_EXTN_HDQTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_HDQTDataSet selecthdqt(SS_L_EXTN_HDQTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_HDQTDataSet ds = (SS_L_EXTN_HDQTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-������Ȳ-����ȸ
     * @param dm SS_S_EXTN_HDQTDM
     * @return SS_S_EXTN_HDQTDataSet
     * @throws AppException
     */
    public SS_S_EXTN_HDQTDataSet detailhdqt(SS_S_EXTN_HDQTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_EXTN_HDQTDataSet ds = (SS_S_EXTN_HDQTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����Ȯ��-���Ȯ�� �������� ������Ʈ
     * @param dm SS_U_EXTN_HDQTDM
     * @return SS_U_EXTN_HDQTDataSet
     * @throws AppException
     */
    public SS_U_EXTN_HDQTDataSet updatehdqt(SS_U_EXTN_HDQTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_HDQTDataSet ds = (SS_U_EXTN_HDQTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����Ȯ��- ��������� ����
     * @param dm SS_I_EXTN_HDQT_ALERTDM
     * @return SS_I_EXTN_HDQT_ALERTDataSet
     * @throws AppException
     */
    public SS_I_EXTN_HDQT_ALERTDataSet alerthdqt(SS_I_EXTN_HDQT_ALERTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_HDQT_ALERTDataSet ds = (SS_I_EXTN_HDQT_ALERTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����Ȯ��- ��������� ��������
     * @param dm SS_L_EXTN_HDQT_ALERTDM
     * @return SS_L_EXTN_HDQT_ALERTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_HDQT_ALERTDataSet showAlert(SS_L_EXTN_HDQT_ALERTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_HDQT_ALERTDataSet ds = (SS_L_EXTN_HDQT_ALERTDataSet) manager.executeCall(dm);       
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-�ʱ�ȭ��
     * @param dm SS_L_EXTN_EDU_INITDM
     * @return SS_L_EXTN_EDU_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_EDU_INITDataSet eduInit(SS_L_EXTN_EDU_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_EDU_INITDataSet ds = (SS_L_EXTN_EDU_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-�����ȸ
     * @param dm SS_L_EXTN_EDUINSTDM
     * @return SS_L_EXTN_EDUINSTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_EDUINSTDataSet selectEdu(SS_L_EXTN_EDUINSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_EDUINSTDataSet ds = (SS_L_EXTN_EDUINSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-����ȸ
     * @param dm SS_S_EXTN_EDURDRDM
     * @return SS_S_EXTN_EDURDRDataSet
     * @throws AppException
     */
    public SS_S_EXTN_EDURDRDataSet detailEdu(SS_S_EXTN_EDURDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_EXTN_EDURDRDataSet ds = (SS_S_EXTN_EDURDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-������
     * @param dm SS_U_EXTN_EDURDRDM
     * @return SS_U_EXTN_EDURDRDataSet
     * @throws AppException
     */
    public SS_U_EXTN_EDURDRDataSet updateEdu(SS_U_EXTN_EDURDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXTN_EDURDRDataSet ds = (SS_U_EXTN_EDURDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-���ڵ���ʱ�ȭ��
     * @param dm SS_L_EXTN_EDURDR_INITDM
     * @return SS_L_EXTN_EDURDR_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_EDURDR_INITDataSet eduRdrInit(SS_L_EXTN_EDURDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_EDURDR_INITDataSet ds = (SS_L_EXTN_EDURDR_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-���ڵ��
     * @param dm SS_I_EXTN_EDURDRDM
     * @return SS_I_EXTN_EDURDRDataSet
     * @throws AppException
     */
    public SS_I_EXTN_EDURDRDataSet insertRdr(SS_I_EXTN_EDURDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_EDURDRDataSet ds = (SS_I_EXTN_EDURDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-����/������Ȳ-����űԵ��
     * @param dm SS_I_EXTN_EDUINSTDM
     * @return SS_I_EXTN_EDUINSTDataSet
     * @throws AppException
     */
    public SS_I_EXTN_EDUINSTDataSet insertInst(SS_I_EXTN_EDUINSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_EDUINSTDataSet ds = (SS_I_EXTN_EDUINSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���Ȯ��� ���� �ʱ�ȭ��
     * @param dm SS_L_EXTN_COST_INITDM
     * @return SS_L_EXTN_COST_INITDataSet
     * @throws AppException
     */
    public SS_L_EXTN_COST_INITDataSet costInit(SS_L_EXTN_COST_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_COST_INITDataSet ds = (SS_L_EXTN_COST_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���Ȯ��� ���� ��ȸ
     * @param dm SS_L_EXTN_COSTDM
     * @return SS_L_EXTN_COSTDataSet
     * @throws AppException
     */
    public SS_L_EXTN_COSTDataSet selectCost(SS_L_EXTN_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_COSTDataSet ds = (SS_L_EXTN_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-���Ȯ��� ���� �ű��Է�
     * @param dm SS_I_EXTN_COSTDM
     * @return SS_I_EXTN_COSTDataSet
     * @throws AppException
     */
    public SS_I_EXTN_COSTDataSet insertCost(SS_I_EXTN_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_COSTDataSet ds = (SS_I_EXTN_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-��üȮ��-Ȯ���� ���ε�
     * @param dm SS_I_EXTN_PATYRDRDM
     * @return SS_I_EXTN_PATYRDRDataSet
     * @throws AppException
     */
    public SS_I_EXTN_PATYRDRDataSet uploadExtn(SS_I_EXTN_PATYRDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_PATYRDRDataSet ds = (SS_I_EXTN_PATYRDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ����Ȳ-��üȮ��-Ȯ���� ��ȸ
     * @param dm SS_L_EXTN_PATYDM
     * @return SS_L_EXTN_PATYDataSet
     * @throws AppException
     */
    public SS_L_EXTN_PATYDataSet getUserInfo(SS_L_EXTN_PATYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_PATYDataSet ds = (SS_L_EXTN_PATYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
