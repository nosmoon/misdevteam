/***************************************************************************************************
* ���ϸ� : SSAdmin1500EJB.java
* ��� : ������-������������ ���� DAO
* �ۼ����� : 2005-01-28
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dao;

import java.io.*;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������-������������ ���� DAO
 */

public class SSAdmin1500DAO {
    /**
     * ������-����������-�ʱ�ȭ��
     * @param dm SS_L_BOCLOS_INITDM
     * @return SS_L_BOCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_BOCLOS_INITDataSet initBoclos(SS_L_BOCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOCLOS_INITDataSet ds = (SS_L_BOCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-����������-���
     * @param dm SS_L_BOCLOSDM
     * @return SS_L_BOCLOSDataSet
     * @throws AppException
     */
    public SS_L_BOCLOSDataSet selectBoclosList(SS_L_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOCLOSDataSet ds = (SS_L_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-����������-��
     * @param dm SS_S_BOCLOSDM
     * @return SS_S_BOCLOSDataSet
     * @throws AppException
     */
    public SS_S_BOCLOSDataSet selectBoclosDetail(SS_S_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BOCLOSDataSet ds = (SS_S_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-����������-����
     * @param dm SS_A_BOCLOSDM
     * @return SS_A_BOCLOSDataSet
     * @throws AppException
     */
    public SS_A_BOCLOSDataSet closeBoclos(SS_A_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_BOCLOSDataSet ds = (SS_A_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������-����������-�������
     * @param dm SS_A_BOCLOSDM
     * @return SS_A_BOCLOSDataSet
     * @throws AppException
     */
    public SS_A_BOCLOSDataSet closeCancelBoclos(SS_A_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_BOCLOSDataSet ds = (SS_A_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
