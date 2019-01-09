/***************************************************************************************************
 * ���ϸ� : SSReader1200DAO.java
 * ��� : ������Ȳ-VacationStop ��û�� ���� DAO
 * �ۼ����� : 2004-01-12
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
 * ������Ȳ-VacationStop ��û�� ���� DAO
 */
public class SSReader1200DAO {

    /**
     * ������Ȳ-VacationStop ��û �ʱ�ȭ
     * @param dm SS_L_VS_INITDM ��ü
     * @return SS_L_VS_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_VS_INITDataSet selectInitList(SS_L_VS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VS_INITDataSet ds = (SS_L_VS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-VacationStop ��û ��ȸ
     * @param dm SS_L_VSDM ��ü
     * @return SS_L_VSDataSet ��ü
     * @throws AppException
     */
    public SS_L_VSDataSet selectVsList(SS_L_VSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSDataSet ds = (SS_L_VSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������Ȳ-VacationStop ��û ��
     * @param dm SS_S_VSDM ��ü
     * @return SS_S_VSDataSet ��ü
     * @throws AppException
     */
    public SS_S_VSDataSet selectVsDetail(SS_S_VSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_VSDataSet ds = (SS_S_VSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}