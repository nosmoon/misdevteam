/***************************************************************************************************
 * ���ϸ� : SSExtn3200DAO.java
 * ��� : Ȯ�����ǰ��� DAO
 * �ۼ����� : 2015-03-13
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
 * Ȯ�����ǰ��� DAO
 */
public class SSExtn3200DAO {

    /**
     * Ȯ�����ǰ���-�ʱ�ȭ��
     * @param dm SS_L_EXCD_INITDM
     * @return SS_L_EXCD_INITDataSet
     * @throws AppException
     */
    public SS_L_EXCD_INITDataSet selectExtnCondInit(SS_L_EXCD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXCD_INITDataSet ds = (SS_L_EXCD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * Ȯ�����ǰ���-���
     * @param dm SS_L_EXCDDM
     * @return SS_L_EXCDDataSet
     * @throws AppException
     */
    public SS_L_EXCDDataSet selectExtnCondList(SS_L_EXCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXCDDataSet ds = (SS_L_EXCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * Ȯ�����ǰ���-����
     * @param dm SS_L_EXCDDM
     * @return SS_L_EXCDDataSet
     * @throws AppException
     */
    public SS_U_EXCD_APPRDataSet apprExtnCond(SS_U_EXCD_APPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXCD_APPRDataSet ds = (SS_U_EXCD_APPRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_EXCD_APPRREJDataSet apprRejExtnCond(SS_U_EXCD_APPRREJDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXCD_APPRREJDataSet ds = (SS_U_EXCD_APPRREJDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_EXCD_DELDataSet delExtnCond(SS_U_EXCD_DELDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_EXCD_DELDataSet ds = (SS_U_EXCD_DELDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
