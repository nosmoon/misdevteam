/***************************************************************************************************
 * ���ϸ� : SSReader1400DAO.java
 * ��� : ������Ȳ-VacationStop ����� ���� DAO
 * �ۼ����� : 2004-01-17
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-VacationStop ��븦 ���� DAO
 */
public class SSReader1400DAO {

    /**
     * ������Ȳ-VacationStop ��� �ʱ�ȭ
     * @param dm SS_L_VSCOST_INITDM ��ü
     * @return SS_L_VSCOST_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_VSCOST_INITDataSet selectInitList(SS_L_VSCOST_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCOST_INITDataSet ds = (SS_L_VSCOST_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������Ȳ-VacationStop ��� �ް����ڵ�, �ڵ�� ��ȸ
     * @param dm SS_L_VSCD_AREANMDM ��ü
     * @return SS_L_VSCD_AREANMDataSet ��ü
     * @throws AppException
     */
    public SS_L_VSCD_AREANMDataSet selectVacaAreaList(SS_L_VSCD_AREANMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCD_AREANMDataSet ds = (SS_L_VSCD_AREANMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    /**
     * ������Ȳ-VacationStop ��� ��ȸ
     * @param dm SS_L_VSCOST_COSTDM ��ü
     * @return SS_L_VSCOST_COSTDataSet ��ü
     * @throws AppException
     */
    public SS_L_VSCOST_COSTDataSet selectVscostList(SS_L_VSCOST_COSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCOST_COSTDataSet ds = (SS_L_VSCOST_COSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}