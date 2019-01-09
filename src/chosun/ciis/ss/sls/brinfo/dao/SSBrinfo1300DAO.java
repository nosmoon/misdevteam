/***************************************************************************************************
 * ���ϸ� : SSBrinfo1300DAO.java
 * ��� : ����Info-����������Ȳ�� ���� DAO
 * �ۼ����� : 2004-02-06
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-����������Ȳ�� ���� DAO
 */
public class SSBrinfo1300DAO {

    /**
     * ����Info-����������Ȳ �ʱ�ȭ
     * @param dm SS_L_BOEMP_INITDM ��ü
     * @return SS_L_BOEMP_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOEMP_INITDataSet selectInitList(SS_L_BOEMP_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOEMP_INITDataSet ds = (SS_L_BOEMP_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-����������Ȳ ���
     * @param dm SS_L_BOEMPDM ��ü
     * @return SS_L_BOEMPDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOEMPDataSet selectBoempList(SS_L_BOEMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOEMPDataSet ds = (SS_L_BOEMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-����������Ȳ �󼼸��
     * @param dm SS_L_BOEMP_DTLDM ��ü
     * @return SS_L_BOEMP_DTLDataSet ��ü
     * @throws AppException
     */
    public SS_L_BOEMP_DTLDataSet selectBoempDetailList(SS_L_BOEMP_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOEMP_DTLDataSet ds = (SS_L_BOEMP_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}