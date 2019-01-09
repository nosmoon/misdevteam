/***************************************************************************************************
 * ���ϸ� : SSBrmgr2000DAO.java
 * ��� : �����濵-����Ʈ���Է��� ���� DAO
 * �ۼ����� : 2004-11-20
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
 
package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �����濵-�������� ķ�������� ���� DAO
 */
public class SSBrmgr2000DAO {

    /**
     * �������� ķ���� ����Ʈ
     * @param dm SS_L_CAMPSTATDM
     * @return SS_L_CAMPSTATDataSet
     * @throws AppException
     */
    public SS_L_CAMPSTATDataSet selectlist(SS_L_CAMPSTATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMPSTATDataSet ds = (SS_L_CAMPSTATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �������� ķ���� ��� ����Ʈ
     * @param dm CO_L_CAMPINFODM
     * @return CO_L_CAMPINFODataSet
     * @throws AppException
     */
    public CO_L_CAMPINFODataSet campinfolist(CO_L_CAMPINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        CO_L_CAMPINFODataSet ds = (CO_L_CAMPINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Ʈ ���Է� ����Ʈ
     * @param dm SS_L_APTDONGUNITTHRWDM
     * @return SS_L_APTDONGUNITTHRWDataSet
     * @throws AppException
     */
    public SS_L_APTDONGUNITTHRWDataSet selectaptlist(SS_L_APTDONGUNITTHRWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDONGUNITTHRWDataSet ds = (SS_L_APTDONGUNITTHRWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Ʈ ���Է� ���
     * @param dm SS_U_APTDONGUNITTHRWDM
     * @return SS_U_APTDONGUNITTHRWDataSet
     * @throws AppException
     */
    public SS_U_APTDONGUNITTHRWDataSet updateaptlist(SS_U_APTDONGUNITTHRWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_APTDONGUNITTHRWDataSet ds = (SS_U_APTDONGUNITTHRWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Ʈ ���Է� �ʱ���ȸ
     * @param dm SS_L_APTDONGUNITTHRW_INIT1DM
     * @return SS_L_APTDONGUNITTHRW_INIT1DataSet
     * @throws AppException
     */
    public SS_L_APTDONGUNITTHRW_INIT1DataSet aptlistinit1(SS_L_APTDONGUNITTHRW_INIT1DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDONGUNITTHRW_INIT1DataSet ds = (SS_L_APTDONGUNITTHRW_INIT1DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Ʈ ���Է� �ʱ���ȸ
     * @param dm SS_L_APTDONGUNITTHRW_INITDM
     * @return SS_L_APTDONGUNITTHRW_INITDataSet
     * @throws AppException
     */
    public SS_L_APTDONGUNITTHRW_INITDataSet aptlistinit(SS_L_APTDONGUNITTHRW_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_APTDONGUNITTHRW_INITDataSet ds = (SS_L_APTDONGUNITTHRW_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �����濵-�����μ���Ȳ �ʱ�ȭ
     * @param dm SS_L_BOSENDPCOND_INITDM ��ü
     * @return SS_L_BOSENDPCOND_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_ABC_INITDataSet selectInitList(SS_L_ABC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ABC_INITDataSet ds = (SS_L_ABC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �����濵-�����μ���Ȳ ��ȸ
     * @param dm SS_L_BOSENDPCONDDM ��ü
     * @return SS_L_BOSENDPCONDDataSet ��ü
     * @throws AppException
     */
    public SS_L_ABCDataSet selectBoqtypcondList(SS_L_ABCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ABCDataSet ds = (SS_L_ABCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public ABC_L_AUTHRATIODataSet selectAuthratio(ABC_L_AUTHRATIODM dm) throws AppException {
    	
        DBManager manager = new DBManager("Oracle");
        ABC_L_AUTHRATIODataSet ds = (ABC_L_AUTHRATIODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public ABC_L_ABCWORKCHGDataSet selectAbcworkchg(ABC_L_ABCWORKCHGDM dm) throws AppException {
    	
        DBManager manager = new DBManager("Oracle");
        
        ABC_L_ABCWORKCHGDataSet ds = (ABC_L_ABCWORKCHGDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {        	
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        return ds;
    }
    
    public ABC_L_AUTHRATIODTLDataSet selectAuthratiodtl(ABC_L_AUTHRATIODTLDM dm) throws AppException {
    	
        DBManager manager = new DBManager("Oracle");        
        ABC_L_AUTHRATIODTLDataSet ds = (ABC_L_AUTHRATIODTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
